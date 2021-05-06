import java.util.ArrayList;

public class Campaign
{
    int id;
    String name;
    int discount;

    public Campaign(int id, int discount,String name)
    {
        this.id = id;
        this.discount = discount;
        this.name = name;
    }

    public int getId()
    {
        return id;
    }

    public int getDiscount()
    {
        return discount;
    }

    public void setDiscount(int discount)
    {
        this.discount = discount;
    }
}
