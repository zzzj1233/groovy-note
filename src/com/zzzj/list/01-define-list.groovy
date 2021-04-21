static void main(String[] args) {
    // 1. 定义一个列表 : groovy默认使用的列表为java.lang.ArrayList

    def list1 = [1, 2, 3]
    def list2 = [1, true, "2"]

    assert list1 instanceof ArrayList<Integer>

    assert list2 instanceof ArrayList<Object>

    assert list1.size() == 3
}