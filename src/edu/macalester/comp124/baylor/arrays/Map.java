package edu.macalester.comp124.baylor.arrays;

/**
 * Created by baylor on 3/5/14.
 */
public class Map
{
	char playerChar = '@';
	char groundChar = '.';

	int width, height;
	int playerX, playerY;
	int objectX, objectY;
	char[][] map;

	public Map(int width, int height)
	{
		this.width  = width;
		this.height = height;
		map = new char[width][height];
		fill(groundChar);
	}

	private void fill(char c)
	{
		for (int x = 0; x < width; x++)
		{
			for (int y = 0; y < height; y++)
			{
				map[x][y] = c;
			}
		}
	}

	public void movePlayer(char direction)
	{
		switch(direction)
		{
			case 'N':
			case 'n':
				map[playerX][playerY] = groundChar;
				setPlayerLocation(playerX, playerY-1);
				break;
			case 'S':
			case 's':
				map[playerX][playerY] = groundChar;
				setPlayerLocation(playerX, playerY+1);
				break;
			case 'e':
				map[playerX][playerY] = groundChar;
				setPlayerLocation(playerX+1, playerY);
				break;
			case 'w':
				map[playerX][playerY] = groundChar;
				setPlayerLocation(playerX-1, playerY);
				break;
		}
	}

	public void setPlayerLocation(int x, int y)
	{
		playerX = x;
		if (playerX < 0)
		{
			playerX = 0;
		}
		if (playerX > width-1)
		{
			playerX = width-1;
		}
		playerY = y;
		if (playerY < 0)
		{
			playerY = 0;
		}
		if (playerY > height-1)
		{
			playerY = height-1;
		}
		map[playerX][playerY] = playerChar;
	}

	@Override
	public String toString()
	{
		String output = "";
		for (int y = 0; y < height; y++)
		{
			for (int x = 0; x < width; x++)
			{
				output += map[x][y];
			}
			output += System.lineSeparator();
		}
		return output;
	}

	public boolean objectFound()
	{
		return ((playerX==objectX) && (playerY==objectY));
	}
}
