import java.util.*;
public class Main {
    static class ob {
        String name;
        int ac, sub;
        public ob(String name, int ac, int sub){
            this.name = name;
            this.ac = ac;
            this.sub = sub;
        }

        public String toString() {
            return name + " " + ac + " " + sub;
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        ArrayList<ob> a = new ArrayList<>();
        for(int i=0;i<n;i++){
            sc.nextLine();
            a.add(new ob(sc.nextLine(), sc.nextInt(), sc.nextInt()));
        }
        a.sort((ob x, ob y) ->{
            if(x.ac == y.ac){
                if(x.sub == y.sub) return x.name.compareTo(y.name);
                return x.sub - y.sub;
            }
            return y.ac - x.ac;
        });
        a.forEach(e -> System.out.println(e));
    }
}
