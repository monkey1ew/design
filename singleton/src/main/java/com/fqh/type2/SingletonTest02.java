package com.fqh.type2;

/**
 * @author 海盗狗
 * @version 1.0
 * 单例饿汉式
 */
public class SingletonTest02 {

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
    private static Singleton instance;

    static { //在静态代码块中创建单例对象
        instance = new Singleton();
    }

//    3.对外提供一个公有的静态方法, 返回对象实例
    public static Singleton getInstance() {
        return instance;
    }
}