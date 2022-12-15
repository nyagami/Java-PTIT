package nyagami;

import java.util.Scanner;

public class test{

    public static void main(String[] arg){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        for(int i=1; i<=n; i++){
            for(int j=1; j<=n; j++){
                int x = sc.nextInt();
                if(x==1 && i<j){
                    System.out.printf("(%d,%d)\n", i, j);
                }
            } 
        }
        
        sc.close();
    }
}
