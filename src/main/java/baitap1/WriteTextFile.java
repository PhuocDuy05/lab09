/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package baitap1;

import java.util.ArrayList;
import java.io.*;

/**
 *
 * @author ADMIN
 */
public class WriteTextFile {
    public static void main(String[] args) {
        ArrayList<SanPham> ds = new ArrayList<>();
        ds.add(new SanPham("SP01", "Gạo", 25000));
        ds.add(new SanPham("SP02", "Đường", 45000));
        ds.add(new SanPham("SP03", "Kẹo", 29000));
        
        
        try {
            FileWriter fw = new FileWriter("sanpham.txt");
            for (SanPham sp : ds){
                fw.write(sp.getMaso() + ";" +sp.getTen() + ";" + sp.getGia() + "\n");               
            }
            fw.close();
            System.out.println("ghi thanh cong");
        } catch (Exception ex){
            System.out.println("loi xay ra:" + ex.toString());
            System.out.println("Ghi file that bai");
        }
    }
}
