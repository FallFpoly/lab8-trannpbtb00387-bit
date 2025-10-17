/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.lab8;

/**
 *
 * @author ICT
 */
public class bai1 {
        
     public static final double sum(double... x) {
        double tong = 0;
        for (double i : x) {
            tong += i;
        }
        return tong;
    }

    public static void main(String[] args) {
        System.out.println("Nguyen Pham Bao Tran ");
        System.out.println("Tong 3 so 1.5, 2.5, 3.0 la: " + sum(1.5, 2.5, 3.0));
        System.out.println("Tong 5 so la: " + sum(1, 2, 3, 4, 5));
        System.out.println("Tong khong co phan tu la: " + sum());
    }
}
