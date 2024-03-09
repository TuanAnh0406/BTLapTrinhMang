/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.TaoLuong.bvntuan2;

/**
 *
 * @author DELL
 */
// Bài 1
public class TaoLuong extends Thread {
    @Override
    public void run() {
        System.out.println("Luong bat dau chay");
    }

    public static void main(String[] args) {
        // Tao luong
        TaoLuong myThread = new TaoLuong();
        // Bat dau luong
        myThread.start();
    }
}
