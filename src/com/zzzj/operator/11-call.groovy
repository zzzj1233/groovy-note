import com.zzzj.model.Person

def p = new Person(age: 23)

assert 23 == p()
assert 23 == p.call()

assert p() == p.call()
