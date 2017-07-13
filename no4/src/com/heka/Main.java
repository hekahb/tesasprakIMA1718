package com.heka;

import java.util.*;

public class Main {

    public static void main(String[] args) {
	    int[] array = new int[10];
        Random random = new Random();
        for(int i = 0; i<array.length;i++){
            array[i] = random.nextInt(10)+1;
        }
        System.out.println("Isi array(random) yang ada : ");
        System.out.println(Arrays.toString(array));
        System.out.println();
        bubbleSort(array);
        System.out.println("Diurutkan terlebih dahulu : ");
        System.out.println(Arrays.toString(array));
        System.out.println();
        System.out.println("Setelah duplikat dihilangkan : ");
        int end = array.length;
        Set<Integer> set = new HashSet<Integer>();
        for(int i = 0; i < end; i++){
            set.add(array[i]);
        }
        System.out.println(Arrays.toString(set.toArray()));
    }
    private static void bubbleSort(int[] arr) {
        boolean swapped = true;
        int j = 0;
        int tmp;
        while (swapped) {
            swapped = false;
            j++;
            for (int i = 0; i < arr.length - j; i++) {
                if (arr[i] > arr[i + 1]) {
                    tmp = arr[i];
                    arr[i] = arr[i + 1];
                    arr[i + 1] = tmp;
                    swapped = true;
                }
            }
        }
    }
}
