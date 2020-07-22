package com.example.mykotlin

import kotlin.ArithmeticException

/**
 * author: zhang
 * created on: 2020/7/22 16:32
 * description: 异常处理
 */
fun main() {
   println(getNumber("10")) //10
   println(getNumber("10.2")) //0
}
/*
try:包含可能生成异常的语句集,必须后跟catch或finally
catch:用于捕获try块抛出的异常
finally:无论是否异常都会执行,用于执行重要的代码语句,比如流关闭等资源释放
throw:用于显示抛出异常
 */
//try作为表达式的实例
fun getNumber(str:String): Int{
    //表达式返回try块的最后一个表达式或catch的最后一个表达式,
    //finall块的内容不会影响表达式的结果
    return try {
        Integer.parseInt(str)
    }catch (e:Exception){
        0
    }
}