package com.yair;

import com.yair.model.RandomArray;

import java.util.Arrays;

public class Main {

    public static void main(String[] args) {

        int[] arr = new int[10];
        int[] newArr = RandomArray.randomNumbers(arr);
        System.out.println(Arrays.toString(newArr));
    }
}
