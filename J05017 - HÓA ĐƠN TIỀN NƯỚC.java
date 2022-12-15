import java.io.*;
import java.util.*;

public class Main {

    static class ob{
        String code, name;
        Long total, sum, plus, fin;

        public ob(int i, String name, long pre, long af){
            this.code = String.format("KH%02d", i);
            this.name = name;
            this.total = af - pre;
            this.sum = Math.min(50, this.total)*100;
            this.plus = Math.round(this.sum*0.02);
            if(this.total>50){
                this.sum += Math.min(50, this.total-50)*150;
                this.plus = Math.round(this.sum*0.03);
            }
            if(this.total>100){
                this.sum += (this.total - 100)*200;
                this.plus = Math.round(this.sum*0.05);
            }
            this.fin = this.sum + this.plus;
        }

        @Override
        public String toString(){
            return code + " " + name + " " + fin;
        }
    }

    public static void main(String[] args) throws IOException, ClassNotFoundException {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        ArrayList<ob> a = new ArrayList<>();
        for(int i=0;i<n;i++){
            sc.nextLine();
            a.add(new ob(i+1, sc.nextLine(), sc.nextLong(), sc.nextLong()));
        }
        a.sort((ob x, ob y) -> y.fin.compareTo(x.fin));
        a.forEach(e -> System.out.println(e));
    }
}

