import java.util.*;;

public class Main {
    static long gcd(long a, long b) {
        if (b == 0)
            return a;
        return gcd(b, a % b);
    }
    
    static class ps {
        long t, m;

        public ps(long x, long y) {
            t = x;
            m = y;
            this.rg();
        }

        public void rg() {
            long x = gcd(t, m);
            t /= x;
            m /= x;
            // if (m < 0) {
            //     t *= -1;
            //     m *= -1;
            // }
        }

        public ps add(ps b) {
            ps r = new ps(0, 1);
            r.m = m * b.m;
            r.t = t * b.m + m * b.t;
            r.rg();
            return r;
        }

        public ps mul(ps b) {
            ps r = new ps(0, 1);
            r.t = t * b.t;
            r.m = m * b.m;
            r.rg();
            return r;
        }

        @Override
        public String toString() {
            return String.format("%d/%d", t, m);
        }
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while (t-- > 0) {
            ps a = new ps(sc.nextLong(), sc.nextLong());
            ps b = new ps(sc.nextLong(), sc.nextLong());
            ps sum = a.add(b);
            ps c = sum.mul(sum);
            ps d = a.mul(b.mul(c));
            System.out.printf("%s %s\n", c, d);
            
        }
    }
}
