import com.github.geowarin.jterm.JTerm
import org.fusesource.jansi.Ansi

//JTerm.echo()

JTerm.print(Ansi.ansi().fg(Ansi.Color.BLUE).render('lol'))
def result = JTerm.menu('pizza', 'bread', 'sausage')
JTerm.print("You selected @|green $result|@")
