import java.util.*;
public class Main{
    static class pair{
        public pair(double a, double b){
            this.x = a;
            this.y = b;
        }
        double x,y;
    }
    static double dis(pair a, pair b){
        return Math.sqrt(Math.pow(a.x - b.x, 2) + Math.pow(a.y - b.y, 2));
    }
    static boolean validate(double[] c){
        double max = Math.max(c[0], Math.max(c[1], c[2]));
        if(max*2 >= c[0]+c[1]+c[2]) return false;
        return true;
    }
    public static void main(String[] a) {
        Scanner sc=new Scanner(System.in);
        int t = sc.nextInt();
        while(t-->0){
            pair[] p = new pair[3];
            for(int i=0; i<3; i++) p[i] = new pair(sc.nextDouble(), sc.nextDouble());
            double[] c = new double[3];
            for(int i=0; i<3; i++){
                c[i] = dis(p[i], p[(i+1)%3]);
            }
            if(validate(c)) System.out.printf("%.3f\n",c[0]+c[1]+c[2]);
            else System.out.println("INVALID");
        }
    }
}
