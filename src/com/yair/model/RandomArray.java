package com.yair.model;

import java.util.Random;

public class RandomArray {

    public static int[] randomNumbers (int[] arr){
        Random rnd = new Random();
        for (int i = 0; i < arr.length; i++) {
            arr[i] = rnd.nextInt(100);
        }
        return arr;
    }
}
