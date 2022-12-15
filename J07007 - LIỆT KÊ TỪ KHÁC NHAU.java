package nyagami;

import java.io.File;
import java.io.IOException;
import java.io.FileNotFoundException;
import java.util.Scanner;
import java.util.TreeSet;
import java.util.HashMap;

public class test {
    public static class WordSet{
        String str;
        public WordSet(String file){
            str = "";
            File in = new File(file);
            try{
                Scanner sc = new Scanner(in);
                TreeSet<String> tree = new TreeSet();
//                HashMap<String, Integer> set = new HashMap<String, Integer>();
                while(sc.hasNext()){
                    tree.add(sc.next().toLowerCase());
                }
                tree.forEach(s -> {
                    str += s + '\n';  
                });
            }catch(FileNotFoundException e){
                
            }
        }
        public String toString(){
            return str;
        }
    }
    public static void main(String[] args) throws IOException {
        WordSet ws = new WordSet("VANBAN.in");
        System.out.println(ws);
    }
    public static void main4139063(String[] args) throws IOException {
        WordSet ws = new WordSet("VANBAN.in");
        System.out.println(ws);
    }
}
