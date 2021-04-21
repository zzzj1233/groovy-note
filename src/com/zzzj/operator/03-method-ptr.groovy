String doSt(String str) {
    if (str == null) {
        return "null"
    }
    return str.toUpperCase()
}

Integer doSt(Integer num) {
    if (num == null) {
        return -1
    }
    return num << 1
}

// 支持重载
final def doStFn = this.&doSt

assert doStFn(null) == "null"

assert doStFn(3) == 6

// 获取构造方法
final def newStrFun = String.&new

assert newStrFun("zzzj") == "zzzj"
