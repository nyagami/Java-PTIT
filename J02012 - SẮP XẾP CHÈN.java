package nyagami;

import java.util.Scanner;
import java.util.ArrayList;
import java.util.Collections;

public class test{
   
    static void out(ArrayList<Integer> a, int step){
        System.out.printf("Buoc %d: ", step);
        a.forEach(k -> System.out.printf("%d ", k));
        System.out.println("");
    }
    
    
    public static void main(String[] arg){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        ArrayList<Integer> a = new ArrayList<>();
        for(int i=0;i<n;i++){
            a.add(sc.nextInt());
            Collections.sort(a);
            out(a,i);
        }
        sc.close();
    }
}
