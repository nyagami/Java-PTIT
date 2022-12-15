package nyagami;

import java.util.Scanner;

public class test{

    public static void main(String[] arg){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int res = 0;
        for(int i=1; i<=n; i++){
            int cnt = 0;
            for(int j=1; j<=3; j++) cnt+=sc.nextInt();
            if(cnt > 3-cnt) res++;
        }
        System.out.print(res);
        sc.close();
    }
}
