/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package pkg6.tap_tu_rieng_cua_2_xau;

import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

/**
 *
 * @author GIGABYTE
 */
public class Tap_tu_rieng_cua_2_xau {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        sc.nextLine();
        while(t>0){
            t-=1;
            Set<String> st = new HashSet<>();
            String s1[] = sc.nextLine().split("\\s");
            String s2 = sc.nextLine();
            for(String word: s1){
                if(!s2.contains(word)){
                    st.add(word);
                }
            }
            for(String i: st){
                System.out.print(i + " ");
            }
            System.out.println("");
        }
    }
    
}
