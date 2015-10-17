package com.github.geowarin.jterm.promps

import jline.console.ConsoleReader

public class Echo extends BasePrompt {

    @Override
    public void render(ConsoleReader reader) {
        int c;
        while ((c = reader.readCharacter()) != null) {
            reader.output << c + '\n'
            reader.output.flush()
        }
    }

    @Override
    String getResult() {
        null
    }
}
