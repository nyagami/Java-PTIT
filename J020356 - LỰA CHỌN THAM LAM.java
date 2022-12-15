import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt(), s = sc.nextInt(), n9 = 0;
        String Max = "";
        if(n*9 < s || s == 0){
            System.out.println("-1 -1");
            return;
        }
        while(s>=9){
            Max += "9";
            n9++;
            s-=9;
        }
        if(s!=0) Max += Integer.toString(s);
        while(Max.length()<n) Max+="0";
        if(n9 != n && s == 0){
            n9--;
            s=9;
        }
        if(s!=0 && n9+1 != n) System.out.print("1");
        for(int i=0;i<n-n9-(s>0?2:0);i++) System.out.print("0");
        if(s>0) System.out.print(n9+1!=n?s-1:s);
        while(n9-->0) System.out.print("9");
        System.out.printf(" %s",Max);
    }
}
