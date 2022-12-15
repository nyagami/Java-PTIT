import java.util.Scanner;
public class Main{
    static class point{
        double x,y;
        public void get(Scanner sc){
            x = sc.nextDouble();
            y = sc.nextDouble();
        }
    }
    static double dis(point a, point b){
        return Math.sqrt(Math.pow(a.x-b.x,2) + Math.pow(a.y - b.y, 2));
    }
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while(t-- > 0){
            point a = new point(); 
            point b = new point();
            a.get(sc);
            b.get(sc);
            System.out.printf("%.4f\n",dis(a,b));
        }
        sc.close();
    }
}
