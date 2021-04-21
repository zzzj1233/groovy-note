package com.zzzj.operator.spreaddot

import com.zzzj.model.Person

def persons = [
        new Person(name: "zzzj", age: 23),
        null,
        new Person(name: "dl", age: 22),
]

def names = persons*.name

// 1. 不会触发NullPointerException , 而是填充一个null到列表中
assert names == ["zzzj", null, "dl"]

// 2. 直接对null使用
assert null*.name == null

// 3. *.运算符可以用作于任何实现了Iterable接口的类
