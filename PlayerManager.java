import java.util.ArrayList;

public class PlayerManager
{
    private PlayerCheckService playerCheckService;
    ArrayList<Player> players = new ArrayList<Player>();

    public PlayerManager(PlayerCheckService playerCheckService)
    {
        this.playerCheckService = playerCheckService;

    }

    void addPlayer(Player player) throws Exception
    {
        if (playerCheckService.CheckIfRealPerson(player))
        {
            System.out.println("Oyunucu eklendi : " + player.getName());
            this.players.add(player);
        } else
        {
            System.out.println("Geçersiz Bilgi");
        }
    }

    void updatePlayer(Player player, String newPLayerName, String newPlayerSurname, int yearOfBirth, String newPlayerNationalityId)
    {
        player.setName(newPLayerName);
        player.setSurName(newPlayerSurname);
        player.setYearOfBirth(yearOfBirth);
        player.setNationalityId(newPlayerNationalityId);
        System.out.println("Oyuncu güncellendi");
    }

    void deletePlayer(Player player)
    {
        player = new Player(-1, null, null, -1, null);
        System.out.println("Oyuncu silindi");
    }

    void getPlayer(Player player)
    {
        System.out.println("Oyuncu ismi : " + player.getName());
        System.out.println("Oyuncu soyismi : " + player.getSurName());
        System.out.println("Oyuncu doğum yılı : " + player.getYearOfBirth());
        System.out.println("Oyuncu TC no : " + player.getNationalityId());
    }

    void searchPlayer(int id)
    {
        for (Player player:players)
        {
            if (player.getId()==id)
            {
                getPlayer(player);
            }
        }
    }
}
