package com.github.geowarin.jterm.prompts

import com.github.geowarin.jterm.JTerm

public class Echo implements Prompt<String> {

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
