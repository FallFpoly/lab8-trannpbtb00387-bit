/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.lab8;

/**
 *
 * @author nguye
 */
public class XPoly {
    
    public static final double sum(double... x) {
        double tong = 0;
        for (double i : x) {
            tong += i;
        }
        return tong;
    }

    // Tim so nho nhat
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

    // Tim so lon nhat
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

    // Viet hoa chu cai dau moi tu
    public static final String toUpperFirstChar(String s) {
        if (s == null || s.isEmpty()) {
            return "";
        }

        String[] words = s.split(" ");
        for (int i = 0; i < words.length; i++) {
            if (words[i].length() > 0) {
                char firstChar = words[i].charAt(0);
                String upperFirstChar = String.valueOf(firstChar).toUpperCase();
                words[i] = upperFirstChar + words[i].substring(1);
            }
        }
        return String.join(" ", words);
    }
}
