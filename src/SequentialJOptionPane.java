/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author HP
 */
import javax.swing.JOptionPane;
public class SequentialJOptionPane {
        public static void main(String[] args) {
        int data[] = new int[5];
        int i, angka, cari;
        boolean ketemu;

        for (i = 0; i < data.length; i++) {
            angka = Integer.parseInt(JOptionPane.showInputDialog("Masukkan Angka ke-" + (i + 1)));
            data[i] = angka;
        }
        System.out.print("Angka Dimasukkan = { ");
        for (i = 0; i < data.length; i++) {
            System.out.print(data[i] + " ");
        }
        System.out.println("}");
        cari = Integer.parseInt(JOptionPane.showInputDialog("Masukkan Angka Yang Ingin Dicari :"));
        System.out.println("Angka Dicari : " + cari);
        ketemu = false;
        for (i = 0; i < data.length; i++) {
            if (data[i] == cari) {
                ketemu = true;
                break;
            }
        }
        if (ketemu) {
            System.out.println("Angka ditemukan dalam urutan ke - " + (i + 1));
        } else {
            System.out.println("Angka tidak ditemukan");
        }
    }
}

    

