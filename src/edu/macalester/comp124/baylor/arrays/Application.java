package edu.macalester.comp124.baylor.arrays;

import acm.program.ConsoleProgram;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class Application
	extends ConsoleProgram
{
	public void run()
	{
//		runListDemo();
//		runArrayDemo();
//		runIntDemo();
//		runGridDemo();
//		runMapDemo();
		playPinTheTailOnTheDonkey();
	}

	private void playPinTheTailOnTheDonkey()
	{
		//--- Create a map
		int width = 40, height=10;
		Map theMap = new Map(width, height);

		//--- Hide something on the map
		Random dice = new Random();
		theMap.objectX = dice.nextInt(width);
		theMap.objectY = dice.nextInt(height);

		//--- Put the player on the map
		theMap.setPlayerLocation(dice.nextInt(width), dice.nextInt(height));

		//--- While the something isn't found
		println(theMap);
		boolean gameOver = false;
		while (!gameOver)
		{
			//--- Ask player where to go
			char direction = readChar("Move? (n,s,e,w) ");

			//--- Move the player
			theMap.movePlayer(direction);

			//--- Draw the map
			println(theMap);

			//--- Tell them how they're doing

			//--- See if they won
			if (theMap.objectFound())
			{
				println("You win!");
				gameOver = true;
			}
		}
	}

	private void runMapDemo()
	{
		int Width = 25, Height = 10;
		char[][] matrix = new char[Width][Height];
		initialize(matrix);

		//--- Add top and bottom border
		for (int x = 0; x < Width; x++)
		{
			matrix[x][0]        = '#';
			matrix[x][Height-1] = '#';
		}
		for (int y = 0; y < Height; y++)
		{
			matrix[0][y]       = '#';
			matrix[Width-1][y] = '#';
		}

		matrix[12][7] = '@';
		matrix[13][7] = 's';

		print(matrix);
	}

	private void initialize(char[][] map)
	{
		for (int x = 0; x < map.length; x++)
		{
			for (int y = 0; y < map[0].length; y++)
			{
				map[x][y] = ' ';
			}
		}
	}

	private void runGridDemo()
	{
		int[][] matrix = new int[5][3];

		for (int y = 0; y < matrix[0].length; y++)
		{
			for (int x = 0; x < matrix.length; x++)
			{
				matrix[x][y] = x+y;
			}
		}
		print(matrix);
	}

	private void print(char[][] grid)
	{
		int width  = grid.length;
		int height = grid[0].length;
		for (int y = 0; y < height; y++)
		{
			for (int x = 0; x < width; x++)
			{
				print(grid[x][y]);
			}
			println();
		}
	}

	private void print(int[][] grid)
	{
		int width  = grid.length;
		int height = grid[0].length;
		for (int y = 0; y < height; y++)
		{
			for (int x = 0; x < width; x++)
			{
				print(grid[x][y] + " ");
			}
			println();
		}
	}


	private void runIntDemo()
	{
		List<Integer> numbers  = new ArrayList<Integer>();
		int[]         numbers2 = new int[10];

		for (int i = 0; i < 5; i++)
		{
			numbers.add( i*10 );
			numbers2[i] = i*10;
		}
		for (int i = 0; i < numbers.size(); i++)
		{
			println(numbers.get(i));
			println(numbers2[i]);
		}
	}

	private void runArrayDemo()
	{
//		List<MythicalAnimal> zoo = new ArrayList<>();
		MythicalAnimal[] zoo = new MythicalAnimal[10];

//		zoo.add( new Puppycorn("Danaerys") );
		zoo[0] = new Unicorn  ("Alice");
		zoo[1] = new Puppycorn("Bob");
		zoo[2] = new Unicorn  ("Carol");
		zoo[3] = new Puppycorn("Danaerys");

//		println("Number of stuffs: " + zoo.size());
		println("Number of stuffs: " + zoo.length);
		println("Stuffs:");
		for (int i = 0; i < zoo.length; i++)
		{
//			MythicalAnimal current = zoo.get(i);
			MythicalAnimal current = zoo[i];
			if (null == current)
			{
				break;
			}
			println("  " + current);
		}
	}

	private void runListDemo()
	{
		List<MythicalAnimal> zoo = new ArrayList<MythicalAnimal>();

		zoo.add( new Unicorn  ("Alice")    );
		zoo.add( new Puppycorn("Bob")      );
		zoo.add( new Unicorn  ("Carol")    );
		zoo.add( new Puppycorn("Danaerys") );

		println("Number of stuffs: " + zoo.size());
		println("Stuffs:");
		for (int i = 0; i < zoo.size(); i++)
		{
			MythicalAnimal current = zoo.get(i);
			println("  " + current);
		}
	}
}
