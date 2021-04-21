static void main(String[] args) {
    // groovy提供斜线字符串,专门用于写正则表达式,和js类似

    def pattern = /.*[1234].*/

    assert pattern == ".*[1234].*"
}