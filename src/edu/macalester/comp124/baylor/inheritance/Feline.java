package edu.macalester.comp124.baylor.inheritance;

abstract public class Feline
	extends Animal
{
	public Feline(String species)
	{
		super(species);
	}

	@Override
	public String pet()
	{
		return "purrs";
	}
    @Override
    public String giveCarrots()
    {
        return "turns up its nose!";
    }
    @Override
    public String giveChocolate()
    {
        return "yum!";
    }
}
