package com.heka;

import java.util.Arrays;
import java.util.Random;

public class Main {

    public static void main(String[] args) {
	    int[] array = new int[10];
	    int[] array2 = new int[10];
        Random random = new Random();
        for(int i = 0; i<array.length;i++){
            array[i] = random.nextInt(10)+1;
        }
        array2=array;
        System.out.println("Isi array(random) yang akan di urutkan : ");
        System.out.println(Arrays.toString(array));
        bubbleSort(array);
        System.out.println();
        System.out.println("Setelah diurutkan menggunakan bubble sort : ");
        System.out.println(Arrays.toString(array));
        System.out.println();
        System.out.println("Kalau yang lebih mudah menggunakan ini, tidak perlu ribet tapi hanya untuk 1 jenis variabel : ");
        Arrays.sort(array2);
        System.out.println(Arrays.toString(array2));
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

