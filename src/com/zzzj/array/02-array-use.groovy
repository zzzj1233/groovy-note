static void main(String[] args) {
    def arr = new int[]{1, 2, 3, 4, 5}

    assert arr[0] == 1

    assert arr[-1] == 5

    assert arr.size() == 5

    assert arr[0, 2] == [1, 3]

    assert arr[0..2] == [1, 2, 3]
}