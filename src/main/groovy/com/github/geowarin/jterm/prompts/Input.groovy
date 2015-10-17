package com.github.geowarin.jterm.prompts

import com.github.geowarin.jterm.JTerm
import org.fusesource.jansi.Ansi

import static org.fusesource.jansi.Ansi.Color.*
import static org.fusesource.jansi.Ansi.ansi

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
        String defaultVal = defaultValue ? "($defaultValue) " : ''
        String prompt = "$question: $defaultVal"
        String coloredPrompt = ansi().fg(GREEN).render('? ').fg(DEFAULT).render(prompt).reset().toString()
        result = JTerm.readLine(coloredPrompt, mask as Character)
    }

    @Override
    String getResult() {
        result ?: defaultValue
    }
}
