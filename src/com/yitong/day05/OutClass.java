package com.yitong.day05;

public class OutClass {
    // 外部数据定义
     private int age =  19 ;

     private static final int   FLAGSTAUTS = 4 ;
     //定义内部类
     public class Inner {
         private int b =  12;

         Inner(){
            age =  30 ;
            System.out.println("外部类 赋值");
         }
         public void test () {
             //调用外部数据方法
             System.out.println("外部数据 age = "+OutClass.this.age);
             OutClass.this.test();
             System.out.println("外部数据 age = "+OutClass.this.FLAGSTAUTS);

             System.out.println("外部数据 b = "+this.b);
         }
     }

     /**
      *@Description: 获取内部对象方法
      *@Param: []
      *@Return:void
     **/
     public void test(){
         System.out.println(this.new Inner().b);
     }

     /**
      *@Description: main 方法入口
      *@Param: [args]
      *@Return:void
     **/
     public static void main ( String args[] ) {

         OutClass outClass  =  new OutClass() ;

         outClass.test();
         Inner inner =  outClass.new Inner() ;

         inner.test();
     }
}
