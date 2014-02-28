package edu.macalester.comp124.baylor.winterball;

import acm.program.ConsoleProgram;

import java.util.LinkedList;
import java.util.List;

public class Example
	extends ConsoleProgram
{
	public void run()
	{
		boolean shouldQuit = false;

		while (!shouldQuit)
		{
			//--- Show the player their options
			List<String> actions = getActions();
			for (int optionIndex=0; optionIndex<actions.size(); optionIndex++)
			{
				//--- Adding 1 to make the numbers prettier
				println(optionIndex+1 + ") " + actions.get(optionIndex));
			}
			println("0) Quit");

			//--- Figure out which one they want
			print("Choice: ");
			int selectedActionIndex = readInt();
			if (0 == selectedActionIndex)
			{
				println("Fine, be that way");
				shouldQuit = true;
			}
			else
			{
				//--- Subtract one because we added one earlier
				String action = actions.get(selectedActionIndex-1);
				println("OK, you " + action);
			}
			println();
		}

		println("   The End");
	}

	private List<String> getActions()
	{
		List<String> actions = new LinkedList<String>();

		actions.add("Give gift");
		actions.add("Throw rocks");
		actions.add("Serenade");

		return actions;
	}
}
