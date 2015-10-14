package com.github.geowarin.jterm

// http://www.darkcoding.net/software/non-blocking-console-io-is-not-possible/
class InputReader {
    private String ttyConfig

    void capture(Closure c) {
        ttyCBreak()
        try {
            c.call()
        } finally {
            restoreTty()
        }
    }

    Integer get() {
        if (System.in.available() != 0) {
            return System.in.read()
        }
        return null
    }

    private void ttyCBreak() throws IOException, InterruptedException {
        ttyConfig = stty("-g")
        // set the console to be character-buffered instead of line-buffered
        stty("-icanon min 1")
        // disable character echoing
        stty("-echo")
    }

    private String stty(String args) {
        String cmd = "stty " + args + " < /dev/tty"
        def process = ["sh", "-c", cmd].execute()
        process.waitFor()
        process.out.toString()
    }

    private void restoreTty() {
        stty(ttyConfig.trim())
    }
}
