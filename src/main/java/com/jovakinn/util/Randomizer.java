package com.jovakinn.util;

import java.util.Random;

public class Randomizer {

    // Returns random Integer in diapason min and max
    public static Integer getRandomInteger(Integer min, Integer max){

        return min + new Random().nextInt(max - min);
    }

    public static String getRandomIp(){

        return  getRandomInteger(100, 255) + "." +
                getRandomInteger(100, 255) + "." +
                getRandomInteger(100, 255) + "." +
                getRandomInteger(100, 255);
    }

    public static Integer getRandomSessionId(){
        return getRandomInteger(10_000_000, 99_999_999);
    }
}
