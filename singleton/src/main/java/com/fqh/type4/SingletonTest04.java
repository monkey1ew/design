package com.fqh.type4;

/**
 * @author 海盗狗
 * @version 1.0
 * 单例懒汉式: 懒加载的效果
 */
public class SingletonTest04 {

    public static void main(String[] args) {
        System.out.println("***********懒汉式(2, 线程安全)*********");
        Singleton instance1 = Singleton.getInstance();
        Singleton instance2 = Singleton.getInstance();

        System.out.println(instance1 == instance2);
        System.out.println(instance1.hashCode());
        System.out.println(instance2.hashCode());
    }
}

//懒汉式（线程安全）
class Singleton {
    private static Singleton instance;

    private Singleton() {
    }

//    提供一个静态的私有返回, 加入同步处理代码, 解决线程安全问题 [效率低, 不推荐]
//    懒汉式 synchronized加在static方法 == 锁住Singleton.Class类对象
    public static synchronized Singleton getInstance() {
//        多个线程进入方法执行, 可能创建多个实例
        if (instance == null) {
            instance = new Singleton();
        }
        return instance;
    }
}
