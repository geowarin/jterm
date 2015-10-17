package com.github.geowarin.jterm.prompts

import com.github.geowarin.jterm.JTerm

import static org.fusesource.jansi.Ansi.Color.GREEN

class Input implements Prompt {
    private String question
    private String result
    private String defaultValue
    private String mask

    Input(String question, String mask = null, String defaultValue = null) {
        this.mask = mask
        this.defaultValue = defaultValue
        this.question = question
    }

    @Override
    void render() {
        JTerm.print('? ', GREEN)
        String defaultVal = defaultValue ? "($defaultValue)" : ''
        String prompt = "$question: $defaultVal"
        result = JTerm.readLine(prompt, mask as Character)
    }

    @Override
    String getResult() {
        result ?: defaultValue
    }
}
