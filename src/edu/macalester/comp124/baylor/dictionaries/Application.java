package edu.macalester.comp124.baylor.dictionaries;

import acm.program.ConsoleProgram;

import java.util.HashMap;
import java.util.Map;

/**
 * Created by baylor on 3/7/14.
 */
public class Application
	extends ConsoleProgram
{
	public void run()
	{
		Map<String,Integer> grades = new HashMap<>();
		grades.put("Arya", 100);
		grades.put("Brienne", 95);
		grades.put("Catlan", 75);
		grades.put("Daenerys", 120);
		grades.put("Eddard", 25);
		grades.put("Eddard Jr.", 1);
		grades.put("Imp", 100);

		println("Here's who attends Westeros Senior High");
		for (String key : grades.keySet())
		{
			println(key);
		}

		String answer = "";
		while (!answer.equalsIgnoreCase("quit"))
		{
			print("Check whose grade: ");
			answer = readLine();
			if (!grades.containsKey(answer))
			{
				println("You're too late, GRRM got him");
			}
			else
			{
				int grade = grades.get(answer);
				println(answer + "'s grade is " + grade);
			}
		}
		println("Fine, you quitter");
	}
}
