/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Baitap2;

import baitap1.SanPham;
import java.io.FileInputStream;
import java.io.ObjectInputStream;
import java.util.ArrayList;

/**
 *
 * @author ADMIN
 */
public class ReadObject {
    public static void main(String[] args) {
        ArrayList<SanPham> ds;
        try {
            FileInputStream fis = new FileInputStream("sanpham.bin");
            ObjectInputStream ois = new ObjectInputStream(fis);
            ds = (ArrayList<SanPham>) ois .readObject();
            ois.close();
            System.out.println("\n da doc xong");
            for(SanPham sp : ds) {
                System.out.println(sp);
                
            }
        }catch (Exception ex) {
            System.out.println("Loi xay ra " + ex.toString());
        }
    }
}
