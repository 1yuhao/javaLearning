package javaLearning_07;

public class Handler {
    protected Game game;

    public Handler(Game game) {
        this.game = game;
    }

    public void doCmd(String word) {
    }

    public boolean isBey() {
        return false;
    }
}
