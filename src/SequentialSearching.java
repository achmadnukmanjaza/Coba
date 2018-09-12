/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author HP
 */
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;
import java.util.Random;

public class SequentialSearching {
        public static void main(String[] args) throws IOException {
        //    Objek BufferedReader
        InputStreamReader isr = new InputStreamReader(System.in);
        BufferedReader dataIn = new BufferedReader(isr);

        //    Input jumlah Data
        System.out.print("Masukkan jumlah Data : ");
        int jlh_data = Integer.parseInt(dataIn.readLine());

        //    Array Data sebagai penampung nilai Data
        int[] data = new int[jlh_data];

        //    Pilih Metode Pengisian Data
        System.out.println("\nPENGISIAN DATA");
        System.out.println("1. Di input oleh user");
        System.out.print("2. Di input oleh program --> Pilihan [1 / 2]: ");
        int isi = Integer.parseInt(dataIn.readLine());
        switch (isi) {
            case 1:    //    Pengisian Data dilakukan oleh si User
                System.out.println();
                for (int a = 0; a < jlh_data; a++) {
                    System.out.print("Data ke-" + (a + 1) + " : ");
                    data[a] = Integer.parseInt(dataIn.readLine());
                }
                break;

            case 2:    //    Pengisian Data dilakukan oleh program secara random
                for (int a = 0; a < jlh_data; a++) {
                    data[a] = new Random().nextInt(201);    //    Data di isi secara random dengan nilai tertinggi 200
                }
                //    Tampilkan Data yang di isi oleh program
                System.out.println("\nTampilkan Data");
                for (int a = 0; a < jlh_data; a++) {
                    System.out.println("Data ke-" + (a + 1) + " : " + data[a]);
                }

                break;

            default:
                System.out.println("Pilihan tidak tersedia");    //    Jika pilihan menu tidak sesuai
        }

        //    Input Data yang dicari
        System.out.print("\nInput Data yang dicari : ");
        int cari = Integer.parseInt(dataIn.readLine());

        //    Proses Sequential Searching
        boolean temu = false;        //    Variable indikator jika data sudah ditemukan
        int urutan = 0;                //    Variable untuk mengetahui urutan ke berapa data yang dicari
        for (int a = 0; a < jlh_data; a++) {
            System.out.print(data[a] + " == " + cari);
            if (data[a] == cari) {
                System.out.println("    --> Data ketemu");
                urutan = a + 1;    //    Kenapa a+1 ? Karena a merupakan posisi index dimana index dimulai dari 0 ...
                temu = true;    //    Sedangkan user menghitungnya dari 1. 
                break;
            } else {
                System.out.println("    --> Data belum ketemu");
            }
        }

        if (temu == true) {
            System.out.println("\nData ditemukan pada urutan ke-" + (urutan));
        } else {
            System.out.println("\nData tidak ditemukan");
        }
    }
}