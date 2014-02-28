package edu.macalester.comp124.baylor.winterball;

import acm.program.ConsoleProgram;

import java.util.List;

public class Application
	extends ConsoleProgram
{
	public void run()
	{
		println("  *********************************");
		println("  ***  Road to the Winter Ball  ***");
		println("  *********************************");
		println();

//		Game theGame = new Game();
//
//		while (!theGame.isOver())
//		{
//			println("Day " + theGame.getDay());
//			println("What do you want to do?");
//
//			int action = getAction(theGame.getActions());
//
////			List<Person> boys = theGame.getLoveInterests();
//
//			println();
//		}
//		String ending = theGame.getEnding();
//		println(theGame.getEndingText(ending));
	}

	private String getAction(List<String> actions)
	{
		for (int i=0; i<actions.size(); i++)
		{
			println(i + ") " + actions.get(i));
		}
		print("Choice: ");
		int selectedActionIndex = readInt();
		String action = actions.get(selectedActionIndex);
		return action;
	}
}
