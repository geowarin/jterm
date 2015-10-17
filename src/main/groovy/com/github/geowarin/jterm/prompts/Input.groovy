package com.github.geowarin.jterm.prompts

import com.github.geowarin.jterm.JTerm

import static org.fusesource.jansi.Ansi.Color.GREEN

class Input implements Prompt {
    private String prompt
    String result

    Input(String prompt) {
        this.prompt = prompt
    }

    @Override
    void render() {
        JTerm.print('? ', GREEN)
        result = JTerm.readLine("$prompt: ")
    }

    @Override
    String getResult() {
        result
    }
}
