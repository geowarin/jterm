package com.github.geowarin.jterm.promps

import jline.console.ConsoleReader

interface Prompt {

    void render()

    String getResult()
}