package nyagami;

import java.util.Scanner;

public class test{
    public static void main(String[] arg){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int last = 0;
        int cnt = 0;
        for(int i=0; i<n; i++){
            int x = sc.nextInt();
            if(x==last+1){
                last=x;
                continue;
            }else{
                cnt++;
                for(int j=last+1; j<x; j++){
                    System.out.println(j);
                }
                last=x;
            }
        }
        if(cnt==0) System.out.println("Excellent!");
        sc.close();
    }
}
