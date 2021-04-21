int testArgsFun(int x, int y, int z) {
    return x + y + z
}


def nums = [1, 2, 3]

// 1. 解构
assert testArgsFun(*nums) == 6

// 2. 传递更多的参数
def nums2 = [4, 5, 6, 7, 8, 9]

// error
// assert testArgsFun(*nums2) == 15

// 3. 传递更少的参数
def nums3 = [1]

// error
// assert testArgsFun(*nums3) == 1

// 4. 传递更少的参数
def nums4 = [1, 2]

assert testArgsFun(*nums4, 3) == 6
