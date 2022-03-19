package com.fqh.type6;

/**
 * @author 海盗狗
 * @version 1.0
 * 单例懒汉式: 懒加载的效果
 */
public class SingletonTest06 {

    public static void main(String[] args) {
        System.out.println("***********双重检测(线程安全)*********");
        Singleton instance1 = Singleton.getInstance();
        Singleton instance2 = Singleton.getInstance();

        System.out.println(instance1 == instance2);
        System.out.println(instance1.hashCode());
        System.out.println(instance2.hashCode());
    }
}

//懒汉式（线程安全）
class Singleton {
//    volatile防止指令重排
    private static volatile Singleton instance;

    private Singleton() {
    }

//    提供一个静态的私有返回, 加入[双重检查代码], 解决线程安全问题 + 懒加载
    public static Singleton getInstance() {
//        多个线程进入方法执行, 可能创建多个实例
        if (instance == null) {
            synchronized (Singleton.class) {
                if (instance == null) {
                    instance = new Singleton();
                }
            }
        }
        return instance;
    }
}
