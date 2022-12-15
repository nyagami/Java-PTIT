import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class Main{
    public static void main(String[] args){
        File file = new File("Hello.txt");
        try{
            Scanner scaner = new Scanner(file);
            while(scaner.hasNextLine()){
                System.out.println(scaner.nextLine());
            }
            scaner.close();
        }catch(FileNotFoundException e){

        }
    }
}
