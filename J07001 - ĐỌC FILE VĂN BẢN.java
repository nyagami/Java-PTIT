import java.util.Scanner;
import java.io.File;
import java.io.FileNotFoundException;
public class Main{
    public static void main(String args[]){
        File x = new File("DATA.in");
        try{
            Scanner sc = new Scanner(x);
            while(sc.hasNext()){
                System.out.println(sc.nextLine());
            }
        }catch(FileNotFoundException e){

        }
    
    }
}
