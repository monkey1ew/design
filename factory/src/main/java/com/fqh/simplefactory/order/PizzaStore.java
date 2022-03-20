package com.fqh.simplefactory.order;

/**
 * @author 海盗狗
 * @version 1.0
 * 相当于客户端, 发出订购任务
 */
public class PizzaStore {

    public static void main(String[] args) {

//        new OrderPizza();
//        使用简单工厂模式
        new OrderPizza(new SimpleFactory());
        System.out.println("exit........");
    }
}
