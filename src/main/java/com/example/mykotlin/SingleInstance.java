package com.example.mykotlin;

import android.text.method.SingleLineTransformationMethod;

/**
 * author: zhang
 * created on: 2020/7/21 15:15
 * description:
 */
public class SingleInstance {
    //懒汉模式,需要的时候才会创建
    //volatile 字段避免了指令重排造成的执行顺序错乱
    private volatile static SingleInstance SINGLE_INSTANCE = null;
    //构造函数私有化,避免外部实例化
    private SingleInstance(){}
    //暴露静态方法获取实例
    public static SingleInstance getInstance(){
        //判断当前实例是否为空,为空则创建,不为空直接返回
        if (SINGLE_INSTANCE == null){
            //此处添加同步锁,避免并发请求时同时进行实例化,产生多个实例
            synchronized (SingleInstance.class){
                //当多个方法同步等待锁时,再次判空可有效避免多次实例创建
                if (SINGLE_INSTANCE == null){
                    SINGLE_INSTANCE = new SingleInstance();
                }
            }
        }
        return SINGLE_INSTANCE;
    }
    //饿汉模式:类加载时便创建实例等待调用.
//    private static final SingleInstance singleInstance = new SingleInstance();
//    public static SingleInstance getInstance2(){
//        return singleInstance;
//    }
}


