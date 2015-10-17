package com.github.geowarin.jterm.promps

import jline.console.ConsoleReader

interface Prompt {

    void render(ConsoleReader reader)

    String getResult()
}