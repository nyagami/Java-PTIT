 /*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package test;
import java.util.*;
import java.io.*;

/**
 *
 * @author GIGABYTE
 */
public class Test {

    /**
     * @param args the command line arguments
     * @throws java.io.IOException
     */
    static class ob{
        String sys,full, first, last;
        public ob(String name){
            sys="";
            full = name;
            String[] s = name.split("\\s+");
            first = s[0];
            last = s[s.length -1];
            for (String item : s) {
                sys += item.charAt(0);
            }
        };
        
        public boolean suit(String s){
            String[] a = s.split("['.']");
            if(a.length != sys.length()) return false;
            for(int i=0;i<a.length;i++){
                if(a[i].charAt(0) == '*') continue;
                if(a[i].charAt(0) != sys.charAt(i)) return false;
            }
            return true;
        }
        
        @Override
        public String toString(){
            return full;
        }
        
    }
    public static void main(String[] args) throws IOException {
        // TODO code application logic here
        Scanner sc = new Scanner(new File("DANHSACH.in"));
//        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        ArrayList<ob> a = new ArrayList<>();
        sc.nextLine();
        for(int i=0;i<n;i++){
            a.add(new ob(sc.nextLine()));
        }
        a.sort((ob x, ob y) -> {
            if(x.last.compareTo(y.last) == 0) return x.first.compareTo(y.first);
            return x.last.compareTo(y.last);    
        });
        int q = sc.nextInt();
        while(q-->0){
            String s = sc.next();
            for(int i=0;i<n;i++){
                if(a.get(i).suit(s)){
                    System.out.println(a.get(i));
                }
            }
        }
    }
    
}
