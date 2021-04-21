// 1. 解构List
def list1 = [1, 2, 3]

def list2 = [0, *list1, 4]

assert list2 == [0, 1, 2, 3, 4]

// 2. 解构Map
def info = ["name": "zzzj"]

// 注意 *:
def fullInfo = ["age": 23, *: info]

assert fullInfo == [age: 23, name: "zzzj"]