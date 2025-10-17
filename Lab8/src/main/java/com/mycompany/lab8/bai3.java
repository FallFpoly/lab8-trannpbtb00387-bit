/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.lab8;

/**
 *
 * @author ICT
 */
public class bai3 {

     public static final String toUpperFirstChar(String s) {
        if (s == null || s.isEmpty()) {
            return "";
        }

        // Tach chuoi theo dau cach
        String[] words = s.split(" ");

        // Duyet tung tu trong mang
        for (int i = 0; i < words.length; i++) {
            if (words[i].length() > 0) {
                char firstChar = words[i].charAt(0);
                String upperFirstChar = String.valueOf(firstChar).toUpperCase();
                words[i] = upperFirstChar + words[i].substring(1);
            }
        }

        // Noi cac tu lai thanh mot chuoi
        String result = String.join(" ", words);
        return result;
    }

    public static void main(String[] args) {
        System.out.println("Nguyen Pham Bao Tran ");
        String s = "nguyen van teo";
        System.out.println("Chuoi ban dau: " + s);
        System.out.println("Chuoi sau khi doi: " + toUpperFirstChar(s));
    }
}
