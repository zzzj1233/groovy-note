import java.util.regex.Matcher
import java.util.regex.Pattern

// 1. 定义一个正则表达式
def p = ~/\\d-[1234]-\\d/

assert p instanceof Pattern

// 2. 还可以使用插值表达式
name = "zzzj"
p = ~/[1234]$name/

// 3. 直接创建match对象
def m = name =~ /z+j/

assert m instanceof Matcher
assert m.matches() == true

// 4. 直接判断是否满足正则表达式
def b = name ==~ /z+j/

assert b instanceof Boolean
assert b == true