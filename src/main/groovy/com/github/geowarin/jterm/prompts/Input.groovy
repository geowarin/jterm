package com.github.geowarin.jterm.prompts

import com.github.geowarin.jterm.JTerm
import com.github.geowarin.jterm.Validator

import static org.fusesource.jansi.Ansi.Color.*
import static org.fusesource.jansi.Ansi.ansi

class Input implements Prompt<String> {
  private String question
  private String result
  private String defaultValue
  private String mask
  private Validator validator

  Input(String question, String mask = null, String defaultValue = null, Validator validator = null) {
    this.validator = validator
    this.mask = mask
    this.defaultValue = defaultValue
    this.question = question
  }

  @Override
  void render() {
    String defaultVal = defaultValue ? "($defaultValue) " : ''
    String prompt = "$question: $defaultVal"
    String coloredPrompt = ansi().fg(GREEN).render('? ').fg(DEFAULT).render(prompt).reset().toString()

    while (true) {
      result = JTerm.readLine(coloredPrompt, mask as Character)
      if (!validator) break

      String error = validator.validate(result)
      if (error) {
        JTerm.println(error, RED)
      } else {
        break
      }
    }
  }

  @Override
  String getResult() {
    result ?: defaultValue
  }
}
