package edu.macalester.comp124.baylor.inheritance;

import acm.program.ConsoleProgram;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

/**
 * Created by baylor on 2/26/14.
 */
public class Application
	extends ConsoleProgram
{
	public void run()
	{
		//--- Old MacDonald had a farm...
		List<Animal> farm = new ArrayList<Animal>();
		Animal a = new Lion();
		farm.add(a);
//		a = new Tiger();
//		farm.add(a);
//		a = new Pug();
//		farm.add(a);

		//--- We're going to play this game until the user tells us to quit
		boolean wantToPlay = true;

		//--- Pick an animal at random
//		Random dice = new Random();
		//--- If you don't remember how to do random numbers,
		//---   Google is your friend. Also, your text book.
		Animal mysteryAnimal = farm.get(0);

		//--- Ask the user what action they want to take

		//--- Call the appropriate method on the mystery animal
		String result = mysteryAnimal.pet();
		println("The animal " + result);

		//--- Ask the user what animal they think this is
	}
}
