package javaLearning_04;

import java.util.ArrayList;

public class NoteBook {
    private ArrayList<String> notes = new ArrayList<String>();

    public void add(String s) {
        notes.add(s);
    }

    public void add(String s, int location) {
        notes.add(location, s);
    }

    public int getSize() {
        return notes.size();
    }

    public String getNote(int index) {
        return notes.get(index);
    }

    public void removeNote(int index) {
        notes.remove(index);
    }

    public String[] list() {
        String[] a = new String[notes.size()];
//        for (int i = 0; i < notes.size(); i++) {
//            a[i] = notes.get(i);
//        }
        notes.toArray(a);
        return a;
    }
}

class Value {
    private int i;

    public void set(int i) {
        this.i = i;
    }

    public int get() {
        return i;
    }

    public String toString() {
        return "" + i;
    }
}