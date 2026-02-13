package com.mycompany.tugas1_pbo;

import java.util.Scanner;

public class Tugas1_No2_PBO {
    public static void main(String[] args) {
        Scanner input = new Scanner (System.in);
        int uang;
        boolean hujan;
        
        System.out.println("Masukan Jumlah Uang Anda : ");
        uang = input.nextInt();
        
        System.out.println("Apakah Sedang Hujan? (True/False) : ");
        hujan = input.nextBoolean();
        
        String keputusan = ((uang > 5000) && (!hujan))
                ? "Yeayy Beli Gorengan!"
                : "Ga ah lagi hujan:(";
        System.out.println("Keputusan : " + keputusan);
        
        input.close();
    }
}
    
