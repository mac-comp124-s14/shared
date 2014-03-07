package edu.macalester.comp124.baylor.distance;

import java.util.List;
import java.util.Map;

/**
 *
 * @author baylor
 */
public class SimilarityCalculator
{
	public Neighbor getBestMatch(
			Map<String, Integer> target,
			List<Neighbor> options)
	{
		Neighbor closestNeighbor = null;
		float smallestDistance = Float.MAX_VALUE;

		for (int i = 0; i < options.size(); i++)
		{
			Neighbor neighbor = options.get(i);
			float distance = neighbor.getDistance(target);
			if (distance < smallestDistance)
			{
				closestNeighbor = neighbor;
				smallestDistance = distance;
			}
		}

		return closestNeighbor;
	}
}
