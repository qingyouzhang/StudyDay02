package com.yitong.day08;

import java.util.ArrayList;
import java.util.Date;

/**
 * @ClassName: TestFan
 * @Description: TODO
 * @Author: qingyou.zhang
 * @Date: 2018/11/29  15:05
 * @Version: 1.0
 **/
public class TestFan {

    public static   void main (String args[]) {

        ArrayList< String > arrayListString =  new ArrayList<String>() ;
        arrayListString.add("String1") ;

        ArrayList<Integer>   arrayListInteger = new ArrayList<Integer>( ) ;
        arrayListInteger.add(12) ;

        Date d = new Date();
        System.out.println(arrayListString.get(0));
        System.out.println(d.getClass());
    }
}
