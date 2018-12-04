package com.yitong.main;

import com.sun.deploy.util.Property;
import com.yitong.day01.Inner;
import com.yitong.day02.Student;
import com.yitong.day03.Child;
import com.yitong.day03.Description;
import com.yitong.implementDay01.InnerImpl;
import com.yitong.implementDay01.InnerImplCopy;
import org.apache.log4j.Logger;
import org.apache.log4j.PropertyConfigurator;

import java.util.Properties;

public class TestMain {

    private static  Logger logger = Logger.getLogger(TestMain.class) ;

    @SuppressWarnings(value = {"deprected"})
    public static void main(String args[]){

        PropertyConfigurator.configure(".\\src\\log4j.properties");
        logger.debug("--main");
        Student  student = new Student() ;

        Inner inner =  new InnerImpl();

        Inner inner1 =  new InnerImplCopy();


        ((InnerImplCopy) inner1).getTest();

        ((InnerImplCopy) inner1).testAnntion();

        student.studentStudy(inner);
        student.studentStudy( inner1 );

    }

/*
    public static void main (  String args[] ) {
        PropertyConfigurator.configure(".\\src\\log4j.properties");

        logger.info("--main");
        try {
            Class c = Class.forName( "com.yitong.day03.Child");
            //找到类上面的注解
            boolean isExist = c.isAnnotationPresent( Description.class );

            System.out.println(isExist);
            if(isExist) {
                Description description = (Description) c.getAnnotation( Description.class );
               System.out.println( description.author()+"\t"+description.desc()+"\t"+description.age());
            }

        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        }

      //  System.out.println(child.eyeColor() );

       }
  */

}
