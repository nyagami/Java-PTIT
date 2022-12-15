import java.util.*;
public class Main {
    
    static class ob {
        String code, name;
        int student;

        public ob(String code, String name, int student){
            this.code = code;
            this.name = name;
            this.student = student;
        }

        public String toString() {
            return code + ' ' + name + ' ' + student;
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        ArrayList<ob> a = new ArrayList<>();
        for(int i=0;i<n;i++){
            sc.nextLine();
            a.add(new ob(sc.nextLine(), sc.nextLine(), sc.nextInt()));
        }
        a.sort((ob x, ob y) -> {
            if(x.student == y.student) return x.code.compareTo(y.code);
            return y.student - x.student;
        });
        a.forEach(e -> System.out.println(e));
    }
}
