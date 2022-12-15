import java.io.*;
import java.util.*;

public class Main {

    static class HangTu{
        int base, exp;
        public HangTu(int x, int y){
            base = x;
            exp = y;
        }
        public HangTu(String s){
            String[] a = s.replace("*x^", " ").split("\\s+");
            base = Integer.parseInt(a[0]);
            exp = Integer.parseInt(a[1]);
        }
        @Override
        public String toString(){
            return String.format("%d*x^%d", base, exp);
        }
    }

    static class DaThuc{
        ArrayList<HangTu> a;

        public DaThuc(String s){
            a = new ArrayList<>();
            String[] arr = s.replace("+", " ").split("\\s+");
            for(int i=0;i<arr.length;i++){
                a.add(new HangTu(arr[i]));
            }
        }

        public DaThuc(){
            a = new ArrayList<>();
        }

        public DaThuc cong(DaThuc b){
            DaThuc r = new DaThuc();
            int i = 0, u = 0;
            while(i<a.size() || u<b.a.size()){
                if(i==a.size() || a.get(i).exp < b.a.get(u).exp){
                    r.a.add(new HangTu(b.a.get(u).toString()));
                    u++;
                }else if(u==b.a.size() || a.get(i).exp > b.a.get(u).exp){
                    r.a.add(new HangTu(a.get(i).toString()));
                    i++;
                }else{
                    HangTu x = new HangTu(a.get(i).base + b.a.get(u).base, a.get(i).exp);
                    if(x.base != 0) r.a.add(x);
                    i++;
                    u++;
                }
            }
            return r;
        }

        @Override
        public String toString(){
            String[] arr = new String[a.size()];
            for(int i=0;i<arr.length;i++) arr[i] = a.get(i).toString();
            return String.join(" + ", arr);
        }
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = Integer.parseInt(sc.nextLine());
        while(t-->0){
            DaThuc p = new DaThuc(sc.nextLine());
            DaThuc q = new DaThuc(sc.nextLine());
            DaThuc r = p.cong(q);
            System.out.println(r);
        }
    }
    public static void main902701(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = Integer.parseInt(sc.nextLine());
        while(t-->0){
            DaThuc p = new DaThuc(sc.nextLine());
            DaThuc q = new DaThuc(sc.nextLine());
            DaThuc r = p.cong(q);
            System.out.println(r);
        }
    }
}
