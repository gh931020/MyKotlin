package com.example.mykotlin

import androidx.core.graphics.createBitmap
import java.util.*

/**
 * author: zhang
 * created on: 2020/7/21 17:25
 * description:
 */
class FirstCap {
    //普通变量,可更改
    var java = "Java"
    //lateinit 延迟初始化
    lateinit var language:String
    //设置可为空
    var school:String ?= null

    val num = 100
    //常量,不可更改
    val name = "zhang"

    fun test(){
        language = "c++"
        java = "Kotlin"//可执行
//        name = "chen"//报错,常量不可更改
        println(java)
        println(ids[2])
    }

    //数据类型
    /*
    1.数字  byte ; short ; int ; long ; float ; double ;
    2.字符  char
    3.数组  Array  arrayof(),Array()
    4.字符串 String 1)转义字符串 '\n';
                   2)原始字符串:行字符串在三引号内生命,不能包含任何转义字符
    5.布尔: Bollean  true,false
     */
    var arrays = arrayOf(1,2,3)
    val ids = Array(5,{i -> i * 2 })//[0,2,4,6,8]

    /**
     * kotlin标准输入方式,readline
     */
    fun readline(){
        println("input your name:")
        val name = readLine()
        println("input your age:")
        val age  =  readLine()
        println("your name is $name,you age is $age years old")
    }

    /**
     * 当输入为指定类型时,使用Scanner
     */
    fun scanner(){
        val read = Scanner(System.`in`)
        println("Input your age:")
        var myAge = read.nextInt()
        println("my age is "+ myAge)
    }

    /**
     * if-else表达式
     */
    fun ifElse(){
        val num1 = 10
        val num2 = 20
        val result = if (num1 > num2){
            "$num1 is greater than $num2"
        }else{
            "$num1 is smaller than $num2"
        }
        //Kotlin不支持任何三元运算符
//        val result2 = if (num1 > num2) "$num1 is greater than $num2" else "$num1 is smaller than $num2"

        println(result)

        val num3 = 20
        val result3 = if (num3 > 0){
            "$num3 is positive"
        }else if (num < 0){
            "$num3 is negative"
        }else{
            "$num3 is zero"
        }
        println(result3)
    }

    /**
     * when判断的使用
     */
    fun whenFun(){
        var number =4
        var numberProvider = when(number){
            1 -> "one"//可不反悔数值,直接执行语句,如:println("one")
            2 -> "two"
            3 -> "three"
            4 -> "four"
            5 -> "five"
            6,7,8,9 ->"so big"//逗号分隔的多个条件分支
            in 10..100 -> "big more"//使用..(双点)运算符创建范围,in表示在范围内,闭包
            else -> "invalid number"
        }
        println("you provide $numberProvider")
    }

    /**
     * for循环使用
     */
    fun forFun(){
        //创建数组
        val marks = arrayOf(50,60,90,48,52)
        for (item in marks){
            println(item)
        }
        //基于数组的索引迭代数组元素
        for (indie in marks.indices){
            println("marks[$indie]:" + marks[indie])
        }
//        迭代范围
        print("for (i in 1..5) print(i) =")
        for (i in 1..5) print(i)
        println()
        print("for (i in 5..1) print(i) =")
        for (i in 5..1) print(i)//This range is empty,无输出
        println()
        print("for (i in 5 downTo 1) print(i) = ")
        for (i in 5 downTo 1) print(i)
        println()
        print("for (i in 5 downTo 2) print(i) = ")
        for (i in 5 downTo 2) print(i)
        println()
        print("for (i in 1..5 step 2) print(i) = ")
        for (i in 1..5 step 2) print(i)
        println()
        print("for (i in 5 downTo 1 step 2) print(i) = ")
        for (i in 5 downTo 1 step 2) print(i)
    }

    /**
     * while循环
     */
    fun whileFun(){
        var  i = 1
        while (i <= 5){
            println(i)
            i++
        }
    }

    fun breakContinueReturn(){
        /**
         * break:用于中止最近的封闭循环,一般与if-else条件一起使用
         */
        for ( i in 1..5){
            if (i == 3){
                break //当i= 3 时结束循环
            }
            println(i)
        }
        /**
         * 标识符,后跟@符号,如abc@,test@,使用只需在表达式前面添加一个标签
         * 和break组合使用终止特定的循环
         */
        loop@for(i in 1..5){
            for (j in 1..5){
                if (i == 2){
                    break@loop //当i= 2时,中止带有loop@标识的循环
                }
                println("i = $i ,j = $j")
            }
        }
    }

    /**
     * continue表达式
     */
    fun continueFun(){
        for (i in 1..3){
            println("i = $i")
            if (i == 2){
                continue //满足条件后将不再执行if后的代码
            }
            println("this is below if")
        }

        /**
         * continue和标识符配合使用,用于重复特定的循环
         */
        labelName@ for (i in 1..3){
            for (j in 4 downTo 1){
                println("i = $i ,and j = $j")
                if (i == 2){
                  continue@labelName
                }
                println("this is below if")
            }
        }
    }
}


fun main() {
    val firstCap:FirstCap = FirstCap()
//    firstCap.test()
//    firstCap.readline()
//    firstCap.scanner()
//    firstCap.ifElse()
//    firstCap.whenFun()
//    firstCap.forFun()
//    firstCap.whileFun()
//    firstCap.let {
//        it.breakContinueReturn()
//    }
    firstCap.apply {
//        breakContinueReturn();
        continueFun()
    }
}


