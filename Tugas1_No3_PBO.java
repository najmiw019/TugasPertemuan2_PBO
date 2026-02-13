package com.mycompany.tugas1_pbo;

import java.util.Scanner;

public class Tugas1_No3_PBO {
    public static void main(String[] args) {
        Scanner input = new Scanner (System.in);
        char ch1 = '1';
        char ch2 = '2';
        int hasil = ch1 + ch2;
        
        System.out.println("Karakter 1 (ASCII : " + (int)ch1 +")");
        System.out.println("Karakter 2 (ASCII : " + (int)ch2 +")");
        System.out.println("Hasil penjumlahan ASCII : " + hasil);
        
        input.close();
    }
}
