test/Main.java
package test;

import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException, ClassNotFoundException {
        ObjectInputStream o = new ObjectInputStream(new FileInputStream("DATA.in"));
        ArrayList<Pair> a = (ArrayList<Pair>) o.readObject();
        Collections.sort(a);
        HashSet<String> h = new HashSet<>();
        for(Pair i:a){
            if(i.getFirst() < i.getSecond() && !h.contains(i.toString())){
                h.add(i.toString());
                System.out.println(i);
            }
        }
    }
}

test/Pair.java
package test;
import java.io.*;

public class Pair implements Serializable, Comparable<Pair>{
    private int first, second;

    public Pair(int first, int second){
        this.first = first;
        this.second = second;
    }
    public int getFirst(){return first;}
    public int getSecond(){return second;}
    public int compareTo(Pair o) {
        return this.first - o.first;
    }

    public String toString(){
        return "(" + first + ", " + second + ")";
    }
}

