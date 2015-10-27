package com.github.geowarin.jterm.prompts

interface Prompt<T> {

  void render()

  T getResult()
}
