package edu.macalester.comp124.baylor.inheritance;

public class Lion
	extends Feline
{
	public Lion()
	{
		super("Lion");
	}

	@Override
	public String giveMeat()
	{
		return "tears it apart";
	}
    @Override
    public String walk()
    {
        return "I'm too noble for walks";
    }
    @Override
    public String wrestle()
    {
        return "you practically get mauled";
    }
    @Override
    public String pickUp()
    {
        return "you simply can't pick it up";
    }
}
