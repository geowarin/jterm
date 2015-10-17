package com.github.geowarin.jterm.prompts

import com.github.geowarin.jterm.JTerm
import com.github.geowarin.jterm.Keys

import static org.fusesource.jansi.Ansi.Color.RED

class Menu implements Prompt {
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
                decrementSelected()
            }
            if (c == Keys.UP) {
                incrementSelected()
            }

            if (c == Keys.ENTER) {
                break;
            }

            display(true)
        }
    }

    private void display(clear = false) {
        if (clear) {
            JTerm.clearLines(items.size())
        }
        items.eachWithIndex { String item, int index ->
            if (selected == index) {
                JTerm.println("-> $item", RED)
            } else {
                JTerm.println("   $item")
            }
        }
    }

    String getResult() {
        items[selected]
    }

    private void incrementSelected() {
        selected++
        selected = selected >= items.size() ? 0 : selected
    }

    private void decrementSelected() {
        selected--
        selected = selected < 0 ? items.size() - 1 : selected
    }
}