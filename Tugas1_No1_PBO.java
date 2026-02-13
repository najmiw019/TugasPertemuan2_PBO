package com.mycompany.tugas1_pbo;

import java.util.Scanner;

public class Tugas1_No1_PBO {
    public static void main(String[] args) {
        Scanner input = new Scanner (System.in);
        int a,b,c;
        
        System.out.println("Silahkan Masukan Angka Pertama : ");
        a = input.nextInt();
        System.out.println("Silahkan Masukan Angka Kedua : ");
        b = input.nextInt();
        System.out.println("Silahkan Masukan Angka Ketiga : ");
        c = input.nextInt();
        
        
        System.out.println("== Hasil Bilangan Operasi ==");
        System.out.println("Penjumlahan (+) :" + (a+b+c));
        System.out.println("Pengurangan (-) :" + (a-b-c));
        System.out.println("Perkalian (*) :" + (a*b*c));
        System.out.println("Pembagian (/) :" + (a/b/c));
        
        input.close();
    }
}