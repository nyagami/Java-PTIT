import java.util.Scanner;
import java.io.File;
import java.util.HashMap;
import java.io.FileNotFoundException;

public class Main{
    public static void main(String args[]){
        File x = new File("DATA.in");
        try{
            Scanner sc = new Scanner(x);
            HashMap<Integer, Integer> a = new HashMap<Integer, Integer>();
            while(sc.hasNext()){
                int n = sc.nextInt();
                if(a.get(n) == null) a.put(n, 1);
                else a.put(n, a.get(n)+1);
            }
            a.forEach((key, value) ->{
                System.out.printf("%d %d\n",key, value);
            });
            sc.close();
        }catch(FileNotFoundException e){
        }
    }
}
