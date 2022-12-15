import java.util.*;
public class Main{
    static String conver(String d){
        String[] arr = d.split("/");
        for(int i=0; i<arr.length; i++){
            if(arr[i].length()<2) arr[i] = "0" + arr[i];
        }
        return arr[0] + "/" + arr[1] + "/" + arr[2];
    }
    public static void main(String[] a) {
        Scanner sc=new Scanner(System.in);
        System.out.printf("B20DCCN001 %s %s %s %.2f", sc.nextLine(), sc.nextLine(), conver(sc.next()), sc.nextFloat());
    }
}
