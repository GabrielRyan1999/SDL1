/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package SortingLomba;

/**
 *
 * @author basisb20
 */
public class Main {

    public static void main(String[] args) {
        Perenang[] DaftarPerenang = new Perenang[8];
        DaftarPerenang[0] = new Perenang("To Kenneth", "Hong Kong", 22.54);
        DaftarPerenang[1] = new Perenang("Teong", "Singapore", 22.59);
        DaftarPerenang[2] = new Perenang("Yu Hexin", "China", 22.11);
        DaftarPerenang[3] = new Perenang("Nakamura", "Japan", 22.20);
        DaftarPerenang[4] = new Perenang("Mussin", "Kazakhstan", 22.64);
        DaftarPerenang[5] = new Perenang("Nakao", "Japan", 22.46);
        DaftarPerenang[6] = new Perenang("Lin", "Taipei", 22.67);
        DaftarPerenang[7] = new Perenang("Khade", "India", 22.47);

        System.out.println("============ DAFTAR PERENANG ============");
        System.out.printf("%-5s", "No.");
        System.out.printf("%-15s", "Negara");
        System.out.printf("%-15s", "Nama");
        System.out.printf("%-10s", "Waktu");
        System.out.println("");
        System.out.println("----------------------------------------");
        for (int i = 0; i < DaftarPerenang.length; i++) {
            System.out.printf("%-5s", (i + 1));
            System.out.printf("%-15s", DaftarPerenang[i].getNegara());
            System.out.printf("%-15s", DaftarPerenang[i].getNama());
            System.out.printf("%.2f", DaftarPerenang[i].getWaktu());
            System.out.println("");
        }
        System.out.println("");

        System.out.println("============ ASCENDING ============");
        System.out.println("Bubble");
        cetakPerenang(bubbleSortA(DaftarPerenang));
        System.out.println("");
        System.out.println("Selection");
        cetakPerenang(selectionSortD(DaftarPerenang));
        System.out.println("");
        System.out.println("Insertion");
        cetakPerenang(insertionSortA(DaftarPerenang));
        System.out.println("");
        System.out.println("=========== DESCENDING ===========");
        System.out.println("Bubble");
        cetakPerenang(bubbleSortD(DaftarPerenang));
        System.out.println("");
        System.out.println("Selection");
        cetakPerenang(selectionSortD(DaftarPerenang));
        System.out.println("");
        System.out.println("Insertion");
        cetakPerenang(insertionSortD(DaftarPerenang));

    }

    public static Perenang[] bubbleSortA(Perenang[] DaftarPerenang) {
        boolean ulang = false;
        do {
            ulang = false;
            for (int i = 0; i < DaftarPerenang.length - 1; i++) {
                if (DaftarPerenang[i].compareTo(DaftarPerenang[i + 1]) > 0) {
                    Perenang a = DaftarPerenang[i];
                    DaftarPerenang[i] = DaftarPerenang[i + 1];
                    DaftarPerenang[i + 1] = a;
                    ulang = true;
                }
            }
        } while (ulang);
        return DaftarPerenang;
    }

    public static Perenang[] bubbleSortD(Perenang[] DaftarPerenang) {
        boolean ulang = false;
        do {
            ulang = false;
            for (int i = 0; i < DaftarPerenang.length - 1; i++) {
                if (DaftarPerenang[i].compareTo(DaftarPerenang[i + 1]) < 0) {
                    Perenang a = DaftarPerenang[i];
                    DaftarPerenang[i] = DaftarPerenang[i + 1];
                    DaftarPerenang[i + 1] = a;
                    ulang = true;
                }
            }
        } while (ulang);
        return DaftarPerenang;
    }

    public static Perenang[] selectionSortA(Perenang[] DaftarPerenang) {
        for (int i = 0; i < DaftarPerenang.length; i++) {
            int min = i;
            for (int j = i + 1; j < DaftarPerenang.length; j++) {
                if (DaftarPerenang[j].compareTo(DaftarPerenang[min]) < 0) {
                    min = j;
                }
            }
            if (DaftarPerenang[min] != DaftarPerenang[i]) {
                Perenang a = DaftarPerenang[min];
                DaftarPerenang[min] = DaftarPerenang[i];
                DaftarPerenang[i] = a;
            }
        }
        return DaftarPerenang;
    }

    public static Perenang[] selectionSortD(Perenang[] DaftarPerenang) {
        for (int i = 0; i < DaftarPerenang.length; i++) {
            int min = i;
            for (int j = i + 1; j < DaftarPerenang.length; j++) {
                if (DaftarPerenang[j].compareTo(DaftarPerenang[min]) > 0) {
                    min = j;
                }
            }
            if (DaftarPerenang[min] != DaftarPerenang[i]) {
                Perenang a = DaftarPerenang[min];
                DaftarPerenang[min] = DaftarPerenang[i];
                DaftarPerenang[i] = a;
            }
        }
        return DaftarPerenang;
    }

    public static Perenang[] insertionSortA(Perenang[] DaftarPerenang) {
        for (int i = 1; i < DaftarPerenang.length; i++) {
            Perenang insert = DaftarPerenang[i];
            int holePosition = i;
            while ((holePosition > 0) && (DaftarPerenang[holePosition - 1].compareTo(insert) > 0)) {
                DaftarPerenang[holePosition] = DaftarPerenang[holePosition - 1];
                holePosition = holePosition - 1;
            }
            DaftarPerenang[holePosition] = insert;
        }
        return DaftarPerenang;
    }

    public static Perenang[] insertionSortD(Perenang[] DaftarPerenang) {
        for (int i = 1; i < DaftarPerenang.length; i++) {
            Perenang insert = DaftarPerenang[i];
            int holePosition = i;
            while ((holePosition > 0) && (DaftarPerenang[holePosition - 1].compareTo(insert) < 0)) {
                DaftarPerenang[holePosition] = DaftarPerenang[holePosition - 1];
                holePosition = holePosition - 1;
            }
            DaftarPerenang[holePosition] = insert;
        }
        return DaftarPerenang;
    }
 public static void cetakPerenang(Perenang[] DaftarPerenang) {
        System.out.printf("%-15s", "Negara");
        System.out.printf("%-15s", "Nama");
        System.out.printf("%-15s", "Waktu");
        System.out.println("");
        for (int i = 0; i < DaftarPerenang.length; i++) {
            System.out.printf("%-15s", DaftarPerenang[i].getNegara());
            System.out.printf("%-15s", DaftarPerenang[i].getNama());
            System.out.printf("%-15s", DaftarPerenang[i].getWaktu());
            System.out.println("");
        }
}
}