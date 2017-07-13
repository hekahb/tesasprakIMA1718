package com.heka;

import java.util.HashSet;
import java.util.Scanner;

/**
 * Created by MSI on 12 Jul 2017.
 */
public class peserta {
    int nomor;
    String nama;
    int nilai;

    public peserta(int nomor, String nama, int nilai) {
        this.nomor = nomor;
        this.nama = nama;
        this.nilai = nilai;
    }

    public int getNomor() {
        return nomor;
    }
    public String getNama() {
        return nama;
    }
    public int getNilai() {
        return nilai;
    }

}
