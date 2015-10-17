package com.github.geowarin.jterm

interface Keys {
    static int ENTER = 0x0A
    static int BACK_SPACE = 0x08
    static int TAB = 0x09
    static int CANCEL = 0x03
    static int CLEAR = 0x0C
    static int SHIFT = 0x10
    static int CONTROL = 0x11
    static int ALT = 0x12
    static int PAUSE = 0x13
    static int CAPS = 0x14
    static int ESCAPE = 0x1B
    static int SPACE = 0x20
    static int PAGE_UP = 0x21
    static int PAGE_DOWN = 0x22
    static int END = 0x23
    static int HOME = 0x24

    static int LEFT = 0x25
    static int UP = 0x26
    static int RIGHT = 0x27
    static int DOWN = 0x28

    static int COMMA = 0x2C
    static int MINUS = 0x2D
    static int PERIOD = 0x2E
    static int SLASH = 0x2F

    static int DIGIT0 = 0x30
    static int DIGIT1 = 0x31
    static int DIGIT2 = 0x32
    static int DIGIT3 = 0x33
    static int DIGIT4 = 0x34
    static int DIGIT5 = 0x35
    static int DIGIT6 = 0x36
    static int DIGIT7 = 0x37
    static int DIGIT8 = 0x38
    static int DIGIT9 = 0x39
    static int SEMICOLON = 0x3B
    static int EQUALS = 0x3D

    static int A = 0x41
    static int B = 0x42
    static int C = 0x43
    static int D = 0x44
    static int E = 0x45
    static int F = 0x46
    static int G = 0x47
    static int H = 0x48
    static int I = 0x49
    static int J = 0x4A
    static int K = 0x4B
    static int L = 0x4C
    static int M = 0x4D
    static int N = 0x4E
    static int O = 0x4F
    static int P = 0x50
    static int Q = 0x51
    static int R = 0x52
    static int S = 0x53
    static int T = 0x54
    static int U = 0x55
    static int V = 0x56
    static int W = 0x57
    static int X = 0x58
    static int Y = 0x59
    static int Z = 0x5A

    static int OPEN_BRACKET = 0x5B
    static int BACK_SLASH = 0x5C
    static int CLOSE_BRACKET = 0x5D

    static int NUMPAD0 = 0x60
    static int NUMPAD1 = 0x61
    static int NUMPAD2 = 0x62
    static int NUMPAD3 = 0x63
    static int NUMPAD4 = 0x64
    static int NUMPAD5 = 0x65
    static int NUMPAD6 = 0x66
    static int NUMPAD7 = 0x67
    static int NUMPAD8 = 0x68
    static int NUMPAD9 = 0x69

    static int MULTIPLY = 0x6A
    static int ADD = 0x6B
    static int SEPARATOR = 0x6C
    static int SUBTRACT = 0x6D
    static int DECIMAL = 0x6E
    static int DIVIDE = 0x6F
    static int DELETE = 0x7F

    static int NUM_LOCK = 0x90
    static int SCROLL_LOCK = 0x91

    static int F1 = 0x70
    static int F2 = 0x71
    static int F3 = 0x72
    static int F4 = 0x73
    static int F5 = 0x74
    static int F6 = 0x75
    static int F7 = 0x76
    static int F8 = 0x77
    static int F9 = 0x78
    static int F10 = 0x79
    static int F11 = 0x7A
    static int F12 = 0x7B
    static int F13 = 0xF000
    static int F14 = 0xF001
    static int F15 = 0xF002
    static int F16 = 0xF003
    static int F17 = 0xF004
    static int F18 = 0xF005
    static int F19 = 0xF006
    static int F20 = 0xF007
    static int F21 = 0xF008
    static int F22 = 0xF009
    static int F23 = 0xF00
    static int F24 = 0xF00

    static int PRINTSCREEN = 0x9A
    static int INSERT = 0x9B
    static int HELP = 0x9C
    static int META = 0x9D

    static int BACK_QUOTE = 0xC0
    static int QUOTE = 0xDE

    static int KP_UP = 0xE0
    static int KP_DOWN = 0xE1
    static int KP_LEFT = 0xE2
    static int KP_RIGHT = 0xE3

    static int DEAD_GRAVE = 0x80
    static int DEAD_ACUTE = 0x81
    static int DEAD_CIRCUMFLEX = 0x82
    static int DEAD_TILDE = 0x83
    static int DEAD_MACRON = 0x84
    static int DEAD_BREVE = 0x85
    static int DEAD_ABOVEDOT = 0x86
    static int DEAD_DIAERESIS = 0x87
    static int DEAD_ABOVERING = 0x88
    static int DEAD_DOUBLEACUTE = 0x89
    static int DEAD_CARON = 0x8a
    static int DEAD_CEDILLA = 0x8b
    static int DEAD_OGONEK = 0x8c
    static int DEAD_IOTA = 0x8d
    static int DEAD_VOICED_SOUND = 0x8e
    static int DEAD_SEMIVOICED_SOUND = 0x8f

    static int AMPERSAND = 0x96
    static int ASTERISK = 0x97
    static int QUOTEDBL = 0x98
    static int LESS = 0x99
    static int GREATER = 0xa0
    static int BRACELEFT = 0xa1
    static int BRACERIGHT = 0xa2
    static int AT = 0x0200
    static int COLON = 0x0201
    static int CIRCUMFLEX = 0x0202
    static int DOLLAR = 0x0203
    static int EURO_SIGN = 0x0204
    static int EXCLAMATION_MARK = 0x0205
    static int LEFT_PARENTHESIS = 0x0207
    static int NUMBER_SIGN = 0x0208
    static int PLUS = 0x0209
    static int RIGHT_PARENTHESIS = 0x020A
    static int UNDERSCORE = 0x020B

    static int WINDOWS = 0x020C
    static int CONTEXT_MENU = 0x020D

    static int FINAL = 0x0018
    static int CONVERT = 0x001C
    static int NONCONVERT = 0x001D
    static int ACCEPT = 0x001E

    static int MODECHANGE = 0x001F
    static int KANA = 0x0015
    static int KANJI = 0x0019

    static int ALPHANUMERIC = 0x00F0
    static int KATAKANA = 0x00F1
    static int HIRAGANA = 0x00F2
    static int FULL_WIDTH = 0x00F3
    static int HALF_WIDTH = 0x00F4
    static int ROMAN_CHARACTERS = 0x00F5
    static int ALL_CANDIDATES = 0x0100
    static int PREVIOUS_CANDIDATE = 0x0101
    static int CODE_INPUT = 0x0102

    static int JAPANESE_KATAKANA = 0x0103
    static int JAPANESE_HIRAGANA = 0x0104
    static int JAPANESE_ROMAN = 0x0105

    static int KANA_LOCK = 0x0106
    static int INPUT_METHOD_ON_OFF = 0x0107

    static int CUT = 0xFFD1
    static int COPY = 0xFFCD
    static int PASTE = 0xFFCF
    static int UNDO = 0xFFCB
    static int AGAIN = 0xFFC9
    static int FIND = 0xFFD0
    static int PROPS = 0xFFCA
    static int STOP = 0xFFC8
    static int COMPOSE = 0xFF20
    static int ALT_GRAPH = 0xFF7
    static int BEGIN = 0xFF58
}