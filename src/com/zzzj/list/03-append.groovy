static void main(String[] args) {
    var list1 = [1, 2, 3]
    list1.add(4)
    // groovy对list的左移运算符做了重载
    list1 << 5
}