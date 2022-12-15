import java.util.*;
import java.io.*;
public class non {

    static boolean isN(String s){
        for(int i=0;i<s.length();i++){
            if(s.charAt(i)<'0' || s.charAt(i)>'9') return false;
        }
        return true;
    }

    static Long cal(String a, String b, String op){
        Long x = Long.parseLong(a);
        Long y = Long.parseLong(b);
        if(op.compareTo("*") == 0) return x*y;
        if(op.compareTo("/") == 0) return x/y;
        if(op.compareTo("+") == 0) return x+y;
        return x-y;
    }

    static String process(Stack<String> a){
        Stack<String> st = new Stack<>();
        while(!a.empty()){
            String x = a.pop();
            if("*/".contains(x)){
                String m = st.pop();
                String n = a.pop();
                st.push(cal(m, n, x).toString());
            }else st.push(x);
        }
        while(!st.empty()) a.push(st.pop());
        Long r = Long.parseLong(a.pop());
        while(!a.empty()){
            String op = a.pop();
            String m = a.pop();
            r = cal(r.toString(), m, op);
        }
        return r.toString();
    }

    static void solve(String s){
        Stack<String> st = new Stack<>();
        Stack<String> ST = new Stack<>();
        Queue<String> q = new LinkedList<>();
        for(int i=0;i<s.length();i++){
            if(s.charAt(i)==' ') continue;
            q.add(Character.toString(s.charAt(i)));
        }
        while(!q.isEmpty()){
            String x = q.poll();
            if(isN(x)){
                while(q.peek() != null && isN(q.peek())){
                    x+=q.poll();
                }
                st.push(x);
            }else st.push(x);
        }
        while(!st.empty()) ST.push(st.pop());
        while(!ST.empty()){
            String x = ST.pop();
            if(x.compareTo(")") == 0){
                Stack<String> ex = new Stack<>();
                while(st.lastElement().compareTo("(") != 0) ex.push(st.pop());
                st.pop();
                st.push(process(ex));
            }else st.push(x);
        }
        System.out.println(st.pop());
    }
    public static void main(String[] args) throws IOException {
        Scanner sc = new Scanner(new File("BIEUTHUC.in"));
        // Scanner sc = new Scanner(System.in);
        int T = sc.nextInt();
        sc.nextLine();
        while(T-->0) solve("("+sc.nextLine()+")");
    }
}
