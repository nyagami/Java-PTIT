import java.util.Scanner;

public class Main{
    static class goods{
        public goods(String n, String u, int b, int s,int i){
            name = n;
            unit = u;
            buy = b;
            sell = s;
            pro = s - b;
            String str = Integer.toString(i);
            code = i;
        }
        public String sCode(){
            String s = Integer.toString(code);
            while(s.length()<3) s = "0" + s;
            return "MH" + s;
        }
        public boolean small(goods b){
            if(pro == b.pro) return code > b.code;
            return pro < b.pro;
        }
        String name, unit;
        int buy,sell,pro,code;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        goods[] a = new goods[n];
        for(int i=0; i<n; i++){
            sc.nextLine();
            a[i] = new goods(sc.nextLine(), sc.nextLine(), sc.nextInt(), sc.nextInt(), i+1);
        }
        goods tmp;
        for(int i=0; i<n-1; i++){
            for(int j=i+1; j<n; j++){
                if(a[i].small(a[j])){
                    tmp = a[i];
                    a[i] = a[j];
                    a[j] = tmp;
                }
            }
        }
        for(int i=0; i<n; i++){
            System.out.printf("%s %s %s %d %d %d\n", a[i].sCode(), a[i].name,
            a[i].unit, a[i].buy, a[i].sell, a[i].pro);
        }
    }
}
