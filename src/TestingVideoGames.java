public class TestingVideoGames {
    public static void main(String[] args)
    {
        VideoGame game1 = new VideoGame("SkyRim","RPG","T","ALL",69.99);
        VideoGame game2 = new VideoGame("Minecraft","Sandbox","E","ALL",26.99);

        System.out.printf("game 1 is : %s%n", game1);
        System.out.printf("game 2 is : %s%n", game2);
    }
}
