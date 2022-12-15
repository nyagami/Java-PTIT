import java.io.*;
import java.util.*;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = Integer.parseInt(sc.nextLine());
        while(t-->0){
            String s = sc.next();
            Stack<Integer> st = new Stack<>();
            for(int i=0;i<s.length();i++){
                if(st.size()<2) st.push(i);
                else{
                    if(s.charAt(i) == '0' && s.charAt(st.lastElement()) == '0' && s.charAt(st.elementAt(st.size() - 2)) == '1'){
                        st.pop();
                        st.pop();
                    }else st.push(i);
                }
            }
            int ans = 0;
            for(int i=1;i<st.size();i++){
                ans = Math.max(ans, st.elementAt(i) - st.elementAt(i-1) - 1);
            }
            if(st.empty()) ans = s.length();
            else{
                ans = Math.max(ans, st.elementAt(0));
                ans = Math.max(ans, s.length() - st.lastElement() - 1);
            }
            System.out.println(ans);
        }
    }
}
