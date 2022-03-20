package com.fqh.simplefactory.order;

import com.fqh.simplefactory.pizza.CheesePizza;
import com.fqh.simplefactory.pizza.GreekPizza;
import com.fqh.simplefactory.pizza.PepperPizza;
import com.fqh.simplefactory.pizza.Pizza;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 * @author 海盗狗
 * @version 1.0
 */
public class OrderPizza {

//    public OrderPizza() {
//        Pizza pizza = null;
//        String orderType; //订购Pizza的类型
//        do {
//            orderType = gettype();
//            if (orderType.equals("greek")) {
//                pizza = new GreekPizza();
//                pizza.setName("希纳Pizza");
//            }else if (orderType.equals("cheese")) {
//                pizza = new CheesePizza();
//                pizza.setName("奶酪Pizza");
//            }else if (orderType.equals("pepper")) {
//                pizza = new PepperPizza();
//                pizza.setName("胡椒Pizza");
//            }else {
//                break;
//            }
////            制作过程
//            pizza.prepare();
//            pizza.bake();
//            pizza.cut();
//            pizza.box();
//        }while (true);
//    }

//    定义简单工厂对象
    SimpleFactory simpleFactory;
    Pizza pizza = null;

    public OrderPizza(SimpleFactory simpleFactory) {
        setSimpleFactory(simpleFactory);
    }

    public void setSimpleFactory(SimpleFactory simpleFactory) {

        String orderType = "";
        this.simpleFactory = simpleFactory; //设置简单工厂对象
        do {
            orderType = gettype();
            pizza = this.simpleFactory.createPizza(orderType);

//            输出Pizza
            if (pizza != null) {
                pizza.prepare();
                pizza.bake();
                pizza.cut();
                pizza.box();
            }else {
                System.out.println("订购Pizza失败......");
                break;
            }
        }while (true);
    }

    //    编写可以获取用户需要订购的Pizza总类
    private String gettype() {
        try {
            BufferedReader strin = new BufferedReader(new InputStreamReader(System.in));
            System.out.println("input pizza type : ");
            String str = strin.readLine();
            return  str;
        } catch (IOException e) {
            e.printStackTrace();
            return "";
        }
    }
}
