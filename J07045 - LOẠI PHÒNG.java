import java.util.*;
import java.io.*;
import java.nio.charset.StandardCharsets;

public class Main{
    static class LoaiPhong implements Comparable<LoaiPhong>{
        String p, name;
        public LoaiPhong(String s){
            p = s;
            InputStream is = new ByteArrayInputStream(s.getBytes(StandardCharsets.UTF_8));
            Stack<String> st = new Stack<>();
            Scanner sc = new Scanner(is);
            sc.next();
            while(sc.hasNext()){
                st.push(sc.next());
            }
            st.pop();
            st.pop();
            name = "";
            while(!st.empty()){
                name = st.pop() + " " + name;
            }
        }
        public String toString(){
            return p;
        }
        @Override
        public int compareTo(LoaiPhong o) {
            return name.compareTo(o.name);
        }
    }
    public static void main(String[] args) throws IOException {
        ArrayList<LoaiPhong> ds = new ArrayList<>();
        Scanner in = new Scanner(new File("PHONG.in"));
        int n = Integer.parseInt(in.nextLine());
        while(n-->0){
            ds.add(new LoaiPhong(in.nextLine()));
        }
        Collections.sort(ds);
        for(LoaiPhong tmp : ds){
            System.out.println(tmp);
        }
    }
    public static void main6777130(String[] args) throws IOException {
        ArrayList<LoaiPhong> ds = new ArrayList<>();
        Scanner in = new Scanner(new File("PHONG.in"));
        int n = Integer.parseInt(in.nextLine());
        while(n-->0){
            ds.add(new LoaiPhong(in.nextLine()));
        }
        Collections.sort(ds);
        for(LoaiPhong tmp : ds){
            System.out.println(tmp);
        }
    }
}
