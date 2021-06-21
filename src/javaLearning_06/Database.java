package javaLearning_06;

import java.util.ArrayList;

public class Database {
//    private ArrayList<CD> listCD=new ArrayList<CD>();
    private  ArrayList<Item> listItem = new ArrayList<Item>();

    public void add(Item item){
        listItem.add(item);
    }

    @Override
    public String toString() {
        return "Database{" +
                "listItem=" + listItem +
                '}';
    }

    public void list(){
        for(Item item :listItem){
            item.print();
            System.out.println();
        }
    }

}
