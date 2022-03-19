package com.fqh.type7;

/**
 * @author 海盗狗
 * @version 1.0
 * 单例--->静态内部类：懒加载 + 线程安全
 */
public class SingletonTest07 {

    public static void main(String[] args) {

        System.out.println("***********静态内部类(单例)*********");
        Singleton instance1 = Singleton.getInstance();
        Singleton instance2 = Singleton.getInstance();

        System.out.println(instance1 == instance2);
        System.out.println(instance1.hashCode());
        System.out.println(instance2.hashCode());
    }
}

// 静态内部类完成
class Singleton {

//    构造器私有化
    private Singleton() {
    }

//    静态内部类, 类中有一个静态属性Singleton
    private static class SingletonInstance {
        private static final Singleton INSTANCE = new Singleton();
    }

//    提供一个公共的静态返回, 直接返回静态内部类的INSTANCE
    public static Singleton getInstance() { //Singleton类加载时, 不会加载SingletonInstance
        return SingletonInstance.INSTANCE;
    }

}

