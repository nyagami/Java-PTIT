package nyagami;

import java.util.Scanner;

public class test{
    static int min4(int a,int b,int c,int d){
        return Math.min(Math.min(Math.min(a, b),c),d);
    }
    static int max4(int a,int b,int c,int d){
        return Math.max(Math.max(Math.max(a, b),c),d);
    }
    public static void main(String[] arg){
        Scanner sc = new Scanner(System.in);
        int a1x = sc.nextInt(), a1y = sc.nextInt(), a2x = sc.nextInt(), a2y = sc.nextInt();
        int b1x = sc.nextInt(), b1y = sc.nextInt(), b2x = sc.nextInt(), b2y = sc.nextInt();
        int minx = min4(a1x,a2x,b1x,b2x), maxx = max4(a1x,a2x,b1x,b2x);
        int miny = min4(a1y,a2y,b1y,b2y), maxy = max4(a1y,a2y,b1y,b2y);
        int c = Math.max(maxx-minx, maxy-miny);
        System.out.print(c*c);
        sc.close();
    }
}
