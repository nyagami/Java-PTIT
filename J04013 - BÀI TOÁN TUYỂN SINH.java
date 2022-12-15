import java.io.FileNotFoundException;
import java.util.Scanner;

public class Main {

    private static class ThiSinh {
        private String id, name;
        private double scoreT, scoreL, scoreH, priorityScore, totalScore, sum;
        private String tt;

        ThiSinh(String id, String name, double scoreT, double scoreL, double scoreH) {
            this.id = id;
            this.name = name;
            this.scoreT = scoreT;
            this.scoreL = scoreL;
            this.scoreH = scoreH;
            this.priorityScore = 0;
            if (id.startsWith("KV1"))
                this.priorityScore = 0.5;
            if (id.startsWith("KV2"))
                this.priorityScore = 1.0;
            if (id.startsWith("KV3"))
                this.priorityScore = 2.5;
            this.sum = scoreT * 2 + scoreL + scoreH;
            this.totalScore = scoreT * 2 + scoreL + scoreH + this.priorityScore;

        }

        void inThongTin() {
            System.out.print(this.id + ' ' + this.name + ' ');
            if ((int) this.priorityScore == this.priorityScore)
                System.out.printf("%.0f ", this.priorityScore);
            else
                System.out.printf("%.1f ", this.priorityScore);
            if ((int) this.sum == this.sum  )
                System.out.printf("%.0f ", this.sum );
            else
                System.out.printf("%.1f ", this.sum );
            if (this.totalScore >= 24)
                this.tt = "TRUNG TUYEN";
            else
                this.tt = "TRUOT";
            System.out.println(this.tt);
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        ThiSinh x = new ThiSinh(sc.nextLine(), sc.nextLine(), sc.nextDouble(), sc.nextDouble(), sc.nextDouble());
        x.inThongTin();
    }
}
