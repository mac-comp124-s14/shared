package edu.macalester.comp124.baylor.inheritance;

public class Pigeon
extends Avian
{
    public Pigeon()
    {
        super("Pigeon");
    }
    @Override
    public String pet()
    {
        return "coo! coo!";
    }
    @Override
    public String giveMeat()
    {
        return "nope";
    }
    @Override
    public String giveCarrots()
    {
        return "nope";
    }
    @Override
    public String wrestle()
    {
        return "you crush it";
    }
    @Override
    public String pickUp()
    {
        return "good! now you can perform magic tricks!";
    }
}
