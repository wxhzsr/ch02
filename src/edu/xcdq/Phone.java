package edu.xcdq;

/**
 * @author zhangshenrui
 * @date 2021/4/20 14:51
 */
public class Phone {
    public double width;
    public double height;
    public int weight;
    public String color;
    /*
        构造方法 1 一定没有返回值 2 方法的名字必须和类名完全一致
     */
    // 无参构造方法，不管写不写，系统都会生成
    public Phone(){
        System.out.println("我被调用了，有一个对象产生了");
    }
    //构造方法 包含全部的参数 全参构造方法
    public Phone(double kuandu , double gaodu , int zhongliang ,String yanse){
        width = kuandu;
        height = gaodu;
        weight = zhongliang;
        color =yanse;
    }

    public Phone (double kuandu, double gao , int zhongliang){
        width = kuandu;
        height = gao;
        weight = zhongliang;
    }

    public Phone (int zhongliang,double kuandu, double gao){
        width = kuandu;
        height = gao;
        weight = zhongliang;
    }

    public Phone (double gao,int zhongliang,double kuandu){
        width = kuandu;
        height = gao;
        weight = zhongliang;
    }
    public void startUp () {
        System.out.println("正在开机");
    }
    public void suopin () {
        System.out.println("手机即将锁屏");
    }
    //方法的复写
}

