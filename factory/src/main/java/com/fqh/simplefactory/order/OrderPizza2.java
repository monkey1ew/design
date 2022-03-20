package com.fqh.simplefactory.order;

import com.fqh.simplefactory.pizza.Pizza;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 * @author 海盗狗
 * @version 1.0
 */
public class OrderPizza2 {

    Pizza pizza = null;
    String orderType = "";

    public OrderPizza2() {
        do {
            orderType = gettype();
            pizza = SimpleFactory.createPizza(orderType);

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
