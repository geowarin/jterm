package com.github.geowarin.jterm

import com.github.geowarin.jterm.promps.Echo
import com.github.geowarin.jterm.promps.Menu
import com.github.geowarin.jterm.promps.Prompt
import jline.console.ConsoleReader
import org.fusesource.jansi.Ansi

import static org.fusesource.jansi.Ansi.ansi

class JTerm {
    static JTerm jTerm

    private Prompt currentPromp
    private ConsoleReader reader

    JTerm() {
        reader = new ConsoleReader()
    }

    static String echo() {
        renderPrompt(new Echo())
    }

    static String menu(String... items) {
        renderPrompt(new Menu(items))
    }

    static print(String str) {
        print(ansi().render(str))
    }

    static print(Ansi ansi) {
        init()
        jTerm.reader.output << ansi
        jTerm.reader.output.flush()
    }

    private static void init() {
        if (jTerm == null) {
            jTerm = new JTerm()
        }
    }

    private static String renderPrompt(Prompt prompt) {
        init()
        jTerm.currentPromp = prompt
        jTerm.currentPromp.render(jTerm.reader)
        jTerm.currentPromp.result
    }
}
