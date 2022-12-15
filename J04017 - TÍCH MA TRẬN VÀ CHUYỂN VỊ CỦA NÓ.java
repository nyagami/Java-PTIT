import java.io.File;
import java.io.IOException;
import java.util.*;

public class Main {

    static class Matrix {
        long[][] a;
        int n, m;

        public Matrix(int n, int m) {
            a = new long[n][m];
            this.n = n;
            this.m = m;
        }

        public void nextMatrix(Scanner sc) {
            for (int i = 0; i < n; i++) {
                for (int j = 0; j < m; j++) {
                    a[i][j] = sc.nextLong();
                }
            }
        }

        public Matrix trans(){
            Matrix r = new Matrix(m, n);
            for (int i = 0; i < m; i++) {
                for (int j = 0; j < n; j++) {
                    r.a[i][j] = a[j][i];
                }
            }
            return r;
        }

        public Matrix mul(Matrix b) {
            Matrix r = new Matrix(n, b.m);
            for (int i = 0; i < n; i++) {
                for (int j = 0; j < b.m; j++) {
                    long s = 0;
                    for (int k = 0; k < m; k++) {
                        s += a[i][k] * b.a[k][j];
                    }
                    r.a[i][j] = s;
                }
            }
            return r;
        }

        @Override
        public String toString() {
            String[] s = new String[n];
            for (int i = 0; i < n; i++) {
                s[i] = "";
                for (int j = 0; j < m; j++) {
                    s[i] += a[i][j] + " ";
                }
            }
            return String.join("\n", s);
        }

    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while(t-->0){
             int n = sc.nextInt(), m = sc.nextInt();
             Matrix a = new Matrix(n,m);
             a.nextMatrix(sc);
             Matrix b = a.trans();
             System.out.println(a.mul(b));
        }
    }
    public static void main5238774(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while (t-- > 0) {
            int n = sc.nextInt(), m = sc.nextInt();
            Matrix a = new Matrix(n, m);
            a.nextMatrix(sc);
            Matrix b = a.trans();
            System.out.println(a.mul(b));
        }
    }
}

