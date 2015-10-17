import com.github.geowarin.jterm.JTerm

import static org.fusesource.jansi.Ansi.Color.MAGENTA

//JTerm.echo()

JTerm.print('Please select a meal:', MAGENTA)

def result = JTerm.menu('pizza', 'bread', 'sausage')
JTerm.print("You selected @|green $result|@")
