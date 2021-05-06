public class Game
{
    private int id;
    private String name;
    private double unitPrice;
    private Campaign campaign;

    public Game(int id, String name, double unitPrice)
    {
        this.id = id;
        this.name = name;
        this.unitPrice = unitPrice;
    }
    public Game(int id, String name, double unitPrice, Campaign campaign)
    {
        this.id = id;
        this.name = name;
        this.unitPrice = unitPrice-(unitPrice* campaign.discount/100);
        this.campaign = campaign;
    }

    public int getId()
    {
        return id;
    }

    public void setId(int id)
    {
        this.id = id;
    }

    public String getName()
    {
        return name;
    }

    public void setName(String name)
    {
        this.name = name;
    }

    public double getUnitPrice()
    {
        return unitPrice;
    }

    public void setUnitPrice(double unitPrice)
    {
        this.unitPrice = unitPrice;
    }
}
