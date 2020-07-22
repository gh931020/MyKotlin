package com.example.mykotlin

/**
 * author: zhang
 * created on: 2020/7/22 16:49
 * description:可空和非空类型
 */
fun main() {
    println(fruits())
}
/*
String 类型不可为null,要创建保存null值的字符串,必须通过放置一个?
String?
 */
fun test(){
    var str:String?= "hello"
    str = null
//    var str1:String = "zhang"
//    str1 = null  //报错
}
/*
is智能转换
 */
fun isLambda(){
    val obj :Any = "变量obj自动转换为此范围内的String"
    if (obj is String){
        println("字符串的长度是: ${obj.length}")
    }
    if (obj !is String){
        println("obj不是字符串")
    }
}

/*
安全转换操作符:as?
安全地转换成一种类型.如果无法进行转换,则返回Null,不会产生ClassCastException
 */
fun asLambda(){
    val location:Any = "Kotlin"
    val safeString:String?= location as? String
    val safeInt :Int ?= location as? Int
    println(safeString)//kotlin
    println(safeInt)//null
}
/*
Elvis运算符(?:)用于返回非null值
 */
fun fruits():String{
    val str:String ?= "abc"
    val strLength :Int = if (str!=null) str.length else -1
    val strLength2 :Int = str?.length?:-1
    var string = "str = $str\n" +"strLengtn = $strLength\n"+ "strLength = $strLength2\n\n"
    fun check(textOne: String?,textTwo: String?): String?{
        val textOne = textOne ?: return null
        val textTwo = textTwo ?: IllegalArgumentException("text exception")
        return "\ntextOne = $textOne\n"+
                "textTwo = $textTwo\n"
    }
    string += "check(null,\"mango\") = ${check(null,"mango")}\n" +
            "check(\"apple\",\"orange\") = ${check("apple","orange")}\n"
    return string

}
