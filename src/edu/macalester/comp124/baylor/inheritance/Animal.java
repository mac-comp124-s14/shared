package edu.macalester.comp124.baylor.inheritance;

abstract public class Animal
{
	public String species;

	public Animal(String species)
	{
		this.species = species;
	}
    public String getSpecies(){
        return this.species;
    }

	abstract public String pet();
	abstract public String giveMeat();
    abstract public String giveChocolate();
    abstract public String giveCarrots();
    abstract public String walk();
    abstract public String wrestle();
    abstract public String pickUp();
}
