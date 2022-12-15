import java.util.*;
import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException, ClassNotFoundException {
        // Scanner sc = new Scanner(new File("ONLINE.in"));
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while(t-->0){
            String s = sc.next();
            Stack<Character> a = new Stack<>();
            for(int i=0;i<s.length();i++){
                if(a.empty()) a.push(s.charAt(i));
                else{
                    if(a.lastElement()=='(' && s.charAt(i) == ')') a.pop();
                    else if(a.lastElement()=='[' && s.charAt(i) == ']') a.pop();
                    else if(a.lastElement()=='{' && s.charAt(i) == '}') a.pop();
                    else a.push(s.charAt(i));
                }
            }
            if(a.empty()) System.out.println("YES");
            else System.out.println("NO");
        }
    }
}
