package pkg1.chuan_hoa_xau_ho_ten1;

import java.util.Scanner;


public class Chuan_hoa_xau_ho_ten1 {
    
    static String edit(String s){
        String s1 = s.substring(0, 1);
        String s2 = s.substring(1, s.length());
        s1 = s1.toUpperCase();
        return s1+s2;
    }
    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        sc.nextLine();
        while(t>0){
            t-=1;
            String s = sc.nextLine();
            s = s.toLowerCase();
            s = s.replaceAll("\\s+", " ");
            s = s.trim();       
            String word[] = s.split("\\s");
            for( String i : word){
                System.out.print(edit(i)+" ");
            }
            System.out.println("");
        }
    }
    
}
