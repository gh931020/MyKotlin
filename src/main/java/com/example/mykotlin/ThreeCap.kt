package com.example.mykotlin

import android.util.Log

/**
 * author: zhang
 * created on: 2020/7/22 11:30
 * description: Kotlin函数
 */
class ThreeCap {
    /**
     * 函数名(参数1:参数类型,参数2:参数类型):返回值类型
     */
    fun sum(num1:Int,num2:Int):Int{
        val result = num1 + num2
        println("两个数相加的结果是: $result")
        return result
    }

    /**
     * 递归函数是一个连续调用自身的函数,
     */
    // 有限次递归
    var count = 0
    fun digui1(){
        count ++
        if (count <= 5){
            println("count = > $count")
            digui1()//调用自身
        }
    }
    //阶乘数,计算一个数字的阶乘
    fun digui2(n:Int):Long{
        return if (n ==1){
            n.toLong()
        }else{
            n*digui2(n-1)
        }
    }
    /*
    尾递归,首先执行计算,然后进行递归调用.
    递归调用必须是方法的最后一次调用.要将递归声明为尾递归,需要tailrec修饰符
     */
    tailrec fun digui3(n:Long, semiresult:Long = 0):Long{

        return if (n<= 0){
            semiresult
        }else{
            digui3((n-1),n+semiresult)
        }
    }
    //尾递归 阶乘
    tailrec fun digui4(n:Int,run:Int =1):Long{
        return if (n==1){
            run.toLong()
        }else{
            digui4(n-1,run*n)
        }
    }

    /**
     * 默认和命名参数
     * 1.如果调用函数而不传递任何参数,则使用默认参数作为函数定义的参数
     */
    fun canShu1(n:Int = 5,name:String = "zhang"){
        println("parameter in function definition $n and $name")
    }

    /*
    lambda函数
    没有名字的函数.用花括号{}定义,将变量作为参数(如果有),函数体在变量之后写入,后跟 -> 运算符
    {variable -> body of function}
     */
    /*
    高阶函数:一个接受函数作为参数或返回函数,或可以同时执行这两个函数的函数.
            可以将函数作为参数传递给其他函数
     */
    fun gaoJie(org:String,portal:String,fn:(String,String) -> String):Unit{
        val result = fn(org,portal)
        println(result)
    }

}

fun main() {
    val threeCap:ThreeCap = ThreeCap()
    threeCap.apply {
//        sum(8,9)
//        digui1()
        //此处调用不传任何参数,函数使用默认参数值
//        canShu1()
        //传递某些参数
//        canShu1(9)
//        canShu1("yang")//报错
//        canShu1(name = "yang")//命名参数
        //传递所有参数
//        canShu1(10,"zheng")
//        gaoJie("zhang.org","zhang.com",{org,portal ->"$org develop $portal"})

    }
//    var result = threeCap.digui2(10)
//    println("$10 的阶乘是$result")

}