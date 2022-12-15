/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package test;
import java.util.Scanner;
/**
 *
 * @author hoang
 */
public class Test {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);
        long n = reader.nextLong();
        long ans = 0;
        long[] f = new long[22];
        f[0]=1;
        for(int i=1; i<=n ; i++){
            f[i]=f[i-1]*i;
            ans+=f[i];
        }
        System.out.print(ans);
        reader.close();
    }
    
}
