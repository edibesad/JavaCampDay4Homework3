import MernisManager.FBTKPSPublicSoap;

import java.util.ArrayList;

public class Player
{
    private int id;
    private String name;
    private String surName;
    private int yearOfBirth;
    private String nationalityId;
    public ArrayList<Game> games;


    public Player(int id, String name, String surName, int yearOfBirth, String nationalityId)
    {
        games = new ArrayList<Game>();
        this.id = id;
        this.name = name;
        this.surName = surName;
        this.yearOfBirth = yearOfBirth;
        this.nationalityId = nationalityId;
    }

    public int getId()

    {
        return id;
    }

    public String getName()
    {
        return name;
    }

    public void setName(String name)
    {
        this.name = name;
    }

    public String getSurName()
    {
        return surName;
    }

    public void setSurName(String surName)
    {
        this.surName = surName;
    }

    public int getYearOfBirth()
    {
        return yearOfBirth;
    }

    public void setYearOfBirth(int yearOfBirth)
    {
        this.yearOfBirth = yearOfBirth;
    }

    public String getNationalityId()
    {
        return nationalityId;
    }

    public void setNationalityId(String nationalityId)
    {
        this.nationalityId = nationalityId;
    }
}
