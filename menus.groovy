import com.github.geowarin.jterm.JTerm

import static org.fusesource.jansi.Ansi.Color.MAGENTA

JTerm.println('Please select a meal:', MAGENTA)
def item = JTerm.menu('pizza', 'bread', 'sausage')

JTerm.println("You ordered @|green $item|@")

JTerm.println('Please select a meal:', MAGENTA)
def key = JTerm.menu([1: 'pizza', 2: 'bread', 3:'sausage'])

JTerm.println("You ordered @|green $key|@")
