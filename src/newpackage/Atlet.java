/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package newpackage;

/**
 *
 * @author basisb22
 */
public class Atlet implements Comparable{
    private String nama;
    private double beratBadan;

    public Atlet(String nama, double beratBadan) {
        this.nama = nama;
        this.beratBadan = beratBadan;
    }

    public double getBeratBadan() {
        return beratBadan;
    }

    public void setBeratBadan(double beratBadan) {
        this.beratBadan = beratBadan;
    }

    public String getNama() {
        return nama;
    }

    public void setNama(String nama) {
        this.nama = nama;
    }

    @Override
    public int compareTo(Object o) {
        
        Atlet other = (Atlet) o;
        if (beratBadan < other.beratBadan) {
            return -1;
        }
        if (beratBadan > other.beratBadan) {
            return 1;
        }
        return 0;
    }
    }
    
    

