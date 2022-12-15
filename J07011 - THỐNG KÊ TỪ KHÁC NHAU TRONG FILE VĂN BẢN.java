/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package OOP_codeptit;

import java.io.File;
import java.io.IOException;
import java.util.Map;
import java.util.Scanner;
import java.util.TreeMap;

/**
 *
 * @author DuyManh
 */
public class ThongKeTuKhacNhauTrongFileVanBan {

    public static void main(String[] args) throws IOException {
        Scanner sc=new Scanner(new File("VANBAN.in"));
//        Scanner sc = new Scanner(System.in);
        sc.nextInt();
        TreeMap<String, Integer> m = new TreeMap<>();
//        String re1 = "\\d+";
//        String re2 = "\\w+";
        int max = 0;
        while(sc.hasNextLine()) {
            String s = sc.nextLine().toLowerCase();
            if(s.length() == 0) continue;

            String a[] = s.trim().split("[^a-z0-9]");
            
            for (String x : a) {
                
                if (x.length()>0) {
                    if (m.containsKey(x)) {
                        int fre = m.get(x);
                        m.put(x, fre + 1);
                        max = Math.max(fre + 1, max);
                    } else {
                        m.put(x, 1);
                        max = Math.max(max, 1);
                    }
                }
            }
        }
        while (max > 0) {
            for (Map.Entry<String, Integer> e : m.entrySet()) {
                if(e.getValue()==max) System.out.println(e.getKey() + " " + e.getValue());
            }
            max--;
        }
    }
}
//
//3
//PTIT duy tri hoc phi on dinh nam 2019 va khong tang trong nam 2020-2021 va 2021-2022!
//Khi dich benh xuat hien PTIT trich hon 6 ty dong ho tro sinh vien PTIT
//voi muc ho tro 500000 dong/sinh vien PTIT.
