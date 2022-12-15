import java.util.*;
import java.io.*;
import java.nio.charset.StandardCharsets;

public class Main{
    public static void main(String[] arg)throws IOException, ClassNotFoundException {
        ObjectInputStream o = new ObjectInputStream(new FileInputStream("NHIPHAN.in"));
        ArrayList<String> a = (ArrayList<String>) o.readObject();  
        ArrayList<String> b = new ArrayList<>();
        a.forEach(s -> {
            InputStream is = new ByteArrayInputStream(s.getBytes(StandardCharsets.UTF_8));
            Scanner ss = new Scanner(is);
            while(ss.hasNext()){
                String x = ss.next().toLowerCase();
                if(!b.contains(x)) b.add(x);
            }
        });
        ArrayList<String> doc = new ArrayList<>();
        Scanner sc = new Scanner(new File("VANBAN.in"));
        while(sc.hasNext()){
            String s = sc.next().toLowerCase();
            if(!doc.contains(s)) doc.add(s);
        }
        doc.forEach(e -> {
            if(b.contains(e)) System.out.println(e);
        });
    }
}
