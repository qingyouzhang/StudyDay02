package com.yitong.day09;

/**
 * @ClassName: SingleClass
 * @Description: 单例模式测试
 * @Author: qingyou.zhang
 * @Date: 2018/11/30  11:24
 * @Version: 1.0
 **/
public class SingleClass {

    private static SingleClass singleClass ;
  //  private SingleClass singleClass = null;

    private  SingleClass(){

    }

    public static SingleClass getSingleClass() {
        if(singleClass == null) {
            singleClass = new SingleClass() ;
        }

        return  singleClass ;
    }

    public static void main(String args[]){

        System.out.println( SingleClass.getSingleClass());
        System.out.println( SingleClass.getSingleClass());
    }
}
