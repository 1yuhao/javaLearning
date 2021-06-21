package javaLearning_03;

import static java.lang.Thread.sleep;

public class Clock {
    private Display hour = new Display(24);
    private Display minute = new Display(60);

    public void start() throws InterruptedException {
        while (true) {
            minute.increase();
            if (minute.getValue() == 0) {
                hour.increase();
            }
            System.out.printf("%02d:%02d\n", hour.getValue(), minute.getValue());
            sleep(1000);
        }
    }

}
