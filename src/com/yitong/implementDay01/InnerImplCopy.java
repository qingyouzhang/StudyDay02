package com.yitong.implementDay01;

import com.yitong.day01.Inner;

public class InnerImplCopy  implements Inner {
    @Override
    public void learn() {
        System.out.println("study sty");
    }

    @Deprecated
    public void getTest(){
        System.out.println("getTest()");
    }


    public void testAnntion(){
        System.out.println("testAnntion()");
    }
}
