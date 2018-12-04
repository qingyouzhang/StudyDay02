package com.yitong.day04;


import java.lang.annotation.*;

/*关于注解的理解
\--------------------------------------
\    注解
\--------------------------------------
 1.是怎样判断和执行，作用是什么
 2.注解在实际开发中的应用
 3.注解的语法格式及相关使用方法，注意事项
 4.类比Spring,Mybatis ,JSR-303验证
 5.实际项目需求
 */
@Target({ElementType.METHOD,ElementType.TYPE})
@Retention(RetentionPolicy.RUNTIME)
@Inherited
@Documented
public @interface Table {
    String value();
}
