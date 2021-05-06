import MernisManager.FBTKPSPublicSoap;

public class MernisServiceAdapter implements PlayerCheckService
{

    public boolean CheckIfRealPerson(Player player) throws Exception
    {
        FBTKPSPublicSoap client = new FBTKPSPublicSoap();
        return client.TCKimlikNoDogrula(Long.parseLong(player.getNationalityId()),player.getName(), player.getSurName(), player.getYearOfBirth());
    }
}
