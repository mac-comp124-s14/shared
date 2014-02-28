package edu.macalester.comp124.baylor.inheritance;

/**
 * Created by Jenny on 2/27/14.
 */
public class Pug
extends Canine
{
    public Pug()
    {
        super("Pug");
    }
    @Override
    public String pet()
    {
        return "ruff!";
    }
    @Override
    public String giveMeat()
    {
        return "omm nom nom - snort";
    }
    @Override
    public String giveCarrots()
    {
        return "it won't eat it";
    }
    @Override
    public String walk()
    {
        return "its favorite";
    }
    @Override
    public String wrestle()
    {
        return "it's a little small, but enjoys it.";
    }
    @Override
    public String pickUp()
    {
        return "it's very cuddly in your arms";
    }
}
