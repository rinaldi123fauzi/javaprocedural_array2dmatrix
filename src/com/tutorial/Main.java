package com.tutorial;
import java.util.Arrays;
public class Main {

    public static void main(String[] args) {
	// write your code here

        //penambahan matriks
        System.out.println("===OPERASI MATRIKS===");
        int[][] matriks_a = {
                {1,2,3},
                {4,5,6},
                {7,8,9},
        };

        int[][] matriks_b = {
                {11,12,13},
                {14,15,16},
                {17,18,19},
        };

        printArray(matriks_a);
        printArray(matriks_b);

        int[][] hasilTambah = tambahMatriks(matriks_a,matriks_b);
        printArray(hasilTambah);

        System.out.println("Address matriks a = " + Arrays.toString(matriks_a));
        System.out.println("Address matriks b = " + Arrays.toString(matriks_b));

        //perkalian matriks
        int[][] matriks_c = {
                {1,2},
                {3,4},
        };

        int[][] matriks_d = {
                {11,12},
                {13,14}
        };

        int[][] hasilKali = kaliMatriks(matriks_c,matriks_d);
        printArray(hasilKali);

        System.out.println("Address matriks a = " + Arrays.toString(matriks_c));
        System.out.println("Address matriks b = " + Arrays.toString(matriks_d));
    }
    private static int[][] kaliMatriks(int[][] matriks_1, int[][] matriks_2){
        int baris_c = matriks_1.length;
        int kolom_c = matriks_1[0].length;

        int baris_d = matriks_2.length;
        int kolom_d = matriks_2[0].length;

        //jika c . d maka jumlah baris akan mengikuti jumlah matriks_c, dan kolom akan mengikuti jumlah matriks_d
        int[][] hasilKali = new int[baris_c][kolom_d];

        int buffer;
        for (int i = 0; i < baris_c; i++){
            for (int j = 0; j < kolom_d; j++){
                buffer = 0;
                for (int k = 0; k < kolom_c; k++){
                    buffer += matriks_1[i][k] * matriks_2[k][j];
                }
                hasilKali[i][j] = buffer;
            }
        }
        return hasilKali;
    }

    private static int[][] tambahMatriks(int[][] matriks_1, int[][] matriks_2){
        int baris_a = matriks_1.length;
        int kolom_a = matriks_1[0].length;

        //mengecek jumlah baris atau kolom yang sama
        int baris_b = matriks_2.length;
        int kolom_b = matriks_2[0].length;

        int[][] hasil = new int[baris_a][kolom_a];
        if (baris_a == baris_b && kolom_a == kolom_b){
            for (int i = 0; i < baris_a; i++){
                for (int j = 0; j < kolom_a; j++){
                    hasil[i][j] = matriks_1[i][j] + matriks_2[i][j];
                }
            }
        }
        else {
            System.out.println("jumlah baris atau kolom tidak sama");
        }

        return hasil;
    }

    private static void printArray(int[][] dataArray){
        int baris = dataArray.length;
        int kolom = dataArray[0].length;
        for (int i = 0; i < baris; i++){
            System.out.print("[");
            for (int j = 0; j < kolom; j++){
                System.out.print(dataArray[i][j]);
                if (j < (kolom - 1)){
                    System.out.print(", ");
                }
                else{
                    System.out.print("]");
                }
            }
            System.out.print("\n");
        }
        System.out.print("\n");
    }
}
