package com.company.create.absfatory.single;
//懒汉模式
public class Singleton {
    private static class LazyHolder {
        //实现线程安全
        private static final Singleton INSTANCE = new Singleton();
    }
    private Singleton (){}
    public static final Singleton getInstance() {
        return LazyHolder.INSTANCE;
    }
}