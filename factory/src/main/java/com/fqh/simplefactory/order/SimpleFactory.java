package com.fqh.simplefactory.order;

import com.fqh.simplefactory.pizza.CheesePizza;
import com.fqh.simplefactory.pizza.GreekPizza;
import com.fqh.simplefactory.pizza.PepperPizza;
import com.fqh.simplefactory.pizza.Pizza;

/**
 * @author 海盗狗
 * @version 1.0
 * 简单工厂类
 */
public class SimpleFactory {

//    根据orderType返回对应Pizza对象
    public static Pizza createPizza(String orderType) {
        Pizza pizza = null;
        System.out.println("使用简单工厂模式.....");
        if (orderType.equals("greek")) {
            pizza = new GreekPizza();
            pizza.setName("希纳Pizza");
        }else if (orderType.equals("cheese")) {
            pizza = new CheesePizza();
            pizza.setName("奶酪Pizza");
        }else if (orderType.equals("pepper")) {
            pizza = new PepperPizza();
            pizza.setName("胡椒Pizza");
        }
        return pizza;
    }
}
