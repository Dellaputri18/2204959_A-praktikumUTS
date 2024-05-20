/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package soal;

/**
 *
 * @author dellaputrw
 */
public class Soal4_Limas {
    private double luasAlas;
    private double luasSelubung;
    private double tinggi;

    public Soal4_Limas() {
        this.luasAlas = 1;
        this.luasSelubung = 1;
        this.tinggi = 1;
    }

    public Soal4_Limas(double luasAlasBaru, double luasSelubungBaru, double tinggiBaru) {
        this.luasAlas = luasAlasBaru;
        this.luasSelubung = luasSelubungBaru;
        this.tinggi = tinggiBaru;
    }

    public double getLuas() {
        return luasAlas + luasSelubung;
    }

    public double getVolume() {
        return (1.0 / 3) * luasAlas * tinggi;
    }

    public void setLuasAlas(double luasAlasBaru) {
        this.luasAlas = luasAlasBaru;
    }

    public void setLuasSelubung(double luasSelubungBaru) {
        this.luasSelubung = luasSelubungBaru;
    }

    public void setTinggi(double tinggiBaru) {
        this.tinggi = tinggiBaru;
    }
    public static void printInfoLimas(Soal4_Limas limas) {
        System.out.println("Limas segi empat dengan luas alas : " + limas.luasAlas +
                ", luas selubung : " + limas.luasSelubung +
                " dan tinggi : " + limas.tinggi +
                ". Luasnya : " + limas.getLuas() +
                ", sedangkan volumenya : " + limas.getVolume());
    }
    
    public static void main(String[] args) {
        Soal4_Limas limas1 = new Soal4_Limas();
        Soal4_Limas limas2 = new Soal4_Limas(30, 40, 50);
        Soal4_Limas limas3 = new Soal4_Limas(25, 35, 45);

        printInfoLimas(limas1);
        printInfoLimas(limas2);
        printInfoLimas(limas3);
    }
   
}
