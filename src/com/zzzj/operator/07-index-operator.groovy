import com.zzzj.model.Person

/**
 * 1. groovy的[index]会调用类的 getAt(int i) 和 putAt(int i)方法
 * 2. 相当于Python的getItem()和setItem()魔术方法
 * 3. kotlin仅有对operator get做了重载,没有对应的operator set
 * 4. groovy在编译时不会检查是否有对应的方法
 */

def person = new Person(name: "zzzj", age: 23)

assert person[0] == "zzzj"

assert person[1] == 23

person[0] = "dl"

assert person == new Person(name: "dl", age: 23)