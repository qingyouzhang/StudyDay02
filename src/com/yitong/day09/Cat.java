package com.yitong.day09;

/**
 * @ClassName: Cat
 * @Description: TODO
 * @Author: qingyou.zhang
 * @Date: 2018/11/30  9:25
 * @Version: 1.0
 **/
public class Cat extends  Animal {

    private  String animalName ;

    @Override
    public void eating() {
        System.out.println("ertyuiop");
    }

    public  void test () {

        System.out.println( "test() ");
    }

    public static  void main (String args[]) {

        Cat  cat  =  new Cat() ;

        Animal animal = new Cat() ;

        cat.setAnimalColol("ajgdahj");
        cat.eating();
        System.out.println(cat.getAnimalColol()  );

        animal.eating();
    }
}
