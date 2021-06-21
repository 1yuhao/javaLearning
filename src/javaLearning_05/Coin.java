package javaLearning_05;

import java.util.HashMap;

public class Coin {
    private HashMap<Integer, String> coinnames = new HashMap<Integer, String>();

    public Coin() {
        coinnames.put(1, "penny");
        coinnames.put(10, "dime");
        coinnames.put(25, "quarter");
        coinnames.put(50, "half-dollar");
        coinnames.put(50, "五毛");
        System.out.println(coinnames.size());
    }

    public String getName(int amount) {
        if (coinnames.containsKey(amount)) {
            return coinnames.get(amount);
        } else {
            return "NOT FOUND";
        }
    }
}
