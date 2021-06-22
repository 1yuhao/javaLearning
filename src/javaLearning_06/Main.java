package javaLearning_06;

public class Main
{
    public static void main(String[] args)
    {
        Database db = new Database();
        db.add(new CD("青花瓷", "周杰伦", 5, 180, "这是一首很好听的歌"));
        db.add(new CD("菊花残", "周杰伦", 5, 180, "这是一首很好听的歌"));
        db.add(new VideoGame("ddd", 10, true, "sadasd", 32123));
        db.list();
    }
}
