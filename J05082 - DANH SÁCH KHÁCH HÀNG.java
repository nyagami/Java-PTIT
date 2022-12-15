import java.util.*;
import java.text.*;

public class Main {  

    static String cleanName(String name){
        String[] a = name.trim().split("\\s+");
        for(int i=0;i<a.length;i++){
            a[i] = Character.toString(a[i].charAt(0)).toUpperCase() + a[i].substring(1).toLowerCase();
        }
        return String.join(" ", a);
    }

    static String cleanDate(String date){
        String a[] = date.split("/");
        a[0] = String.format("%02d", Integer.parseInt(a[0]));
        a[1] = String.format("%02d", Integer.parseInt(a[1])); 
        return String.join("/", a);
    }

    static class ob {
        String code, name, sex, strdate, address;
        Long date;

        public ob(int i, String name, String sex, String date, String address){
            this.code = "KH" + String.format("%03d", i);
            this.name = cleanName(name);
            this.sex = sex;
            this.address = address;
            this.strdate = cleanDate(date);
            SimpleDateFormat f = new SimpleDateFormat("dd/mm/yyyy");
            try{
                this.date = f.parse(this.strdate).getTime();
            }catch(ParseException e){

            }
        }

        @Override 
        public String toString(){
            return code + " " + name + " " + sex + " " + address + " " + strdate;
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        ArrayList<ob> a = new ArrayList<>();
        int n = sc.nextInt();
        sc.nextLine();
        for(int i=0;i<n;i++){
            a.add(new ob(i+1, sc.nextLine(), sc.nextLine(), sc.nextLine(), sc.nextLine()));
        }
        a.sort((ob x, ob y) ->{
            if(x.date.compareTo(y.date)==0){
                return x.code.compareTo(y.code);
            }
            return x.date.compareTo(y.date);
        });
        a.forEach(e -> System.out.println(e));
    }
}
