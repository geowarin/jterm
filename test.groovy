import com.github.geowarin.jterm.JTerm

JTerm.echo()

def result = JTerm.menu('pizza', 'bread', 'sausage')
println "You selected $result"