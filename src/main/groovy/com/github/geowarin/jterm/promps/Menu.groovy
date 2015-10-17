package com.github.geowarin.jterm.promps

import com.github.geowarin.jterm.Keys
import jline.console.ConsoleReader

import static org.fusesource.jansi.Ansi.ansi

class Menu extends BasePrompt {
    private String[] items
    int selected = 0

    Menu(String... items) {
        this.items = items
    }

    void render(ConsoleReader reader) {
        display(reader)

        int c;
        while ((c = reader.readCharacter()) != null) {
            if (c == Keys.DOWN) {
                decSelected()
            }
            if (c == Keys.UP) {
                incSelected()
            }

            if (c == Keys.ENTER) {
                break;
            }

            display(reader)
        }
    }


    void display(ConsoleReader reader) {
        reader.clearScreen()
        items.eachWithIndex { String item, int index ->
            if (selected == index) {
                reader.out << ansi().render("@|red -> $item|@\n")
            } else {
                reader.out << '   ' + item + '\n'
            }
        }
        reader.out.flush()
    }

    String getResult() {
        items[selected]
    }

    void incSelected() {
        selected++
        selected = selected >= items.size() ? 0 : selected
    }

    void decSelected() {
        selected--
        selected = selected < 0 ? items.size() - 1 : selected
    }
}