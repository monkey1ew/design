package com.fqh.type3;

/**
 * @author 海盗狗
 * @version 1.0
 * 单例懒汉式: 懒加载的效果
 */
public class SingletonTest03 {

    public static void main(String[] args) {
        System.out.println("***********懒汉式(1, 线程不安全)*********");
        Singleton instance1 = Singleton.getInstance();
        Singleton instance2 = Singleton.getInstance();

        System.out.println(instance1 == instance2);
        System.out.println(instance1.hashCode());
        System.out.println(instance2.hashCode());
    }
}

class Singleton {
    private static Singleton instance;

    private Singleton() {

    }

//    提供一个静态的私有返回, 当使用该方法时, 才创建instance
//    懒汉式
    public static Singleton getInstance() {
//        多个线程进入方法执行, 可能创建多个实例
        if (instance == null) {
            instance = new Singleton();
        }
        return instance;
    }
}
