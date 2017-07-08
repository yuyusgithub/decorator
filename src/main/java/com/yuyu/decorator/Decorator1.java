package com.yuyu.decorator;

/**
 * Created by yuyu
 */
public class Decorator1 implements ISrc{

    ISrc src;

    public Decorator1(ISrc src){
        this.src = src;
    }

    public void doSomeThing() {
        System.out.println("装饰器 1 方法--前");
        src.doSomeThing();
        System.out.println("装饰器 1 方法--前");
    }

}
