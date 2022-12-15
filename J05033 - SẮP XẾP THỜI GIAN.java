import java.util.Scanner;

public class Main{
    static int getSec(int h, int m, int s){
        return h*3600 + m*60 +s;
    }
    static void out(int x){
        System.out.printf("%d %d %d\n",x/3600,(x%3600)/60,(x%3600)%60);
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] a = new int[n];
        for(int i=0;i<n;i++){
            a[i] = getSec(sc.nextInt(), sc.nextInt(), sc.nextInt());
        }
        int tmp;
        for(int i=0;i<n-1;i++){
            for(int j=i+1;j<n;j++){
                if(a[i] > a[j]){
                    tmp = a[i];
                    a[i] = a[j];
                    a[j] = tmp;
                }
            }
        }
        for(int i=0;i<n;i++) out(a[i]);
    }
}
