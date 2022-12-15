import java.util.*;

public class non {

    static ArrayList<String> genn(String s){
        ArrayList<String> a = new ArrayList<>();
        if(s.charAt(0) == '?'){
            for(char c = '1'; c <= '9'; c++) a.add(c + "" + s.charAt(1));
        }else a.add(s);
        if(s.charAt(1) == '?'){
            ArrayList<String> ans = new ArrayList<>();
            for(String i : a){
                for(char c = '0'; c <= '9'; c++) ans.add(i.charAt(0) + "" + c);
            }
            return ans;
        }
        return a;
    }

    static String geno(String s){
        if(s.charAt(0) == '?') return "+-";
        return s;
    }

    static int cal(int a, int b, char op){
        if(op == '+') return a+b;
        return a-b;
    }

    static boolean check(String a, char op, String b, String c){
        if("*/".indexOf(op) > -1) return false;
        int x = Integer.parseInt(a);
        int y = Integer.parseInt(b);
        int z = Integer.parseInt(c);
        return x>9 && y>9 && z>9 && cal(x, y, op) == z;
    }

    static void solve(String a, String op, String b, String equal, String c){
        ArrayList<String> arr1 = genn(a);
        ArrayList<String> arr2 = genn(b);
        ArrayList<String> arr3 = genn(c);
        op = geno(op);
        for(String i:arr1){
            for(String j:arr2){
                for(String k:arr3){
                    for(int u=0;u<op.length();u++){
                        if(check(i, op.charAt(u), j, k)){
                            System.out.println(String.format("%s %c %s = %s", i, op.charAt(u), j, k));
                            return;
                        }
                    }
                }
            }
        }
        System.out.println("WRONG PROBLEM!");
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int T = sc.nextInt();
        while(T-->0) solve(sc.next(), sc.next(), sc.next(), sc.next(), sc.next());
    }
}
