import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);
        int t = reader.nextInt();
        while(t>0){
            t--;
            Long n = reader.nextLong();
            System.out.println(n*(n+1)/2);
        }
        reader.close();
    }
}
