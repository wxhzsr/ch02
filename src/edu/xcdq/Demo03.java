package edu.xcdq;

/**
 * @author zhangshenrui
 * @date 2021/4/21 8:24
 */
public class Demo03 {
    int size = 0 ;

    //代码块
    {
        size = 10;
    }
    //静态变量
    static int count = 30;
    //静态代码块
    static {
        count = 10;
    }
    public Demo03(){
        System.out.println("构造方法");
        System.out.println(count);
        System.out.println(size);
    }
}
