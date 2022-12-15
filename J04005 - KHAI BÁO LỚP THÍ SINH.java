import java.util.Scanner;
public class Main{
    static class person{
        String name, date;
        float a, b, c;
        public void out(){
            System.out.printf("%s %s %.1f", name, date, a + b + c);
        }
        public void in(Scanner sc){
            name = sc.nextLine();
            date = sc.next();
            a = sc.nextFloat();
            b = sc.nextFloat();
            c = sc.nextFloat();
        }
    }
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        person a = new person();
        a.in(sc);
        a.out();
        sc.close();
    }
}
