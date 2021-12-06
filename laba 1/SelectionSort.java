package com.company;

import java.lang.reflect.Array;
import java.util.Arrays;

public class SelectionSort {
    public void sort(int[] arr) {
        for (int i = 0; i < arr.length; i++) {
            int minVal = arr[i];
            int minIndex = i;

            for (int j = i+1; j < arr.length; j++) {
                if (arr[j] < minVal) {
                    minVal = arr[j];
                    minIndex = j;

                }

            }
            if(i != minIndex) {
                int temp = arr[i];
                arr[i] = arr[minIndex];
                arr[minIndex] = temp;

            }
        }
        System.out.println(Arrays.toString(arr));
    }
}
