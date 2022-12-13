package com.itfactory.cap5;

import java.util.Random;

public class Unchecked {
    public static void main(String[] args) {
        try {
            int[] arr = {1, 2, 3, 4};
            int index = 6;
            System.out.println(arr[index]);
        } catch (RuntimeException e) {
            e.printStackTrace();
        }
    }
}
