package com.company;

import java.util.Random;

public class Oponent {


    public int OponentRandom() {

        int min = 1;
        int max = 3;

        Random rn = new Random();
        int result = rn.nextInt(max) + min;

        return result;



    }



}
