/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package pkg17.danh_dau_chu_cai;

import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

/**
 *
 * @author GIGABYTE
 */
public class Danh_dau_chu_cai {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
           
            String s = sc.nextLine();
            Set<String> st = new HashSet<>();
            for(int i=0;i<s.length();i++){
                String temp = s.charAt(i)+" ";
                st.add(temp);
            }
            System.out.println(st.size());
        
    }
    
}
