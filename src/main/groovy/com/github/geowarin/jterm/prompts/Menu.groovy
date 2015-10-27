package com.github.geowarin.jterm.prompts

import com.github.geowarin.jterm.JTerm
import com.github.geowarin.jterm.Keys

import static org.fusesource.jansi.Ansi.Color.RED

class Menu<T> implements Prompt<T> {
  CyclingMapIterator<T> iterator

  Menu(T... items) {
    def map = items.collectEntries { [(it): it.toString()] }
    iterator = new CyclingMapIterator<>(map)
  }

  Menu(Map<T, String> itemsAndValues) {
    iterator = new CyclingMapIterator<>(itemsAndValues)
  }

  void render() {
    display()

    int c;
    while ((c = JTerm.readCharacter()) != null) {
      if (c == Keys.DOWN) {
        iterator.previous()
        display(true)
      }
      if (c == Keys.UP) {
        iterator.next()
        display(true)
      }

      if (c == Keys.ENTER) {
        break;
      }
    }
  }

  private void display(clear = false) {
    if (clear) {
      JTerm.clearLines(iterator.map.size())
    }
    iterator.map.eachWithIndex { T key, String item, int index ->
      if (iterator.currentKey() == key) {
        JTerm.println("-> $item", RED)
      } else {
        JTerm.println("   $item")
      }
    }
  }

  T getResult() {
    iterator.currentKey()
  }
}
