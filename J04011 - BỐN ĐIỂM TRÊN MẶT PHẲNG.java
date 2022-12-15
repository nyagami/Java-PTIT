import java.util.*;

public class Main {

    static long def(long a, long b, long c, long d) {
        return a * d - b * c;
    }

    static class Vector {
        long x, y, z;

        public Vector(long a, long b, long c) {
            x = a;
            y = b;
            z = c;
        }

        public Vector() {
            x = 0;
            y = 0;
            z = 0;
        }

        public long tvh(Vector b) {
            return this.x * b.x + this.y * b.y + this.z * b.z;
        }
        
        public Vector tch(Vector b) {
            Vector r = new Vector();
            r.x = def(this.y, this.z, b.y, b.z);
            r.y = def(this.z, this.x, b.z, b.x);
            r.z = def(this.x, this.y, b.x, b.y);
            return r;
        }
        
    }

    static class Point3D {
        long x, y, z;

        public Point3D(int l, int m, int n) {
            x = (long) l;
            y = (long) m;
            z = (long) n;
        }
        
        public Point3D(long l, long m, long n) {
            x = (long) l;
            y = (long) m;
            z = (long) n;
        }

        static boolean check(Point3D p1, Point3D p2, Point3D p3, Point3D p4) {
            Vector v1 = new Vector(p1.x - p2.x, p1.y - p2.y, p1.z - p2.z);
            Vector v2 = new Vector(p1.x - p3.x, p1.y - p3.y, p1.z - p3.z);
            Vector v3 = new Vector(p1.x - p4.x, p1.y - p4.y, p1.z - p4.z);
            Vector h = v1.tch(v2);
            return h.tvh(v3) == 0;
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while(t-->0){
        Point3D p1 = new Point3D(sc.nextInt(),sc.nextInt(),sc.nextInt());
        Point3D p2 = new Point3D(sc.nextInt(),sc.nextInt(),sc.nextInt());
        Point3D p3 = new Point3D(sc.nextInt(),sc.nextInt(),sc.nextInt());
        Point3D p4 = new Point3D(sc.nextInt(),sc.nextInt(),sc.nextInt());
        
        if(Point3D.check(p1,p2,p3,p4)){
            System.out.println("YES");
        } else{
            System.out.println("NO");
        }
        }
    }
    public static void main5078725(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while (t-- > 0) {
            Point3D p1 = new Point3D(sc.nextInt(), sc.nextInt(), sc.nextInt());
            Point3D p2 = new Point3D(sc.nextInt(), sc.nextInt(), sc.nextInt());
            Point3D p3 = new Point3D(sc.nextInt(), sc.nextInt(), sc.nextInt());
            Point3D p4 = new Point3D(sc.nextInt(), sc.nextInt(), sc.nextInt());

            if (Point3D.check(p1, p2, p3, p4)) {
                System.out.println("YES");
            } else {
                System.out.println("NO");
            }
        }
    }
}
