/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package soal;

import java.util.Random;

/**
 *
 * @author dellaputrw
 */
public class Soal1_Bulan {
    public static void main(String[] args) {
        String[] Bulan = {"Januari", "Februari", "Maret", "April", "Mei", "Juni", "Juli", "Agustus", "September", "Oktober", "November", "Desember"};
        
        Random acak = new Random();
        
        int urutan = acak.nextInt(12) + 1;
        
        System.out.println("Hasil Melakukan pengacakan pada bilangan:");
        System.out.println("Nomor Bulan\t: " + urutan);
        System.out.println("Nama Bulan\t: " + Bulan[urutan-1]);
    }
    
}
