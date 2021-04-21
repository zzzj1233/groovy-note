static void main(String[] args) {
    // 访问列表元素
    var list1 = [1, 2, 3]

    assert list1[0] == 1
    assert list1[-1] == 3

    // 一次访问多个索引的值
    assert list1[0, 1] == [1, 2]
    // 一次访问范围内的值
    assert list1[0..2] == [1, 2, 3]
}