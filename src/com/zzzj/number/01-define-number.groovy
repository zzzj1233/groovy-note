static void main(String[] args) {
    // 1. 通过指定类型定义数值

    byte b1 = 1
    short s1 = 1234
    int num1 = 123
    long num2 = 1233
    // 可以直接 = 赋值
    BigInteger num3 = 12333
    BigDecimal num4 = 1233.33

    // 2. 通过值定义
    def b2 = 1
    def s2 = 65530
    def intNum = 2147483647
    def longNum = 2147483648
    def bigInt = 9223372036854775808

    assert b2 instanceof Integer
    assert s2 instanceof Integer
    assert intNum instanceof Integer
    assert longNum instanceof Long
    assert bigInt instanceof BigInteger

    // 3. 通过后缀定义

    assert 1I instanceof Integer
    assert 1L instanceof Long
    assert 1G instanceof BigInteger
    assert 1D instanceof Double
    assert 1F instanceof Float
    assert 1.0 instanceof BigDecimal
}
