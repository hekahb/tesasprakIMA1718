package com.heka;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
	// write your code here
        Scanner scanner = new Scanner(System.in);
        System.out.println("Pengecekan kata polindrom atau tidak");
        System.out.print("Masukan kata : ");
        String kata = scanner.nextLine();
        String balik = new StringBuilder(kata).reverse().toString();
        int result = kata.compareToIgnoreCase(balik);
        if(result==0){
            System.out.println("True");
        }
        else {
            System.out.println("False");
        }
    }
}
