/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.lab8;

/**
 *
 * @author ICT
 */
public class bai2 {

    public static final double min(double... x) {
        if (x.length == 0) {
            throw new IllegalArgumentException("Khong co phan tu nao!");
        }
        double min = x[0];
        for (double i : x) {
            if (i < min) {
                min = i;
            }
        }
        return min;
    }

    // Phuong thuc tim so lon nhat
    public static final double max(double... x) {
        if (x.length == 0) {
            throw new IllegalArgumentException("Khong co phan tu nao!");
        }
        double max = x[0];
        for (double i : x) {
            if (i > max) {
                max = i;
            }
        }
        return max;
    }

    public static void main(String[] args) {
        System.out.println("So nho nhat la: " + min(5, 2, 9, 1, 7));
        System.out.println("So lon nhat la: " + max(5, 2, 9, 1, 7));
    }
}
