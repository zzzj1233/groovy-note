// 定义groovyString
static void main(String[] args) {
    def name = "zzzj"

    // java.lang.String
    def str1 = 'name : $name'

    // GString
    def str2 = "name : $name"

    // GString
    def str3 = """name : $name"""

    // GString
    def str4 = "age : ${18 + 5}"

    // 调用toString()方法将GString转换为String
    // String
    def str5 = str4.toString()

    assert str1 instanceof String

    assert str2 instanceof GString

    assert str3 instanceof GString

    assert str4 instanceof GString

    assert str5 instanceof String
}