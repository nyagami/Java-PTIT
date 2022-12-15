/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package J07057_DiemTuyenSinh;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.Scanner;

/**
 *
 * @author admin
 */
class ThiSinh{
    private String maTS, hoTen, danToc, khuVuc;
    private float diemThi;
    private static int id = 1;
    public ThiSinh(String hoTen, String danToc, String khuVuc, float diemThi) {
        this.maTS = "TS" + String.format("%02d", id++);
        this.hoTen = hoTen;
        this.danToc = danToc;
        this.khuVuc = khuVuc;
        this.diemThi = diemThi;
    }

    public String getMaTS() {
        return maTS;
    }
    public void chuanHoaTen(){
        String[] arr = this.hoTen.trim().split("\\s+");
        StringBuilder sb = new StringBuilder();
        for(String x : arr){
            sb.append(Character.toUpperCase(x.charAt(0)));
            for(int j = 1; j < x.length(); j++){
                sb.append(Character.toLowerCase(x.charAt(j)));
            }
            sb.append(" ");
        }
        sb.deleteCharAt(sb.length() - 1);
        this.hoTen = sb.toString();
    }
    public float diemUuTien(){
        float diem = 0;
        if("1".equals(this.khuVuc)) diem += 1.5;
        else if("2".equals(this.khuVuc)) diem += 1;
        if(!"Kinh".equals(this.danToc)) diem += 1.5;
        return diem;
    }
    public float tongDiem(){
        return this.diemThi + this.diemUuTien();
    }
    public String trangThai(){
        if(this.tongDiem() >= 20.5) return "Do";
        return "Truot";
    }
    
    @Override
    public String toString(){
        return this.maTS + " " + this.hoTen + " " + String.format("%.1f", this.tongDiem()) + " " + this.trangThai();
    }
}
public class J07057 {
    public static void main(String[] args) throws FileNotFoundException {
        Scanner sc = new Scanner(new File("THISINH.in"));
        int n = sc.nextInt();
        ArrayList <ThiSinh> list = new ArrayList<>();
        while(n-- > 0){
            sc.nextLine();
            String hoTen = sc.nextLine();
            float diemThi = sc.nextFloat();
            sc.nextLine();
            String danToc = sc.nextLine();
            String khuVuc = sc.next();
            ThiSinh ts = new ThiSinh(hoTen, danToc, khuVuc, diemThi);
            ts.chuanHoaTen();
            list.add(ts);
        }
        Collections.sort(list, new Comparator<ThiSinh>(){
            @Override
            public int compare(ThiSinh o1, ThiSinh o2) {
                if(o2.tongDiem() == o1.tongDiem())
                    return o1.getMaTS().compareTo(o2.getMaTS());
                if(o1.tongDiem() < o2.tongDiem())
                    return 1;
                return -1;
            }
        });
        for(ThiSinh x : list){
            System.out.println(x);
        }
    }
}
