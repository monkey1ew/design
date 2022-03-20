package com.fqh.simplefactory.pizza;

/**
 * @author 海盗狗
 * @version 1.0
 * 将Pizza类做成抽象类
 */
public abstract class Pizza {

    protected String name;
//    不同的pizza准备的材料不同————>abstract
    public abstract void prepare();

    public void bake() {
        System.out.println(name + " baking");
    }
    public void cut() {
        System.out.println(name + " cutting");
    }
    public void box() {
        System.out.println(name + " boxing");
    }

    public void setName(String name) {
        this.name = name;
    }
}
