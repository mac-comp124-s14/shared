package edu.macalester.comp124.baylor.arrays;

abstract public class MythicalAnimal
{
	private String name;
	public MythicalAnimal(String name)
	{
		this.name = name;
	}

	public String getName()
	{
		return name;
	}

	@Override
	public String toString()
	{
		return name;
	}
}
