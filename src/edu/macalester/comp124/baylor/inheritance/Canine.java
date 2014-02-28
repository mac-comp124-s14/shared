package edu.macalester.comp124.baylor.inheritance;


abstract public class Canine
    extends Animal
{
    public Canine(String species)
    {
        super(species);
    }

    @Override
    public String giveChocolate()
    {
        return "straight up dies";
    }
}
