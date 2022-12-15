import java.util.Scanner;
import java.io.File;
import java.io.IOException;
import java.util.TreeSet;

public class Main{
    static class sub{
        String code, name, method;
        public sub(String c, String n, String m){
            code=c;
            name=n;
            method=m;
        }
        public boolean big(sub b){
            if(code.compareTo(b.code) > 0) return true;
            return false;
        }
        public String toString(){
            return code + " " + name + " " + method;
        }
    }
    public static void main(String[] args)throws IOException{
        Scanner sc = new Scanner(new File("MONHOC.in"));
        int n = sc.nextInt();
        sub[] a = new sub[n];
        sc.nextLine();
        for(int i=0; i<n; i++){
            a[i] = new sub(sc.nextLine(), sc.nextLine(), sc.nextLine());
        }
        sub tmp;
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
