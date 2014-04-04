package edu.macalester.comp124.baylor.labs.linkedList;

import sun.reflect.generics.reflectiveObjects.NotImplementedException;

/**
 * Created by baylor on 4/3/14.
 */
public class MyLinkedList<E>
{
	private MyLinkedNode<E> head;
	private MyLinkedNode<E> tail;
	private int numElements = 0;

	/**
	 * Returns the element at position index.
	 * @param index
	 * @return
	 */
	public E get(int index)
	{
		throw new NotImplementedException();
	}

	/**
	 * Adds a new element to the end of the list:
	 *
	 * @param elem
	 */
	public void add(E elem)
	{
		throw new NotImplementedException();
	}

	/**
	 * Inserts a new element at the specified index.
	 *
	 * @param elem
	 */
	public void add(int i, E elem) {
		throw new NotImplementedException();
	}

	/**
	 * Returns the current size of the list.
	 * @return
	 */
	public int size() {
		return numElements;
	}

	/**
	 * Clears the contents of the list.
	 */
	public void clear() {
		head = null;
		tail = null;
		numElements = 0;
	}


	/**
	 * These methods are only used by the unit tests.
	 * They are intentionally not public.
	 * @return
	 */
	MyLinkedNode getHead() { return head; }
	MyLinkedNode getTail() { return tail; }

	/**
	 * Print the contents of the list
	 * @return
	 */
	@Override public String toString()
	{
		String output = "";
		MyLinkedNode current = head;
		while (current!=null)
		{
			output += current;
			output += " -> ";
		}
		output = output.substring(0,output.length()-4);
		return output;
	}
}
