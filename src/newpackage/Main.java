/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package newpackage;

/**
 *
 * @author basisb22
 */
public class Main {

    public static void main(String[] args) {

        Atlet daftarAtlet[] = new Atlet[10];
        //membuat objek array daftarAtlet dengan tipe Atlet yang berisi 10 data Nama dan beratBadan
        daftarAtlet[0] = new Atlet("Andi", 73);
        //mengisi data dalam array dengan Nama Andi, beratBadan 73
        daftarAtlet[1] = new Atlet("Boni", 135);
        //mengisi data dalam array dengan Nama Boni, beratBadan 135
        daftarAtlet[2] = new Atlet("Cius", 87);
        //mengisi data dalam array dengan Nama Cius, beratBadan 87
        daftarAtlet[3] = new Atlet("Dami", 96);
        //mengisi data dalam array dengan Nama Dami, beratBadan 96
        daftarAtlet[4] = new Atlet("Ekko", 75);
        //mengisi data dalam array dengan Nama Ekko, beratBadan 75
        daftarAtlet[5] = new Atlet("Fano", 65);
        //mengisi data dalam array dengan Nama Fano, beratBadan 65
        daftarAtlet[6] = new Atlet("Godi", 73);
        //mengisi data dalam array dengan Nama Godi, beratBadan 73
        daftarAtlet[7] = new Atlet("Hari", 96);
        //mengisi data dalam array dengan Nama Hari, beratBadan 96
        daftarAtlet[8] = new Atlet("Ikan", 102);
        //mengisi data dalam array dengan Nama Ikan, beratBadan 102
        daftarAtlet[9] = new Atlet("Joko", 111);
        //mengisi data dalam array dengan Nama Joko, beratBadan 111

        Atlet atletBaru = new Atlet("Koko", 96);
        //membuat objek atletBaru dengan tipe atlet yang berisi data Nama Koko dan beratBadan 96

        System.out.println("Daftar Atlet Angkat Besi");
        //menampilkan "Daftar Atlet Angkat Besi"
        System.out.println("============");
        System.out.println("Daftar Atlet");
        //menampilkan "Daftar Atlet"
        System.out.println("============");
        for (int i = 0; i < daftarAtlet.length; i++) {
            //membuat perulangan for sepanjang daftarAtlet
            System.out.println(daftarAtlet[i].getNama() + "   " + daftarAtlet[i].getBeratBadan() + " kg");
            //menampilkan data Nama dan BeratBadan dari daftarAtlet[i] ditambah " kg"
        }
        System.out.println("-----------------");
        System.out.println("");
        System.out.println("=================");
        System.out.println("Atlet Pembanding");
        //menampilkan "Atlet Pembanding"
        System.out.println("=================");
        System.out.println(atletBaru.getNama() + "    " + atletBaru.getBeratBadan() + " kg");
        //menampilkan data Nama dan BeratBadan dari atletBaru ditambah " kg"
        System.out.println("-----------------");
        System.out.println("");
        System.out.println("===========================");
        System.out.println("Memiliki Berat Lebih Ringan");
        //menampilkan "Memiliki Berat Lebih Ringan"
        System.out.println("===========================");
        searchRingan(daftarAtlet, atletBaru);
        //menjalankan method searchRingan dengan parameter daftarAtlet, atletBaru
        System.out.println("-----------------");
        System.out.println("");
        System.out.println("==========================");
        System.out.println("Memiliki Berat Lebih Berat");
        //menampilkan "Memiliki Berat Lebih Berat"
        System.out.println("==========================");
        searchBerat(daftarAtlet, atletBaru);
        //menjalankan method searchBerat dengan parameter daftarAtlet, atletBaru
        System.out.println("-----------------");
        System.out.println("");
        System.out.println("===================");
        System.out.println("Memiliki Berat Sama");
        //menampilkan "Memiliki Berat Sama"
        System.out.println("===================");
        searchSama(daftarAtlet, atletBaru);
        //menjalankan method searchSama dengan parameter daftarAtlet, atletBaru
        System.out.println("-----------------");

    }

    public static Atlet searchRingan(Atlet daftar[], Atlet atletBaru) {
        Atlet result = null;
        //nilai dari variabel result bertipe Atlet adalah null
        for (int i = 0; i < daftar.length; i++) {
            //membuat perulangan for sepanjang daftar.length
            if (atletBaru.compareTo(daftar[i]) > 0) {
                //membuat kondisi if atletBaru.compareTo(daftar[i]) > 0
                result = daftar[i];
                //nilai dari variabel result adalah daftar[i]
                System.out.println(result.getNama() + "   " + result.getBeratBadan() + " kg");
                //menampilkan data Nama dan BeratBadan dari result ditambah " kg"
            }
        }
        return result;
        //pengembalian nilai result;
    }

    public static Atlet searchBerat(Atlet daftar[], Atlet atletBaru) {
        Atlet result = null;
        //nilai dari variabel result bertipe Atlet adalah null
        for (int i = 0; i < daftar.length; i++) {
            //membuat perulangan for sepanjang daftar.length
            if (atletBaru.compareTo(daftar[i]) < 0) {
                //membuat kondisi if atletBaru.compareTo(daftar[i]) < 0
                result = daftar[i];
                //nilai dari variabel result adalah daftar[i]
                System.out.println(result.getNama() + "   " + result.getBeratBadan() + " kg");
                //menampilkan data Nama dan BeratBadan dari result ditambah " kg"
            }
        }
        return result;
        //pengembalian nilai result;
    }

    public static Atlet searchSama(Atlet daftar[], Atlet atletBaru) {
        Atlet result = null;
        //nilai dari variabel result bertipe Atlet adalah null
        for (int i = 0; i < daftar.length; i++) {
            //membuat perulangan for sepanjang daftar.length
            if (atletBaru.compareTo(daftar[i]) == 0) {
                //membuat kondisi if atletBaru.compareTo(daftar[i]) == 0
                result = daftar[i];
                //nilai dari variabel result adalah daftar[i]
                System.out.println(result.getNama() + "   " + result.getBeratBadan() + " kg");
                //menampilkan data Nama dan BeratBadan dari result ditambah " kg"
            }
        }
        return result;
        //pengembalian nilai result;
    }

}
