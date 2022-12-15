import java.util.Scanner;
import java.util.Stack;

public class Main{
    public static void main(String[] arg){
        Scanner sc = new Scanner(System.in);
        String s = sc.next();
        Stack<Character> a = new Stack<>();
        for(int i=0; i<s.length(); i++){
            if(a.empty()) a.push(s.charAt(i));
            else{
                if(a.lastElement() == s.charAt(i)) a.pop();
                else a.push(s.charAt(i));
            }
        }
        if(a.empty()) System.out.println("Empty String");
        else a.forEach(c -> System.out.print(c));
        sc.close();
    }
}
