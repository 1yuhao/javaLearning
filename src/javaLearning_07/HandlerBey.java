package javaLearning_07;

public class HandlerBey extends Handler {

    public HandlerBey(Game game) {
        super(game);
    }

    @Override
    public boolean isBey() {
        return true;
    }
}
