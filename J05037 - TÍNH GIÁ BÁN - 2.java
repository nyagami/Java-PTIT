import java.util.*;
import java.text.*;
public class Main {
    
    static class ob {
        String code, name, unit;
        Long price, mount, ship, total, sell;
        public ob(int i, String name, String unit, long price, long mount){
            code = "MH" + String.format("%02d", i);
            this.name = name;
            this.unit = unit;
            this.price = price;
            this.mount = mount;
            ship = Math.round((double) price*mount*0.05);
            total = price*mount + ship;
            sell = Math.round((double)total*1.02/mount);
            if(sell%100!=0) sell = sell - sell%100 + 100;
        }

        public String toString() {
            return code+' '+name+' '+unit+" "+ship+" "+total+" "+sell;
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        ArrayList<ob> a = new ArrayList<>();
        for(int i=0;i<n;i++){
            sc.nextLine();
            a.add(new ob(i+1, sc.nextLine(), sc.nextLine(), sc.nextLong(), sc.nextLong()));
        }
        a.sort((ob x, ob y) -> {
            return y.sell.compareTo(x.sell);
        });
        a.forEach(e->System.out.println(e));
    }
}
