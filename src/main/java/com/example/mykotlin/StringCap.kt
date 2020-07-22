package com.example.mykotlin

/**
 * author: zhang
 * created on: 2020/7/22 15:45
 * description: Kotlin字符串
 */
fun main() {
//    stringMoban()
    equalsString2()
}
/*
String 类表示char类型的数组.字符串是不可变的,这意味着长度和元素在创建后不能更改
 val ch = charArrayOf('H','e','l','l','o','!')
 val st = String(ch)
 */
/*
属性: length:Int  返回字符串序列的长度
      indices:IntRange  返回当前char序列中有效字符索引的范围
      lastIndex:Int  返回char序列中最后一个字的索引
 */
/*
字符串函数
compareTo(other:String):Int 将当前对象与指定对象进行比较以获得顺序-1,0,1代表比较结果
get(index:int): Char  返回当前字符序列中给定索引处的字符
plus(other:Any?):String  返回连接后字符串,包含给定其他字符串的字符串表示形式
subSequence(startIndex:Int,endIndex:Int):CharSequence 从当前字符序列返回从startIndex开始到endIndex新的字符序列
CharSwquence.contains(other:CharSequence,ignoreCase:Boolea = false):Boolean 如果字符序列包含指定的字符,返回true
CharSequence.count():Int 返回char序列的长度
String.drop(n:Int):String  删除前n个字符后返回一个字符串
String.dropLast(n:Int):String 删除最后一个n字符后返回一个字符串
String.drapWhile(predicate:(Char) -> Boolean): String 返回一个包含所有字符的字符序列,但满足给定谓词的第一个字符除外
     例"张  张  张  张; dropwhile("张")   返回" 涨 涨 涨"
CharSequence.elementAt(index:Int):Char 返回给定索引处的字符,如果索引不存在则IndexOutOfBoundsException
CharSequence.indexOf(char:Char,startInde:Int = 0,ignoreCase:Boolean = false):Int 返回从给定的索引位置开始char第一次出现的索引值
CharSequence.indexOfFirst(predicate:(Char) -> Boolean):Int 返回戈丁谓词第一次出现的索引,不包含返回-1
CharSequence.indexOfLast(predicate: (Char) -> Boolean):Int
CharSequence.getOrElse(index:Int,defaultValue:(Int) ->Char): Char 如果索引超出当前字符序列的范围,返回指定索引处的字符或调用defaultValue的结果
CharSequence.getOrNull(index:Int):Char
 */
/*
字符串模板
字符串模板表达式是一段代码,它计算并将结果返回到字符串中.
两种字符串类型(转义和原始字符串)都包含模板表达式.
字符串模板以美元符号$开头,其中包含变量名称或花括号中的任意表达式
 */
fun stringMoban(){
    val i = 10
    println("i = $i")
    val str = "djoaijdf"
    println("$str is a String ,its length is ${str.length}")
    //原始字符串模板
    val a = 10
    val b = 2
    val myString = """value $a 
        |is greater than value $b
    """.trimMargin()
    println("${myString.trimMargin()}")
}
/*
1.转义字符串,在双引号内声明,并且可能包含转义字符,如\n,\t,\b,\r,\ 等
2.原始字符串,在("""""")中声明,它提供了在新行中声明字符串并包含多行的工具,行字符串中不能包含任何转义字符
 */
/*
字符串相等
结构相等(==) 和引用相等(===)
 */
//结构相等
fun equalsString(){
    val str1 = "hello world"
    val str2 = "hello world"
    println(str1 == str2)//true
    println(str1 != str2)//false
}
//引用相等
/*
用于检查两个不同的引用指向同一个实例,!== 运算符用于否定
a===b当且仅当a和b都指向同一个对象是才为true
 */
fun equalsString2(){
    val str1 = buildString { "zhang" }
    val str2 = buildString { "zhang" }
    println(str1 === str2)
    println(str1 !== str2)
    println("------------------")
    val str3 = "zhang"
    val str4 = str3
    val str5 = str3
    println(str4 === str5)
    println(str4 !== str5)
    println("------------------")
    val str6 = "zhang"
    println(str3 === str6)
    println(str3 !== str6)
}

