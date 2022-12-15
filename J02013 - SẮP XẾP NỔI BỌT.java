package nyagami;

import java.util.Scanner;
import java.util.ArrayList;
import java.util.Collections;

public class test{
   
    static void out(int[] a, int n, int step){
        System.out.printf("Buoc %d: ", step);
        for(int i=0;i<n;i++){
            System.out.printf("%d ", a[i]);
        }
        System.out.println("");
    }
    
    static boolean isSorted(int[] a, int n){
        for(int i=0;i<n-1;i++){
            if(a[i]>a[i+1]) return false;
        }
        return true;
    }
    
    public static void main(String[] arg){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] a = new int[n];
        for(int i=0;i<n;i++){
            a[i] = sc.nextInt();
        }
        for(int i=0;i<n-1;i++){
            for(int j=0;j<n-1;j++){
                if(a[j]>a[j+1]){
                    int tmp = a[j];
                    a[j] = a[j+1];
                    a[j+1] = tmp;
                }
            }
            out(a,n,i+1);
            if(isSorted(a,n)) break;
        }
        sc.close();
    }
}
