/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package soal;

import java.util.Scanner;

/**
 *
 * @author dellaputrw
 */
public class Soal2_Bilangan {
    
    public static void main(String[] args) {
        
        Scanner input = new Scanner(System.in);
        
        int bilangan;
        int jumlah = 0;
        int BilanganPositif = 0;
        int BilanganNegatif = 0;
        double total = 0;
        
        System.out.print("Masukkan bilangan, program akan berhenti jika memasukan nilai 0: ");
        
        while((bilangan = input.nextInt()) != 0) {
            if (bilangan < 0) {
                BilanganNegatif++;
            } else if (bilangan > 0) {
                BilanganPositif++;
            }
            
            if (bilangan != 0){
                total += bilangan;
                jumlah++;
            }
        }
        
        if (jumlah == 0){
            System.out.println("Tidak ada nilai.");
        }else {
            double hasilRataRata = (double) total / jumlah;
            
            System.out.println("Jumlah bilangan positif adalah " + BilanganPositif);
            System.out.println("Jumlah bilangan negatif adalah " + BilanganNegatif);
            System.out.println("Nilai total adalah " + total);
            System.out.printf("Nilai rata-rata %.2f\n", hasilRataRata);
        }
    }
    
}