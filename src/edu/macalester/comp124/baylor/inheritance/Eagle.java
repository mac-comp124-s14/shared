package edu.macalester.comp124.baylor.inheritance;

public class Eagle
extends Avian
{
    public Eagle()
    {
        super("Eagle");
    }
    @Override
    public String pet()
    {
        return "SCREECH!";
    }
    @Override
    public String giveMeat()
    {
        return "Devours";
    }
    @Override
    public String giveCarrots()
    {
        return "America won't eat carrots. Neither will I.";
    }
    @Override
    public String wrestle()
    {
        return "you lose your eyes";
    }
    @Override
    public String pickUp()
    {
        return "it crushes your arm, but it seems kay with it";
    }
}
