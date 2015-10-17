import com.github.geowarin.jterm.JTerm

import static org.fusesource.jansi.Ansi.Color.MAGENTA

//JTerm.echo()

JTerm.println('Please select a meal:', MAGENTA)
def result = JTerm.menu('pizza', 'bread', 'sausage')

String firstName = JTerm.input('What is your first name')

JTerm.println('Enter your password:', MAGENTA)
String password = JTerm.password()

JTerm.println("Hello @|yellow $firstName|@, your password is @|magenta $password|@")
JTerm.println("You ordered @|green $result|@")
