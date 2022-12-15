import java.util.Scanner;
import java.util.Map;
import java.util.HashMap;

public class Main {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        for(int j=1;j<=t;j++){
            System.out.printf("Test %d:\n",j);
            int n=sc.nextInt();
            int[] a = new int[n];
            for(int i=0;i<n;i++){
                a[i]=sc.nextInt();
            }
            Map<Integer,Integer> m = new HashMap<Integer,Integer>();
            for(int i=0;i<n;i++){
                if(m.get(a[i]) == null){
                    m.put(a[i], 1);
                }else m.put(a[i], m.get(a[i])+1);
            }
            for(int i=0;i<n;i++){
                if(m.get(a[i])>0){
                    System.out.printf("%d xuat hien %d lan\n",a[i],m.get(a[i]));
                    m.put(a[i], 0);
                }
            }
        }
        sc.close();
    }
}
