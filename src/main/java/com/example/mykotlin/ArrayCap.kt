package com.example.mykotlin

/**
 * author: zhang
 * created on: 2020/7/22 15:11
 * description: 数组
 */
fun main() {
    setArray()
    getArray()
    bianliArray()
}
/**
 * 数组的构造函数
 * 使用指定的大小和init函数声明数组构造函数.init函数用于返回带有索引的数组元素
 * Array(size:Int, init:(Int) -> T)
 * 可以使用arrayOf(),intArrayOf(),charArrayOf(),booleanArrayOf(),longArrayOf(),shortArrayOf()
 * byteArrayOf()函数创建Kotlin数组
 */
fun creatArrayByArrayOf(){
    var myArray1 = arrayOf(1,2,3,4,5,6)
    var myArray2 = arrayOf<Int>(1,2,3,4,5,6)
    val myArray3 = arrayOf<String>("zhang","chen","li","liu")
    var myArray4 = arrayOf(1,10,2,"zhang","chen")
}
fun creatArrayByIntArrayOf(){
    var myArray5:IntArray = intArrayOf(5,10,15,20,36)
}
/*
修改和访问元素
set():用于在特定索引位置设置元素.也可以通过在数组索引处分配元素来完成
get():用于从指定的索引获取元素
 */
fun setArray(){
    val array1 = arrayOf(1,2,3,4)
    val array2 = arrayOf<Long>(11,12,13,41)
    //index,value
    array1.set(1,5)
    array1[2] = 6

    array2.set(2,88)
    array2[3] = 99

    for (elment in array1){
        println(elment)
    }
    //循环数组索引值范围,不是数组内值
    for (index in array2.indices){
        println("array2[$index]: " + array2[index])
    }

}
fun getArray(){
    val array1 = arrayOf(1,2,3,4)
    val array2 = arrayOf<Long>(11,22,33,44)

    println(array1.get(0))
    println(array1[2])
    println()
    println(array2.get(2))
    println(array2[3])
}

fun bianliArray(){
    var myArray:IntArray = intArrayOf(5,10,20,65,89)
    //范围遍历
    for (index in 0..4){
        println(myArray[index])
    }
    for (index in 0..myArray.size-1){
        println(myArray[index])
    }
}


