import com.github.geowarin.jterm.JTerm
import com.github.geowarin.jterm.Validator

import static org.fusesource.jansi.Ansi.Color.MAGENTA

String firstName = JTerm.input('What is your first name')
String lastName = JTerm.input('What is your last name', 'Doe')

Validator ageValidator = { input -> input.matches(/\d+/) ? null : 'Please enter a number' }
String age = JTerm.input('What is your age', ageValidator)

String password = JTerm.password('Enter your password')

JTerm.println('Please select a meal:', MAGENTA)
def result = JTerm.menu('pizza', 'bread', 'sausage')

JTerm.println("Hello @|yellow $firstName $lastName|@, you are @|red $age|@ y.o and your password is @|magenta $password|@")
JTerm.println("You ordered @|green $result|@")
