package nyagami;

import java.util.*;
import java.io.*;
public class test{
    
    static boolean prime(Integer x){
        if(x<2) return false;
        if(x==2) return true;
        if(x%2==0) return false;
        Integer can = (int)Math.sqrt(x.doubleValue());
        for(Integer i=3; i<=can; i+=2){
            if(x%i==0) return false;
        }
        return true;
    }
    
    static class Pair<K,V>{
        public K a;
        public V b;
        public Pair(K key, V value){
            a=key;b=value;
        }
        public boolean isPrime(){
            return prime((Integer) a) && prime((Integer) b);
        }
        public String toString(){
            return a.toString()+" "+b.toString();
        }
    }
    public static void main(String[] args) throws IOException {
        Scanner sc = new Scanner(new File("DATA.in"));
        int t = sc.nextInt();
        while(t-->0){
            int n = sc.nextInt();
            boolean check = false;
            for(int i = 2; i <= 2*Math.sqrt(n); i++){
                Pair<Integer, Integer> p = new Pair<>(i, n-i);
                if(p.isPrime()){
                    System.out.println(p);
                    check = true;
                    break; 
                }
            }
            if(!check) System.out.println(-1);
        }
    }
    public static void main7034472(String[] args) throws IOException {
        Scanner sc = new Scanner(new File("DATA.in"));
        int t = sc.nextInt();
        while(t-->0){
            int n = sc.nextInt();
            boolean check = false;
            for(int i = 2; i <= 2*Math.sqrt(n); i++){
                Pair<Integer, Integer> p = new Pair<>(i, n-i);
                if(p.isPrime()){
                    System.out.println(p);
                    check = true;
                    break; 
                }
            }
            if(!check) System.out.println(-1);
        }
    }
}
