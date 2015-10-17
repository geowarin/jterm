import com.github.geowarin.jterm.JTerm

import static org.fusesource.jansi.Ansi.Color.MAGENTA

String firstName = JTerm.input('What is your first name')
String lastName = JTerm.input('What is your last name', 'Doe')

String password = JTerm.password('Enter your password')

JTerm.println('Please select a meal:', MAGENTA)
def result = JTerm.menu('pizza', 'bread', 'sausage')

JTerm.println("Hello @|yellow $firstName|@ @|red $lastName|@, your password is @|magenta $password|@")
JTerm.println("You ordered @|green $result|@")
