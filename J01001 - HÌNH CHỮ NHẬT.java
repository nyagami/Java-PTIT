import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);
        int a = reader.nextInt(), b = reader.nextInt();
        if(a<=0 || b<=0){
            reader.close();
            System.out.print(0);
            return;
        }
        String ans = String.format("%d %d",2*(a+b),a*b);
        System.out.print(ans);
        reader.close();
    }
}
