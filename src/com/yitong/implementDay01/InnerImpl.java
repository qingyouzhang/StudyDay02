package com.yitong.implementDay01;

import com.yitong.day01.Inner;
import org.apache.log4j.Logger;

public class InnerImpl implements Inner {
    private static Logger logger = Logger.getLogger(InnerImpl.class) ;
 /**
  *@Description: TODO
  *@Param: []
  *@Return:void
 **/
    @Override
    public void learn() {
        logger.info("--study");
        System.out.println("study");
    }
}
