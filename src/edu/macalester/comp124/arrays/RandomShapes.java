package edu.macalester.comp124.arrays;

import acm.graphics.*;
import acm.program.GraphicsProgram;
import acm.util.RandomGenerator;

/**
 * A program to create random shapes and wiggle them around.
 * 
 * TODO (shoot for completing #1 and starting #2):
 * 1. Add instance variable declaration and initialization specified in TODO.
 * 2. Complete the initializeObjects() method.
 * 3. Complete the wiggle() method().
 * 4. Add some random colors to the random shapes.
 * 5. Make the wiggling for every shape head in the same
 * direction more consistently.
 * 
 * @author Shilad
 *
 */
public class RandomShapes extends GraphicsProgram {
	private static final int WIDTH = 500;
	private static final int HEIGHT = 500;
	
	private static final int MAX_WIDTH = 200;
	private static final int MAX_HEIGHT = 200;
	private static final int MAX_X = 400;
	private static final int MAX_Y = 400;
	private static final int MAX_STR_LEN = 15;
	
	private RandomGenerator rgen = RandomGenerator.getInstance();
	
	// TODO: Declare an array of 25 GObjects called "shapes" and
	// allocate space for it using "new."
	
	public void run() {
		initializeObjects();
		
		while (true) {
			wiggleShapes();
			pause(40);
		}
	}
	
	/**
	 * Create and place a random collection of objects
	 */
	private void initializeObjects() {
		// TODO: Step 1. intialize the gObject array with shape objects.

		
		// TODO: Step 2. add() each object in the array to this class,
		// specifying random x and y coordinates.

	}
	
	/**
	 * Wiggle the shapes around.
	 */
	private void wiggleShapes() {
		// TODO: loop over each shape and wiggle it.  Hint: move().
	}
	
	/**
	 * Generates a new random g object.  Note that this object is
	 * NOT associated with an x and y coordinate, so you must call
	 * the version of add() that includes x and y.
	 * 
	 * @return the GObject
	 */
	private GObject createRandomShape() {
		int r = rgen.nextInt(4);
		int w = rgen.nextInt(MAX_WIDTH);
		int h = rgen.nextInt(MAX_HEIGHT);
		if (r == 0) {
			return new GOval(w, h);
		} else if (r == 1) {
			return new GRect(w, h);
		} else if (r == 2) {
			return new GLabel(getRandomString());
		} else {
			return new G3DRect(w, h);
		}
	}
	
	/**
	 * Generates a random sequence of characters.
	 * @return A random sequence of characters of maximum length MAX_STR_LEN.
	 */
	private String getRandomString () {
		int length = rgen.nextInt(MAX_STR_LEN);
		String result = "";
		while (result.length() < length) {
			char c = (char) ('a' + rgen.nextInt(26));
			if (rgen.nextBoolean()) {
				c = Character.toUpperCase(c);
			}
			result += c;
		}
		return result;
	}
	
	/**
	 * Generates a random pair of x, y coordinates
	 * @return Two dimensional array of integers.  The first
	 * integer is the x coordinate, the second integer is the
	 * y coordinate.
	 */
	private int [] getRandomCoordinate() {
		return new int[] { 
							rgen.nextInt(MAX_X),
							rgen.nextInt(MAX_Y)
						};
	}

	/**
	 * Hack: Override the init() method to set the window size.
	 */
	public void init() {
		setSize(WIDTH, HEIGHT);
		super.init();
	}
}
