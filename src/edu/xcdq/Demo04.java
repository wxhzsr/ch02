package edu.xcdq;

/**
 * @author zhangshenrui
 * @date 2021/4/21 8:42
 */
public class Demo04 {
    public static int b = 2;
    //内部的类
    public static class InnerDemo04{
         int a =1;

         public void test(){
             System.out.println(b);
         }
        //  static int c = 1;  //不允许
    }
    public void test01(){
        System.out.println("test01");
    }
}
