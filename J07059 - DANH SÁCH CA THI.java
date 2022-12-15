 /*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package test;
import java.util.*;
import java.io.*;
import java.text.ParseException;
import java.text.SimpleDateFormat;
/**
 *
 * @author GIGABYTE
 */
public class Test {

    /**
     * @param args the command line arguments
     * @throws java.io.IOException
     */
    static class ob{
        String code, date, time,room;
        long total;
        public ob(int i, String d, String t, String r){
            code = "C" + String.format("%03d", i);
            date = d;
            time = t;
            room = r;
            SimpleDateFormat f = new SimpleDateFormat("dd/MM/yyyy hh:mm");
            try{
                total = f.parse(date + ' ' + time).getTime();
            }catch(ParseException e){
                
            }
        };
        
        @Override
        public String toString(){
            return code + ' ' + date + ' ' + time + ' ' + room;
        }
        
    }
    public static void main(String[] args) throws IOException {
        // TODO code application logic here
        Scanner sc = new Scanner(new File("CATHI.in"));
//        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        ArrayList<ob> a = new ArrayList<>();
        for(int i=1;i<=n;i++){
            a.add(new ob(i, sc.next(), sc.next(), sc.next()));
        }
        Collections.sort(a, (ob a1, ob b) -> {
            if (a1.total == b.total) {
                return a1.code.compareTo(b.code);
            }
            if (a1.total > b.total) {
                return 1;
            }
            return -1;
        });
        a.forEach(e -> System.out.println(e));
    }
    
}
