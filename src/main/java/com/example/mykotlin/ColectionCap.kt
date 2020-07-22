package com.example.mykotlin

/**
 * author: zhang
 * created on: 2020/7/22 17:27
 * description:Kotlin集合
 */
/*
不可变集合
List   listOf(),listOf<T>()
Map    mapOf()
Set    setOf()
可变集合
List   ArrayList<T>(),arrayListOf(),mutableListOf()
Map    HashMap,hashMapOf(),mutableMapOf()
Set    hashSetOf(),mutableSetOf()
 */

fun main() {
//    myList()
    arrayList()
}
/*
List  不可变,它的方法只支持读取功能.即声明后不能再添加更多的元素
 */
fun myList(){
    var list = listOf<String>("Ajax","Vivi","Parka","Booker")
    //可以同事传递不同类型的数据
    var list2 = listOf(1,2,3,"zhang","chen","song")
    for (elment in list){
        println(elment)
    }
    //指针范围便利
    for (index in 0..list2.size-1){
        println(list2[index])
    }
    var stringList: List<String> = listOf<String>("Ajax","Vivi","Prakash","Vivi","Rohan")
    var listAny: List<Any> = listOf<Any>("Ajax","Vivi","Prakash",4,56,8,false)
    for(element in stringList){
        print(element+" ")
    }
    println()
    println(stringList.get(0))
    println(stringList.indexOf("Vivi"))
    println(stringList.lastIndexOf("Vivi"))
    println(stringList.size)
    println(stringList.contains("Prakash"))
    println(stringList.containsAll(list))
    println(stringList.subList(2,4))
    println(stringList.isEmpty())
    println(stringList.drop(1))
    println(stringList.dropLast(2))
}
/*
ArrayList:用于创建动态数组,可根据需要增加或减少ArrayList类的大小
          非同步,可能包含重复的元素,在索引的基础上随机访问
 */
fun arrayList(){
    var arrayList1 = ArrayList<Any>()//创建空数组
    //创建容量为5的集合
    var arrayList2 = ArrayList<String>(5)
    //创建从集合元素填充的ArrayList
    var arrayList3 = ArrayList<Any>(arrayList2)
    arrayList1.add("java")
    arrayList1.apply {
        add("Charp")
        add("Python")
        add("PHP")
        add("SQL")
    }
    println("----------arrayList1----------")
    for (i in arrayList1){
        println(i)
    }

    var list:MutableList<String> = mutableListOf();
    list.apply {
        add("zhang")
        add("wang")
        add("li")
        add("liu")
    }
    println("----------arrayList2----------")
    arrayList2.addAll(list)
    val itr = arrayList2.iterator()
    while (itr.hasNext()){
        println(itr.next())
    }

}