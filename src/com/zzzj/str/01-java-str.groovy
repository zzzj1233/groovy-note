package com.zzzj.str

static void main(String[] args) {
    // groovy支持三种方式定义字符串 , 且默认定义的都是java.lang.String
    def str1 = 'str1'
    def str2 = "str2"
    def str3 = """
str3
"""
    assert str1 instanceof String
    assert str2 instanceof String
    assert str3 instanceof String

    assert str3 == "\nstr3\n"
}