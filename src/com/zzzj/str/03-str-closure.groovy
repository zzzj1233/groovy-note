static void main(String[] args) {
    def num = 1

    def str1 = "num = $num"

    def str2 = "num = ${-> num}"

    assert str1 == "num = 1"
    assert str2 == "num = 1"

    // 改变num的值
    num = 2;

    assert str1 == "num = 1"
    assert str2 == "num = 2"
}