import com.zzzj.model.Person

// groovy对非船运算符做了重载,相当于直接调用compareTo方法

assert 1 <=> 1 == 0

assert 1 <=> 2 == -1

assert 1 <=> 0 == 1

def zzzj = new Person(name: "zzzj", age: 23)
def dl = new Person(name: "dl", age: 22)

assert zzzj <=> dl == 1