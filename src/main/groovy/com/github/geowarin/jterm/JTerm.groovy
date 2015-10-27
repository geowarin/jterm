package com.github.geowarin.jterm

import com.github.geowarin.jterm.prompts.Echo
import com.github.geowarin.jterm.prompts.Input
import com.github.geowarin.jterm.prompts.Menu
import com.github.geowarin.jterm.prompts.Prompt
import jline.console.ConsoleReader
import org.fusesource.jansi.Ansi
import org.fusesource.jansi.Ansi.Color

import static org.fusesource.jansi.Ansi.ansi

class JTerm {
  private static String CLEAR_LINE = '\u001B[K'
  private static String CLEAR_WHOLE_LINE = '\u001B[2K'
  private static String LINE_UP = '\u001B[1A'

  static JTerm jTerm = new JTerm()

  private ConsoleReader reader

  JTerm() {
    reader = new ConsoleReader()
  }

  static void init(ConsoleReader reader) {
    jTerm = new JTerm(reader: reader)
  }

  static void clearLines(int num = 1) {
    jTerm.reader.print((CLEAR_WHOLE_LINE + LINE_UP) * num)
    jTerm.reader.print(CLEAR_LINE)
  }

  static String echo() {
    renderPrompt(new Echo())
  }

  static <T> T menu(T... items) {
    renderPrompt(new Menu(items))
  }

   static <T> T menu(Map<T, String> items) {
    renderPrompt(new Menu(items))
  }

  static String password(String prompt = '', String defaultValue = null) {
    renderPrompt(new Input(prompt, '*', defaultValue))
  }

  static String password(String prompt = '', Validator validator) {
    renderPrompt(new Input(prompt, '*', null, validator))
  }

  static String input(String prompt = '', String defaultValue = null) {
    renderPrompt(new Input(prompt, null, defaultValue))
  }

  static String input(String prompt = '', Validator validator) {
    renderPrompt(new Input(prompt, null, null, validator))
  }

  static println(String str = '') {
    println(ansi().render(str))
  }

  static println(String str, Color fontColor) {
    println(ansi().fg(fontColor).render(str).reset())
  }

  static println(Ansi ansi) {
    jTerm.reader.output.println(ansi)
    flush()
  }

  static print(String str) {
    print(ansi().render(str))
  }

  static print(String str, Color fontColor) {
    print(ansi().fg(fontColor).render(str).reset())
  }

  static print(Ansi ansi) {
    jTerm.reader.output.print(ansi)
  }

  static flush() {
    jTerm.reader.flush()
  }

  static int readCharacter() {
    jTerm.reader.readCharacter()
  }

  static String readLine(String prompt = '', Character mask = null) {
    jTerm.reader.readLine(prompt, mask)
  }

  private static <T> T renderPrompt(Prompt<T> prompt) {
    prompt.render()
    prompt.result
  }
}
