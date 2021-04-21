// 1. groovy的 1..5和kotlin行为一致
assert 1..5 == (1..5)

assert 1..5 == [1, 2, 3, 4, 5]

// 2. 和kotlin的 1 until 5
assert 1..<5 == [1, 2, 3, 4]