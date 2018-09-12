/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaapplication1;
import java.util.Scanner;

/**
 *
 * @author HP
 */
public class LuasPersegi {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        System.out.println("masukkan sisi : ");
        double sisi = input.nextDouble();
        double luasPersegi = sisi * sisi;
        System.out.println("Hasil : " + luasPersegi );
        
    }
    
}
