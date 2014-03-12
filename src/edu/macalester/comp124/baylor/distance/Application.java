package edu.macalester.comp124.baylor.distance;

import java.util.HashMap;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import java.util.Scanner;

public class Application
{
	public static void main(String[] args)
	{
		Application app = new Application();
		app.runHarryPotterDemo();
	}

	private void runBasicDistanceDemo()
	{
		int x1=0, y1=0, x2=10, y2=10, z1=200, z2=210;
		double distance;

		//--- Get x and y
		int differenceInX = Math.abs(x1-x2);
		int differenceInY = Math.abs(y1-y2);
		int zSquared = (int)Math.pow(z1-z2, 2);
		//--- x^2 + y^2
		int xSquared = differenceInX * differenceInX;
		int ySquared = (int)Math.pow(differenceInY, 2);
		int sumOfSquares = xSquared + ySquared + zSquared;
		//--- c = sqrt(x^2 + y^2)
		distance = Math.sqrt(sumOfSquares);

		System.out.println("distance = " + distance);
	}

	public void runHarryPotterDemo()
	{
		Map<String, Integer> you = getUserInfo();

		Neighbor yourCollege = askSortingHat(you);
		System.out.println("[Sorting hat] Hmm, let's see, where do you belong?");
		System.out.println(yourCollege.name);
		System.out.println(yourCollege.description);
	}

	private Map<String, Integer> getUserInfo()
	{
		Map<String, Integer> answers = new HashMap<String, Integer>();

		System.out.println("On a scale of 1-100, where do you rate for:");

		Scanner keyboard = new Scanner(System.in);
		int answer;

		System.out.print("Evil? ");
		answer = keyboard.nextInt();
		answers.put("evil", answer);
		System.out.print("Wealth? ");
		answer = keyboard.nextInt();
		answers.put("money", answer);
		System.out.print("Blood purity? ");
		answer = keyboard.nextInt();
		answers.put("pureBlood", answer);
		System.out.print("Power? ");
		answer = keyboard.nextInt();
		answers.put("power", answer);
		System.out.print("Intelligence? ");
		answer = keyboard.nextInt();
		answers.put("intelligence", answer);
		System.out.print("Bravery? ");
		answer = keyboard.nextInt();
		answers.put("bravery", answer);

		return answers;
	}

	private Neighbor askSortingHat(Map<String, Integer> target)
	{
		List<Neighbor> colleges = getHogwartsColleges();
		SimilarityCalculator calc = new SimilarityCalculator();
		Neighbor bestmatch = calc.getBestMatch(target, colleges);
		return bestmatch;
	}

	private List<Neighbor> getHogwartsColleges()
	{
		List<Neighbor> options = new LinkedList<Neighbor>();
		Neighbor option;

		option = new Neighbor();
		option.name = "Slytherin";
		options.add(option);
		option.attributes.put("evil",        100);
		option.attributes.put("money",       100);
		option.attributes.put("pureBlood",   100);
		option.attributes.put("power",        75);
		option.attributes.put("intelligence", 50);
		option.attributes.put("bravery",      50);
		option.description = "You are a racist jerk, but a rich racist jerk.";

		option = new Neighbor();
		option.name = "Gryffindor";
		options.add(option);
		option.attributes.put("evil",         60);
		option.attributes.put("money",        50);
		option.attributes.put("pureBlood",    30);
		option.attributes.put("power",        75);
		option.attributes.put("intelligence", 40);
		option.attributes.put("bravery",      90);
		option.description = "Brave and a little messed up, you are the mutt of Hogwarts.";

		option = new Neighbor();
		option.name = "Ravenclaw";
		options.add(option);
		option.attributes.put("evil",         50);
		option.attributes.put("money",        50);
		option.attributes.put("pureBlood",    70);
		option.attributes.put("power",        85);
		option.attributes.put("intelligence", 90);
		option.attributes.put("bravery",      40);
		option.description = "Intelligent and prone to massive libraries, you are what people think of when they think wizard.";
		option = new Neighbor();

		option.name = "Hufflepuff";
		options.add(option);
		option.attributes.put("evil",         25);
		option.attributes.put("money",        50);
		option.attributes.put("pureBlood",    60);
		option.attributes.put("power",        70);
		option.attributes.put("intelligence", 50);
		option.attributes.put("bravery",      45);
		option.description = "The embarassment of adult fans, if book 1 " +
				"hadn't been for little kids, you would never have been " +
				"in the book. You probably like My Little Pony.";

		return options;
	}
}
