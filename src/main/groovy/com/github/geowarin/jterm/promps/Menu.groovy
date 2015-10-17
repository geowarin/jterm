package com.github.geowarin.jterm.promps

import com.github.geowarin.jterm.JTerm
import com.github.geowarin.jterm.Keys

import static org.fusesource.jansi.Ansi.Color.RED

class Menu extends BasePrompt {
    private String[] items
    int selected = 0

    Menu(String... items) {
        this.items = items
    }

    void render() {
        display()

        int c;
        while ((c = JTerm.readCharacter()) != null) {
            if (c == Keys.DOWN) {
                decSelected()
            }
            if (c == Keys.UP) {
                incSelected()
            }

            if (c == Keys.ENTER) {
                break;
            }

            display(true)
        }
    }


    void display(clear = false) {
        if (clear) {
            JTerm.clearLines(items.size())
        }
        items.eachWithIndex { String item, int index ->
            if (selected == index) {
                JTerm.print("-> $item", RED)
            } else {
                JTerm.print("   $item")
            }
        }
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