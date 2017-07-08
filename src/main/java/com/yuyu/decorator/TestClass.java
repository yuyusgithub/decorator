package com.yuyu.decorator;

/**
 * Created by yuyu on
 * Decorator装饰器，顾名思义，就是动态地给一个对象添加一些额外的职责，就好比为房子进行装修一样。因此，装饰器模式具有如下的特征：
 *      1.它必须具有一个装饰的对象
 *      2.它必须拥有与被装饰对象相同的接口。
 *      3.它可以给被装饰对象添加额外的功能。
 * 装饰器通过包装一个装饰对象来扩展其功能，而又不改变其接口，这实际上是基于对象的适配器模式的一种变种。它与对象的适配器模式的异同点如下:
 *      1.相同点：都拥有一个目标对象。
 *      2.不同点：适配器模式需要实现另外一个接口，而装饰器模式必须实现该对象的接口。
 */
public class TestClass {

    public static void main(String[] args) {
        ISrc source = new SrcImpl();

        // 装饰类对象
        ISrc obj = new Decorator1(new Decorator2(source));
        obj.doSomeThing();
    }
}
