danhsachsinhvien1/SinhVien.java
package danhsachsinhvien1;

import java.io.*;
import java.text.*;
import java.util.*;

public class SinhVien implements Serializable{
    private String ma, ten, lop;
    private Date ngaysinh;
    private float gpa;

    public SinhVien(int id, String ten, String lop, String ngaysinh, float gpa) throws ParseException{
        this.ma = String.format("B20DCCN%03d", id);
        this.ten = ten;
        this.lop = lop;
        SimpleDateFormat f = new SimpleDateFormat("dd/MM/yyyy");
        this.ngaysinh = f.parse(ngaysinh);
        this.gpa = gpa;
    }
    @Override 
    public String toString(){
        SimpleDateFormat f = new SimpleDateFormat("dd/MM/yyyy");
        return ma + " " + ten + " " + lop + " " + f.format(ngaysinh) + " " + String.format("%.2f", gpa);
    }
}

danhsachsinhvien1/test.java
package danhsachsinhvien1;
import java.util.*;
import java.io.*;

public class test {
    public static void main(String[] args) throws IOException, ClassNotFoundException{
        ObjectInputStream o = new ObjectInputStream(new FileInputStream("SV.in"));
        ArrayList<SinhVien> a = (ArrayList<SinhVien>) o.readObject();
        a.forEach(e -> System.out.println(e));
    }
}

