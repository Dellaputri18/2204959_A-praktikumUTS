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
public class Soal3_Digit {
    public static int sumDigits(long n) {
        int total = 0;

        while (n != 0) {
            int digit = (int) (n % 10);
            total += digit;
            n /= 10;
        }

        return total;
    }
    
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        
        System.out.print("Masukan Sebuah Bilangan Bulat: ");
        long bilangan = input.nextLong();
        
        int jumlah = sumDigits(bilangan);
        
        System.out.println("Jumlah digit dalam " + bilangan + " adalah " + jumlah);
        
        input.close();
    }
}
