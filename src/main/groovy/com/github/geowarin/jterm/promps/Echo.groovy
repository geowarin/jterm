package com.github.geowarin.jterm.promps

import com.github.geowarin.jterm.JTerm

public class Echo extends BasePrompt {

    @Override
    public void render() {
        int c;
        while ((c = reader.readCharacter()) != null) {
            JTerm.print(c)
        }
    }

    @Override
    String getResult() {
        null
    }
}
