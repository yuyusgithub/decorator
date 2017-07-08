package com.yuyu.decorator;

/**
 * Created by yuyu
 */
public class Decorator2 implements ISrc{

    ISrc src;

    public Decorator2(ISrc src){
        this.src = src;
    }

    public void doSomeThing() {
        System.out.println("装饰器 2 方法--前");
        src.doSomeThing();
        System.out.println("装饰器 2 方法--前");
    }
}
