/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.lab8;

/**
 *
 * @author ICT
 */
public class bai4 {

    public static void main(String[] args) {
        System.out.println("Tong: " + XPoly.sum(1, 2, 3, 4, 5));
        System.out.println("So nho nhat: " + XPoly.min(5, 2, 9, 1, 7));
        System.out.println("So lon nhat: " + XPoly.max(5, 2, 9, 1, 7));

        String s = "nguyen van teo";
        System.out.println("Chuoi ban dau: " + s);
        System.out.println("Chuoi sau khi viet hoa: " + XPoly.toUpperFirstChar(s));
    }
}
