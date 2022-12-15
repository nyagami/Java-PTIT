import java.util.Scanner;
import java.util.HashMap;

public class Main{
    static String mail(String s){
        String[] a = s.split("[' ']+");
        String r = a[a.length-1];
        for(int i=0; i<a.length-1; i++){
            if(a[i].length() != 0) r += Character.toString(a[i].charAt(0));
        }
        return r;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        sc.next();
        HashMap<String, Integer> a = new HashMap<>();
        while(sc.hasNextLine()){
            String name = sc.nextLine();
            if(name.length() == 0) continue;
            String user = mail(name.toLowerCase());
            if(a.get(user) == null){
                a.put(user, 2);
            }else{
                int th = a.get(user);
                a.put(user, th+1);
                user += Integer.toString(th);
            }
            System.out.println(user + "@ptit.edu.vn");
        }
    }
}
