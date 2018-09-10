/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

import javax.swing.JOptionPane;
import java.util.Random;

/**
 *
 * @author HP
 */
public class BinaryAcak {

   public static int[] data = null;
    public static int awal, tengah, akhir, temp, count, jumlah, cari1, cari2;

    public static void main(String[] args) {
        System.out.println("Achmad Nukman Jaza");
        System.out.println("XRPL6/03");
        //	Input jumlah data
        jumlah = Integer.parseInt(JOptionPane.showInputDialog("Masukkan jumlah angka = "));

        //	Input tiap nilai dan simpan ke array
        data = new int[jumlah];
        for (int x = 0; x < data.length; x++) {
            data[x] = new Random().nextInt(201);
        }

        //	Menampilkan data sebelum di sorting
        System.out.print("\nData    : ");
        for (int x = 0; x < data.length; x++) {
            System.out.print(data[x] + " ");
        }

        //	Proses sorting
        sorting();

        //	Menampilkan Data setelah di sorting
        System.out.println();
        System.out.print("Sorting : ");
        for (int x = 0; x < data.length; x++) {
            System.out.print(data[x] + " ");
        }
        Cari1();
        Cari2();

    }

    static void Cari1() {
        //	Input data yang dicari
        cari1 = Integer.parseInt(JOptionPane.showInputDialog("Data pertama yang dicari : "));
        System.out.println();
        //	Proses Metode Pencarian Binary Searching
        System.out.println();
        boolean temu = false;
        awal = 0;
        akhir = data.length - 1;
        temp = 0;
        count = 0;
        int iterasi = 0;
        System.out.println("It  Aw  Ak  Te  Ni");
        while (temu != true) {
            tengah = (awal + akhir) / 2;
            iterasi++;

            //	value == cari
            if (data[tengah] == cari1) {
                System.out.print(iterasi + "   ");
                System.out.print(awal + "   ");
                System.out.print(akhir + "   ");
                System.out.print(tengah + "   ");
                System.out.print(data[tengah] + "\n");
                temu = true;
                break;
            } //	value < cari
            else if (data[tengah] < cari1) {
                System.out.print(iterasi + "   ");
                System.out.print(awal + "   ");
                System.out.print(akhir + "   ");
                System.out.print(tengah + "   ");
                System.out.print(data[tengah] + "\n");
                awal = tengah + 1;

            } //	value > cari
            else if (data[tengah] > cari1) {
                System.out.print(iterasi + "   ");
                System.out.print(awal + "   ");
                System.out.print(akhir + "   ");
                System.out.print(tengah + "   ");
                System.out.print(data[tengah] + "\n");
                akhir = tengah - 1;
            }

            //	Cek Worst Case
            if (temp != data[tengah]) {
                temp = data[tengah];
            } else {
                count++;
            }

            //	batasan untuk worst case
            if (count == 3) {
                break;
            }
        }

        //	Output
        if (temu == true) {
            System.out.println("\nData " + cari1 + " ditemukan pada index ke-" + tengah + "\n"
                    + "dan Iterasi ke-" + iterasi);
        } else {
            System.out.println("\nData " + cari1 + " tidak ditemukan");
        }
        return;
    }

    static void Cari2() {
        //	Input data yang dicari
        cari2 = Integer.parseInt(JOptionPane.showInputDialog("Data kedua yang dicari : "));
        System.out.println();
        //	Proses Metode Pencarian Binary Searching
        System.out.println();
        boolean temu = false;
        awal = 0;
        akhir = data.length - 1;
        temp = 0;
        count = 0;
        int iterasi = 0;
        System.out.println("It  Aw  Ak  Te  Ni");
        while (temu != true) {
            tengah = (awal + akhir) / 2;
            iterasi++;

            //	value == cari
            if (data[tengah] == cari2) {
                System.out.print(iterasi + "   ");
                System.out.print(awal + "   ");
                System.out.print(akhir + "   ");
                System.out.print(tengah + "   ");
                System.out.print(data[tengah] + "\n");
                temu = true;
                break;
            } //	value < cari
            else if (data[tengah] < cari2) {
                System.out.print(iterasi + "   ");
                System.out.print(awal + "   ");
                System.out.print(akhir + "   ");
                System.out.print(tengah + "   ");
                System.out.print(data[tengah] + "\n");
                awal = tengah + 1;

            } //	value > cari
            else if (data[tengah] > cari2) {
                System.out.print(iterasi + "   ");
                System.out.print(awal + "   ");
                System.out.print(akhir + "   ");
                System.out.print(tengah + "   ");
                System.out.print(data[tengah] + "\n");
                akhir = tengah - 1;
            }

            //	Cek Worst Case
            if (temp != data[tengah]) {
                temp = data[tengah];
            } else {
                count++;
            }

            //	batasan untuk worst case
            if (count == 3) {
                break;
            }
        }

        //	Output
        if (temu == true) {
            System.out.println("\nData " + cari2 + " ditemukan pada index ke-" + tengah + "\n"
                    + "dan Iterasi ke-" + iterasi);
        } else {
            System.out.println("\nData " + cari2 + " tidak ditemukan");
        }
        return;
    }

    //	Sorting Ascending
    public static void sorting() {
        int temp = 0;
        for (int x = 0; x < data.length; x++) {
            for (int y = 0; y < data.length; y++) {
                if (x == y) {
                    continue;
                } else {
                    if (data[x] < data[y]) {
                        temp = data[y];
                        data[y] = data[x];
                        data[x] = temp;

                    }
                }
            }
        }
    }
}