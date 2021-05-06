public class GameManager implements GameService
{
    public void buyGame(Player player, Game game)
    {
        player.games.add(game);
        System.out.println("Oyun satın alındı!");
    }

    @Override
    public void add(Game game)
    {
        System.out.println("Oyun eklendi : " + game.getName());
    }
}
