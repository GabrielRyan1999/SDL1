/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Sorting_lombaRenang;

/**
 *
 * @author basisb20
 */
public class Perenang implements Comparable {

    private String nama;
    private String Negara;
    private double waktu;

    public Perenang() {
    }

    public Perenang(String nama, String Negara, double waktu) {
        this.nama = nama;
        this.Negara = Negara;
        this.waktu = waktu;
    }

    public String getNama() {
        return nama;
    }

    public void setNama(String nama) {
        this.nama = nama;
    }

    public String getNegara() {
        return Negara;
    }

    public void setNegara(String Negara) {
        this.Negara = Negara;
    }

    public double getWaktu() {
        return waktu;
    }

    public void setWaktu(double waktu) {
        this.waktu = waktu;
    }

    @Override
    public int compareTo(Object o) {
        Perenang atlet = (Perenang) o;
        if (this.getWaktu() < atlet.getWaktu()) {
            return -1;
        }
        if (this.getWaktu() > atlet.getWaktu()) {
            return 1;
        }
        return 0;
    }

}
