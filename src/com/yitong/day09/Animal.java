package com.yitong.day09;

/**
 * @ClassName: Animal
 * @Description: TODO
 * @Author: qingyou.zhang
 * @Date: 2018/11/30  9:15
 * @Version: 1.0
 **/
public class Animal {
    private String animalColol;

    private int footNumer;

    private String animalName;

    public Animal() {

    }
    public void eating() {
     System.out.println(" eating no ");
    }


    public String getAnimalColol() {
        return animalColol;
    }

    public void setAnimalColol(String animalColol) {
        this.animalColol = animalColol;
    }
    public void setFootNumer(int footNumer) {
        this.footNumer = footNumer;
    }

    public void setAnimalName(String animalName) {
        this.animalName = animalName;
    }
    public int getFootNumer() {
        return footNumer;
    }
}
