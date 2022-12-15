import java.util.Scanner;
import java.io.File;
import java.io.IOException;
import java.util.TreeSet;

public class Main{
    static char up(char x){
        if('a'<=x && x<='z') return (char)((int)x-32);
        return x;
    }
    static String re(String name){
        String[] a = name.split("[' ']+");
        String r = "";
        for(int i=0; i<a.length; i++){
            if(a[i].length() == 0) continue;
            String s = Character.toString(up(a[i].charAt(0))) + a[i].substring(1);
            r += s + " ";
        }
        return r;
    }
    static class student{
        String code, name, method, mail;
        public student(String c, String n, String m, String em){
            code=c;
            name=re(n.toLowerCase());
            method=m;
            mail=em;
        }
        public boolean big(student b){
            if(code.compareTo(b.code) > 0) return true;
            return false;
        }
        public String toString(){
            return code + " " + name + method + " " + mail;
        }
    }
    public static void main(String[] args)throws IOException{
        Scanner sc = new Scanner(new File("SINHVIEN.in"));
        // Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        student[] a = new student[n];
        sc.nextLine();
        for(int i=0; i<n; i++){
            a[i] = new student(sc.nextLine(), sc.nextLine(), sc.nextLine(), sc.nextLine());
        }
        student tmp;
        for(int i=0; i<n-1; i++){
            for(int j=i+1; j<n; j++){
                if(a[i].big(a[j])){
                    tmp=a[i];
                    a[i]=a[j];
                    a[j]=tmp;
                }
            }
        }
        for(int i=0;i<n;i++) System.out.println(a[i]);
    }
}
