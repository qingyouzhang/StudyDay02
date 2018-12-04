package com.yitong.day07;

import java.util.HashMap;
import java.util.Map;

/**
 * @ClassName: TestThrow
 * @Description: TODO
 * @Author: qingyou.zhang
 * @Date: 2018/11/28  10:01
 * @Version: 1.0
 **/
public class TestThrow {


    HashMap map;
    private static  final  int NUMER = 10;
    private  static  final  int NUMERTAG = 0 ;

    public static  void  main (  String  args[] ) {
        try {
            int result =  NUMER/NUMERTAG ;
            System.out.println(  result );
        }catch (Exception e){
            e.printStackTrace();
        }

    }
}
