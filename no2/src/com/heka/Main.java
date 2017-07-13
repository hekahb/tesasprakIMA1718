package com.heka;

import com.sun.istack.internal.NotNull;

import java.util.*;

public class Main {
    public static void main(String[] args) {
        // write your code here
        int nomor;
        String nama;
        int nilai;
        String[][] ranking = new String[3][10];
        Scanner scanner = new Scanner(System.in);
        ArrayList<peserta> list = new ArrayList<>();
        boolean selesai=false;
        System.out.println("Input data peserta lomba");
        while (selesai!=true)
        {
            System.out.print("Nomor : ");
            nomor = scanner.nextInt();
            if (nomor==9999) {
                selesai=true;
                break;
            }
            scanner.nextLine();
            System.out.print("Nama : ");
            nama = scanner.nextLine();
            System.out.print("Nilai : ");
            nilai = scanner.nextInt();
            list.add(new peserta(nomor,nama,nilai));
        }
        Collections.sort(list, new Comparator<peserta>() {
            @Override
            public int compare(peserta o1, peserta o2) {
                if(o1.nilai>o2.nilai)
                    return -1;
                else
                    return 1;
            }
        });
        ranking = juara(list);
        displayarray(ranking);
        viewAll(list);
    }
    private static void displayarray(String[][] arr){
        for(int i=0; i<3;i++){
            System.out.print("Juara ke-"+(i+1)+" : ");
            for (int j =0; j<10;j++){
                if(arr[i][j]!=null){
                    System.out.print(arr[i][j]+"\t");
                }
            }
            System.out.println();
        }
    }
    private static String[][] juara(ArrayList<peserta> list){
        String[][] rank = new String[3][10];
        int i=0;
        int j=0;
        int skor=1000;
        for(int k=0;k<list.size();k++){
            if(skor==1000){
                rank[i][j]=list.get(k).getNama();
                skor=list.get(k).getNilai();
            }
            else if(skor==list.get(k).getNilai()){
                j++;
                rank[i][j]=list.get(k).getNama();
            }
            else if(list.get(k).getNilai()<skor && i<2){
                rank[i+1][j]=list.get(k).getNama();
                skor=list.get(k).getNilai();
                i++;
            }
        }
        return rank;
    }
    private static void viewAll(ArrayList<peserta> list){
        System.out.println();
        System.out.println("List Peserta");
        int i =1;
        for (peserta p : list){
            System.out.println("No : "+i+"\tNama : "+p.nama+"\tNilai : "+p.nilai+"\tNomor Peserta : "+p.nomor);
            i++;
        }
    }
}
