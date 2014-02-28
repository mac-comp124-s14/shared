package edu.macalester.comp124.baylor.inheritance;

public class TabbyCat
extends Feline
{
    public TabbyCat()
    {
        super("Tabby Cat");
    }

    @Override
    public String giveMeat()
    {
        return "it won't eat it";
    }
    @Override
    public String walk()
    {
        return "it walks off on its own almost immediately";
    }
    @Override
    public String wrestle()
    {
        return "did not like";
    }
    @Override
    public String pickUp()
    {
        return "struggles, but lets you";
    }
}
