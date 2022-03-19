package com.fqh.type1;

/**
 * @author 海盗狗
 * @version 1.0
 * 单例饿汉式: 可用, 但存在内存浪费问题
 */
public class SingletonTest01 {

    public static void main(String[] args) {
//        测试
        Singleton instance1 = Singleton.getInstance();
        Singleton instance2 = Singleton.getInstance();

        System.out.println(instance1 == instance2); //true;
        System.out.println(instance1.hashCode()); //460141958
        System.out.println(instance2.hashCode()); //460141958
    }
}


//饿汉式(静态变量)
class Singleton {

//  1.构造器私有化, 外部不能直接new
    private Singleton() {
    }

//    2.本类内部创建对象实例
    private final static Singleton instance = new Singleton();

//    3.对外提供一个公有的静态方法, 返回对象实例
    public static Singleton getInstance() {
        return instance;
    }
}