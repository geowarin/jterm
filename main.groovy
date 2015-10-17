import com.github.geowarin.jterm.Ansi
import com.github.geowarin.jterm.ConsoleWriter
import com.github.geowarin.jterm.InputReader
import com.github.geowarin.jterm.Keys

class Main {
    InputReader inputReader = new InputReader()
    ConsoleWriter screen = new ConsoleWriter()
    def items = ['pizza', 'cheese', 'hammer']
    int selected = 0

    void list(ConsoleWriter screen) {
        screen.clearAll()
        items.eachWithIndex { String item, int index ->
            if (selected == index) {
                screen << Ansi.Yellow.format('-> '+ item) + '\n'
            } else {
                screen << '   ' + item + '\n'
            }
        }
        screen.display()
    }

    void start() {
        inputReader.capture {

            list(screen)
            while (true) {
                def c = inputReader.get()
                if (c) {
                    if (c == 65) {
                        selected--
                        selected = selected < 0 ? items.size() -1 : selected
                        list(screen)
                    }
                    if (c == 66) {
                        selected++
                        selected = selected >= items.size() ? 0 : selected
                        list(screen)
                    }

                    if (c == Keys.ENTER) {
                        println "You selected " + items[selected]
                        break;
                    }
                }
            }
        }
    }
}


new Main().start()