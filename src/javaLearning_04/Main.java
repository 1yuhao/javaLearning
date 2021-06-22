package javaLearning_04;

import java.util.ArrayList;
import java.util.HashSet;

public class Main {
    public static void main(String[] args) {
//        NoteBook nb = new NoteBook();
//        nb.add("first");
//        nb.add("second");
//        System.out.println(nb.getSize());
//        System.out.println(nb.getNote(0));
//        nb.add("thrid", 1);
//        System.out.println(nb.getNote(1));
//        nb.removeNote(1);
//        String[] a = nb.list();
//        for (String s : a) {
//            System.out.println(s);
//        }
        ArrayList<String> a = new ArrayList<String>();
        a.add("asda");
        a.add("sdad");
        a.add("asda");
        System.out.println(a);
        System.out.println("-----------");
        HashSet<String> s=new HashSet<String>();
        s.add("aqwewqe");
        s.add("afsafas");
        s.add("aqwewqe");
        System.out.println(s);

        Value v =new Value();
        v.set(10);
        System.out.println(v);

    }
}
