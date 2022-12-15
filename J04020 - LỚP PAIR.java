import java.util.*;
import java.io.*;

public class Main{
    static boolean prime(Integer x){
        if(x<2) return false;
        if(x==2) return true;
        if(x%2==0) return false;
        for(int i=3;i<=(int)Math.sqrt(x);i+=2){
            if(x%i==0) return false;
        }
        return true;
    }
    static class Pair <T, K>{
        public Integer x;
        public Integer y;
        public Pair(Integer a, Integer b){
            x = a;
            y = b;
        }
        public boolean isPrime(){
            return prime(x) && prime(y);
        }
        @Override
        public String toString(){
            return String.format("%d %d",x,y);
        }
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
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
    public static void main8500646(String[] args) {
        Scanner sc = new Scanner(System.in);
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
