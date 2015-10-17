package com.github.geowarin.jterm

class ConsoleCodes {
    // http://linux.about.com/library/cmd/blcmdl4_console_codes.htm
    static String ClearLine = '\u001B[K'
    static String ClearWholeLine = '\u001B[2K'
    static String LineUp = '\u001B[1A'
}

class ConsoleWriter {
    private PrintStream out
    private StringBuilder buffer = new StringBuilder()

    ConsoleWriter(PrintStream out = System.out) {
        this.out = out
    }

    def clearAll() {
        def numLines = buffer.toString().count('\n')
        buffer = new StringBuilder()
        out.print((ConsoleCodes.ClearWholeLine + ConsoleCodes.LineUp) * numLines)
        out.print(ConsoleCodes.ClearLine)
    }

    private def append(String str) {
        buffer.append(str)
        this
    }

    def leftShift(String str) {
        append(str)
        this
    }

    // For Java folks.
    def print(String str) {
        leftShift(str)
    }

    def display() {
        if (!buffer.toString().endsWith("\n")) {
            buffer.append("\n")
        }
        out.print(buffer.toString())
        out.flush()
    }
}

interface AnsiColors {
    static String SANE = '\u001B[0m'
    static String HIGH_INTENSITY = '\u001B[1m'
    static String LOW_INTENSITY = '\u001B[2m'

    static String ITALIC = '\u001B[3m'
    static String UNDERLINE = '\u001B[4m'
    static String BLINK = '\u001B[5m'
    static String RAPID_BLINK = '\u001B[6m'
    static String REVERSE_VIDEO = '\u001B[7m'
    static String INVISIBLE_TEXT = '\u001B[8m'

    static String BLACK = '\u001B[30m'
    static String RED = '\u001B[31m'
    static String GREEN = '\u001B[32m'
    static String YELLOW = '\u001B[33m'
    static String BLUE = '\u001B[34m'
    static String MAGENTA = '\u001B[35m'
    static String CYAN = '\u001B[36m'
    static String WHITE = '\u001B[37m'

    static String BACKGROUND_BLACK = '\u001B[40m'
    static String BACKGROUND_RED = '\u001B[41m'
    static String BACKGROUND_GREEN = '\u001B[42m'
    static String BACKGROUND_YELLOW = '\u001B[43m'
    static String BACKGROUND_BLUE = '\u001B[44m'
    static String BACKGROUND_MAGENTA = '\u001B[45m'
    static String BACKGROUND_CYAN = '\u001B[46m'
    static String BACKGROUND_WHITE = '\u001B[47m'
}

