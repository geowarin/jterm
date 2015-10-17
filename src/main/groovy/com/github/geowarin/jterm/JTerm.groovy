package com.github.geowarin.jterm

import com.github.geowarin.jterm.promps.Echo
import com.github.geowarin.jterm.promps.Menu
import com.github.geowarin.jterm.promps.Prompt
import jline.console.ConsoleReader
import org.fusesource.jansi.Ansi
import org.fusesource.jansi.Ansi.Color

import static org.fusesource.jansi.Ansi.ansi

class JTerm {
    static String ClearLine = '\u001B[K'
    static String ClearWholeLine = '\u001B[2K'
    static String LineUp = '\u001B[1A'

    static JTerm jTerm = new JTerm()

    private Prompt currentPromp
    private ConsoleReader reader

    JTerm() {
        reader = new ConsoleReader()
    }

    static void init(ConsoleReader reader) {
        jTerm = new JTerm(reader: reader)
    }

    static void clearLines(int num = 1) {
        jTerm.reader.print((ClearWholeLine + LineUp) * num)
        jTerm.reader.print(ClearLine)
    }

    static String echo() {
        renderPrompt(new Echo())
    }

    static String menu(String... items) {
        renderPrompt(new Menu(items))
    }

    static String password(String prompt = '') {
        jTerm.reader.readLine(prompt, '*' as char)
    }

    static print(String str = '') {
        print(ansi().render(str))
    }

    static print(String str, Color fontColor) {
        print(ansi().fg(fontColor).render(str).reset())
    }

    static print(Ansi ansi) {
        jTerm.reader.output.println(ansi)
        flush()
    }

    static flush() {
        jTerm.reader.flush()
    }

    private static String renderPrompt(Prompt prompt) {
        jTerm.currentPromp = prompt
        jTerm.currentPromp.render()
        jTerm.currentPromp.result
    }

    static int readCharacter() {
        jTerm.reader.readCharacter()
    }
}
