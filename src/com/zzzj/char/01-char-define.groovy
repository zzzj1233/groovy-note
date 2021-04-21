static void main(String[] args) {
    char c1 = 'A'

    def c2 = 'B' as char

    def c3 = (char) 'C'

    assert c1 instanceof Character
    assert c2 instanceof Character
    assert c3 instanceof Character
}