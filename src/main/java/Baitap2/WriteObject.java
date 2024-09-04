/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Baitap2;

import baitap1.SanPham;
import java.io.FileOutputStream;
import java.io.ObjectOutputStream;
import java.util.ArrayList;
import java.util.Scanner;

/**
 *
 * @author ADMIN
 */
public class WriteObject {
    public static void main(String[] args) {
         ArrayList<SanPham> ds = new ArrayList<>();
        ds.add(new SanPham("SP01", "Gạo", 25000));
        ds.add(new SanPham("SP02", "Đường", 45000));
        ds.add(new SanPham("SP03", "Kẹo", 29000));
        
        
        Scanner sc = new Scanner(System.in);
        try {
            FileOutputStream fos = new FileOutputStream("sanpham.bin");
            ObjectOutputStream oos = new ObjectOutputStream(fos);
            oos.writeObject(ds);
            oos.close();
            
            System.out.println("\n Da ghi xong");
            
        }catch (Exception ex){
            System.out.println("Loi xay ra" + ex.toString());
        }
    }
}
