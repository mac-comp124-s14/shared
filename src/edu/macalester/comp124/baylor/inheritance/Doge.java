package edu.macalester.comp124.baylor.inheritance;

public class Doge
extends Canine
{
    public Doge()
    {
        super("Doge");
    }
    @Override
    public String pet()
    {
        return "wow! bark!";
    }
    @Override
    public String giveMeat()
    {
        return "such carnivore!";
    }
    @Override
    public String giveCarrots()
    {
        return "plz no!";
    }
    @Override
    public String walk()
    {
        return "much awesome!";
    }
    @Override
    public String wrestle()
    {
        return "so excite!";
    }
    @Override
    public String pickUp()
    {
        return "nice arsmz!";
    }
}
