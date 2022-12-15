import java.util.Scanner;
import java.util.ArrayList;

class Imformation{
    protected String code, name;
    protected int price;
    
    public Imformation(String code, String name, int price){
        this.code = code;
        this.name = name;
        this.price = price;
    }
}

class Call{
    private Imformation thongtin;
    private String so, bd, kt;
    int sum;
    public Call(Imformation thongtin, String so, String bd, String kt){
        this.thongtin = thongtin;
        this.so = so;
        this.bd = bd;
        this.kt = kt;
        this.sum = kq(thoiGian(bd, kt, thongtin), thongtin);
    }
    
    public int thoiGian(String s1, String s2, Imformation a){
        int tam = (Integer.parseInt(s2.substring(0,2))-Integer.parseInt(s1.substring(0,2)))*60+Integer.parseInt(s2.substring(3))-Integer.parseInt(s1.substring(3));
        if(a.code.equals("100")==true){
            if(tam%3==0) return tam/3;
            return tam/3+1;
        }
        return tam;
    }
    
    public int kq(int a, Imformation b){
        return a*b.price;
    }

    
    @Override
    public String toString(){
        return String.format("%s %s %d %d", so, thongtin.name, thoiGian(bd, kt, thongtin), sum);
    }
}

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = Integer.parseInt(sc.nextLine());
        ArrayList<Imformation> arr1 = new ArrayList<>();
        for(int i=1;i<=n;i++){
            String code = sc.nextLine();
            String name = sc.nextLine();
            int price = Integer.parseInt(sc.nextLine());
            Imformation a = new Imformation(code, name, price);
            arr1.add(a);
        }
        int m = Integer.parseInt(sc.nextLine());
        ArrayList<Call> arr2 = new ArrayList<>();
        for(int i=1;i<=m;i++){
            String[] s = sc.nextLine().trim().split("\\s+");
            String so = s[0];
            String bd = s[1];
            String kt = s[2];
            if(so.charAt(0)!='0'){
                Imformation tam = new Imformation("100", "Noi mang", 800);
                Call a = new Call(tam, so, bd, kt);
                arr2.add(a);
            }
            else{
                for(Imformation j:arr1){
                    if(j.code.equals(so.substring(1,3))==true){
                        Call a = new Call(j, so, bd, kt);
                        arr2.add(a);
                        break;
                    }
                }
            }
        }
        arr2.sort((Call x, Call y) -> y.sum - x.sum);
        for(Call i:arr2){
            System.out.println(i);
        }
    }
}
