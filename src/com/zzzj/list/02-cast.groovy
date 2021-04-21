static void main(String[] args) {
    // 默认list为java.lang.ArrayList , 使用as关键字可以将list转换为其他类型
    var list = [1, 2, 3]

    assert list instanceof ArrayList

    // 转换为LinkedList
    var list2 = [1, 2, 3] as LinkedList

    assert list2 instanceof LinkedList

    // 转换为HashSet
    var set1 = [1, 2, 3] as HashSet

    assert set1 instanceof HashSet
}