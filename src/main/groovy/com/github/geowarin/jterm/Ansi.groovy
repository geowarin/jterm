package com.github.geowarin.jterm

/**
 * Created by geowarin on 14/10/15.
 */
class Ansi {
    static Ansi LowIntensity = new Ansi(AnsiColors.LOW_INTENSITY)
    static Ansi HighIntensity = new Ansi(AnsiColors.HIGH_INTENSITY)

    static Ansi Italic = new Ansi(AnsiColors.ITALIC)
    static Ansi Underline = new Ansi(AnsiColors.UNDERLINE)
    static Ansi Blink = new Ansi(AnsiColors.BLINK)
    static Ansi RapidBlink = new Ansi(AnsiColors.RAPID_BLINK)

    static Ansi Black = new Ansi(AnsiColors.BLACK)
    static Ansi Red = new Ansi(AnsiColors.RED)
    static Ansi Green = new Ansi(AnsiColors.GREEN)
    static Ansi Yellow = new Ansi(AnsiColors.YELLOW)
    static Ansi Blue = new Ansi(AnsiColors.BLUE)
    static Ansi Magenta = new Ansi(AnsiColors.MAGENTA)
    static Ansi Cyan = new Ansi(AnsiColors.CYAN)
    static Ansi White = new Ansi(AnsiColors.WHITE)

    static Ansi BgBlack = new Ansi(AnsiColors.BACKGROUND_BLACK)
    static Ansi BgRed = new Ansi(AnsiColors.BACKGROUND_RED)
    static Ansi BgGreen = new Ansi(AnsiColors.BACKGROUND_GREEN)
    static Ansi BgYellow = new Ansi(AnsiColors.BACKGROUND_YELLOW)
    static Ansi BgBlue = new Ansi(AnsiColors.BACKGROUND_BLUE)
    static Ansi BgMagenta = new Ansi(AnsiColors.BACKGROUND_MAGENTA)
    static Ansi BgCyan = new Ansi(AnsiColors.BACKGROUND_CYAN)
    static Ansi BgWhite = new Ansi(AnsiColors.BACKGROUND_WHITE)

    private String code

    Ansi(String code) {
        this.code = code
    }

    def apply(String original) {
        code + original + AnsiColors.SANE
    }

    def format(String template, Object... args) {
        apply(String.format(template, args))
    }

    Ansi and(Ansi other) {
        new Ansi(this.code + other.code)
    }
}
