import java.util.ArrayList;

public class Main
{
    public static void main(String[] args) throws Exception
    {
        ArrayList <Player> PlayerList = new ArrayList<>();

        PlayerManager playerManager = new PlayerManager(new MernisServiceAdapter());
        GameManager gamesManager = new GameManager();
        CampaignManager campaignManager = new CampaignManager();

        Player player1 = new Player(1,"Edib Esad","Galip",2001,"");
        Campaign campaign1 = new Campaign(1,10,"Yüzde 10 indirim");
        Game game1 = new Game(1,"Age of Empires",100,campaign1);


        playerManager.addPlayer(player1);

        player1.games.add(game1);

        System.out.println(game1.getUnitPrice());
    }
}
