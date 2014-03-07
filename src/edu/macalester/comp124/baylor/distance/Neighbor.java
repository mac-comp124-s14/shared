package edu.macalester.comp124.baylor.distance;

import java.util.HashMap;
import java.util.Map;

/**
 *
 * @author baylor
 */
public class Neighbor
{
	public String name;
	public String description;
	public Map<String, Integer> attributes = new HashMap<>();

	public float getDistance(Map<String, Integer> theirAttributes)
	{
		int sumOfSquares = 0;

		for (String key : attributes.keySet())
		{
			int myValue    = attributes.get(key);
			int theirValue = theirAttributes.get(key);
			int difference = myValue - theirValue;
			int square = difference * difference;
			sumOfSquares += square;
		}

		float distance = (float)Math.sqrt(sumOfSquares);
		return distance;
	}
}
