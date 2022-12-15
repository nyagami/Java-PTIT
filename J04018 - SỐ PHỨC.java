import java.util.*;

public class Main {
    
    static class complex{
        int real, img;

        public complex(int a, int b){
            real = a;
            img = b;
        }

        public complex add(complex b){
            complex x = new complex(0, 0);
            x.real = real + b.real;
            x.img = img + b.img;
            return x;
        }

        public complex mul(complex b){
            complex x = new complex(0, 0);
            x.real = real*b.real + -img*b.img;
            x.img = real*b.img + img*b.real;
            return x;
        }

        @Override
        public String toString(){
            return real + " + " + img + 'i';
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while(t-- >0){
            complex a = new complex(sc.nextInt(), sc.nextInt());
            complex b = new complex(sc.nextInt(), sc.nextInt());
            complex c = a.add(b).mul(a);
            complex d = a.add(b).mul(a.add(b));
            System.out.printf("%s, %s\n", c, d);
        }
    }
}
