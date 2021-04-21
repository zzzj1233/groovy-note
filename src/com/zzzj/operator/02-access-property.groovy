import com.zzzj.model.Person

static void main(String[] args) {
    Person cat = new Person(name: "zzzj")
    // groovy的class默认就带有所有属性的getter和setter
    // ! 当我们直接调用属性时,实质上是调用了getter

    assert cat.name == "getName zzzj"

    assert cat.name == cat.getName()

    // 使用@运算符才可以直接访问到属性
    assert cat.@name == "zzzj"

    // 也可以修改
    cat.@name = "zzzj1233"

    assert cat.@name == "zzzj1233"
}