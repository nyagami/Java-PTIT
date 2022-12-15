import java.util.Scanner;
import java.util.Stack;

public class Main{
    public static void main(String[] arg){
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        sc.nextLine();
        while(t-->0){
            String line = sc.nextLine();
            String[] w = line.split("[' ']+");
            for(int i=0; i<w.length; i++){
                for(int j=0; j<w[i].length(); j++){
                    System.out.print(w[i].charAt(w[i].length()-j-1));
                }
                System.out.print(' ');
            }
            System.out.println("");
        }
        sc.close();
    }
}
