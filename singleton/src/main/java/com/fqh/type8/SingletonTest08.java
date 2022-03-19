package com.fqh.type8;

/**
 * @author 海盗狗
 * @version 1.0
 * 单例--->枚举：懒加载 + 线程安全
 */
public class SingletonTest08 {

    public static void main(String[] args) {

        System.out.println("***********枚举(单例)*********");
        Singleton instance1 = Singleton.INSTANCE;
        Singleton instance2 = Singleton.INSTANCE;

        System.out.println(instance1 == instance2);
        System.out.println(instance1.hashCode());
        System.out.println(instance2.hashCode());

    }
}

// 枚举方式完成
enum Singleton {
    INSTANCE; //属性
    public void sayOk() {
        System.out.println("ok......");
    }
}
