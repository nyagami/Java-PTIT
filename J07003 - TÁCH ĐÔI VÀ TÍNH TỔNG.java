import java.util.Scanner;
import java.io.File;
import java.math.BigInteger;
import java.io.FileNotFoundException;

public class Main{
    public static void main(String args[]){
        File x = new File("DATA.in");
        try{
            Scanner sc = new Scanner(x);
            BigInteger s = sc.nextBigInteger();
            while(s.toString().length() > 1){
                int length = s.toString().length();
                BigInteger a = new BigInteger(s.toString().substring(0,length/2));
                BigInteger b = new BigInteger(s.toString().substring(length/2,length));
                s = a.add(b);
                System.out.println(s);
            }
            sc.close();
        }catch(FileNotFoundException e){

        }
    }
}
