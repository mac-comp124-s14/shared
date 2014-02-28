package edu.macalester.comp124.baylor.inheritance;

abstract public class Avian
extends Animal
{
    public Avian(String species)
    {
        super(species);
    }
    @Override
    public String giveChocolate()
    {
        return "it eats it - sorta";
    }
    @Override
    public String walk()
    {
        return "doesn't walk at all really";
    }
    @Override
    public String wrestle()
    {
        return "";
    }
}
