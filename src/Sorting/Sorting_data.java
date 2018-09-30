/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Sorting;

import java.util.Arrays;

/**
 *
 * @author basisb20
 */
public class Sorting_data {

    public static void main(String[] args) {

        int[] angka = {23, 43, 56, 1, 34, 89, 65, 4, 77, 56, 54, 33, 45, 23, 89, 76, 12, 67, 54, 8, 9, 44, 98, 100};

         System.out.println("Ascending");
        System.out.println("Bubble Sort");
        System.out.println(Arrays.toString(bubbleSortA(angka)));
        System.out.println("Selection Sort");
        System.out.println(Arrays.toString(selectionSortA(angka)));
        System.out.println("Insertion Sort");
        System.out.println(Arrays.toString(insertionSortA(angka)));
        
        System.out.println("Descending");
        System.out.println("Bubble Sort");
        System.out.println(Arrays.toString(bubbleSortD(angka)));
        System.out.println("Selection Sort");
        System.out.println(Arrays.toString(selectionSortD(angka)));
        System.out.println("Insertion Sort");
        System.out.println(Arrays.toString(insertionSortD(angka)));
    }

    public static int[] bubbleSortA(int[] angka) {
        boolean ulang;
        do {
            ulang = false;
            for (int i = 0; i < angka.length - 1; i++) {
                if (angka[i] > (angka[i + 1])) {
                    int a = angka[i];
                    angka[i] = angka[i + 1];
                    angka[i + 1] = a;
                    ulang = true;
                }
            }
        } while (ulang);
        return angka;
    }

    public static int[] bubbleSortD(int[] angka) {
        boolean ulang;
        do {
            ulang = false;
            for (int i = 0; i < angka.length - 1; i++) {
                if (angka[i] < (angka[i + 1])) {
                    int a = angka[i];
                    angka[i] = angka[i + 1];
                    angka[i + 1] = a;
                    ulang = true;
                }
            }
        } while (ulang);
        return angka;
    }

    public static int[] selectionSortA(int[] angka) {
        for (int i = 0; i < angka.length; i++) {
            int min = i;
            for (int j = i + 1; j < angka.length; j++) {
                if (angka[j] < angka[min]) {
                    min = j;
                }
            }
            if (angka[min] != i) {
                int a = angka[min];
                angka[min] = angka[i];
                angka[i] = a;
            }
        }
        return angka;
    }

    public static int[] selectionSortD(int[] angka) {
        for (int i = 0; i < angka.length; i++) {
            int min = i;
            for (int j = i + 1; j < angka.length; j++) {
                if (angka[j] > angka[min]) {
                    min = j;
                }
            }
            if (angka[min] != i) {
                int a = angka[min];
                angka[min] = angka[i];
                angka[i] = a;
            }
        }
        return angka;
    }

    public static int[] insertionSortA(int[] angka) {
        for (int i = 1; i < angka.length; i++) {
            int insert = angka[i];
            int posisi = i;
            while ((posisi > 0) && (angka[posisi - 1] > insert)) {
                angka[posisi] = angka[posisi - 1];
                posisi = posisi - 1;
            }
            angka[posisi] = insert;
        }
        return angka;
    }

    public static int[] insertionSortD(int[] angka) {
        for (int i = 1; i < angka.length; i++) {
            int insert = angka[i];
            int posisi = i;
            while ((posisi > 0) && (angka[posisi - 1] < insert)) {
                angka[posisi] = angka[posisi - 1];
                posisi = posisi - 1;
            }
            angka[posisi] = insert;
        }
        return angka;
    }
}
