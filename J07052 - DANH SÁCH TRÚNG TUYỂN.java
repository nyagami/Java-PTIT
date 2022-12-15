package VaoRaFile;
import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;
/**
 *
 * @author Houta
 */
public class DanhSachTrungTuyen {
    static double diemChuan ;
    private static class ThiSinh implements Comparable<ThiSinh>{
        private String id,name;
        private double scoreT,scoreL,scoreH,priorityScore,totalScore;
        private String tt;

        ThiSinh(String id, String name, double scoreT, double scoreL, double scoreH) {
            this.id = id;
            this.name = chuanHoaTen(name);
            this.scoreT = scoreT;
            this.scoreL = scoreL;
            this.scoreH = scoreH;
            this.priorityScore = 0;
            if(id.startsWith("KV1")) this.priorityScore = 0.5;
            if(id.startsWith("KV2")) this.priorityScore = 1.0;
            if(id.startsWith("KV3")) this.priorityScore = 2.5;
            this.totalScore = scoreT*2+scoreL+scoreH+ this.priorityScore;
            
        }
        static String chuanHoaTen(String s){
            s = s.trim().toLowerCase();
            String res = "" + Character.toUpperCase(s.charAt(0));
            for(int i=1; i< s.length();i++){
                if(Character.isLetter(s.charAt(i))){
                    if(s.charAt(i-1) == ' ') res+= " "+ Character.toUpperCase(s.charAt(i));
                    else res += s.charAt(i);
                }
            }
            return res;
        }
        
        @Override
        public int compareTo(ThiSinh o) {
            if(this.totalScore<o.totalScore) return 1;
            if(this.totalScore>o.totalScore) return -1;
            return this.id.compareTo(o.id);
        }        
        
        void inThongTin(){
            System.out.print(this.id+' '+this.name+' ');
            if((int)this.priorityScore == this.priorityScore ) System.out.printf("%.0f ",this.priorityScore);
            else  System.out.printf("%.1f ",this.priorityScore);
            if((int)this.totalScore == this.totalScore ) System.out.printf("%.0f ",this.totalScore);
            else  System.out.printf("%.1f ",this.totalScore);
            if(this.totalScore>=diemChuan) this.tt = "TRUNG TUYEN";
            else this.tt = "TRUOT";
            System.out.println(this.tt);
        }
    }
    public static void main(String []args) throws FileNotFoundException{
        Scanner sc = new Scanner(new File("THISINH.in"));
        ArrayList<ThiSinh> ds = new ArrayList<>();
        int t = sc.nextInt();
        while(t-->0){
            sc.nextLine();
            ds.add(new ThiSinh(sc.nextLine(),sc.nextLine(),sc.nextDouble(),sc.nextDouble(),sc.nextDouble()));
        }
        int k = sc.nextInt();
        Collections.sort(ds);
        diemChuan = ds.get(k-1).totalScore;
        System.out.printf("%.1f\n",diemChuan);
        for(ThiSinh tmp : ds) 
            tmp.inThongTin();
    }
}
