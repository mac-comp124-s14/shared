package edu.macalester.comp124.baylor.queues;

/**
 * Created by baylor on 4/9/14.
 */
public class ListNode<T>
{
	T data;
	ListNode<T> next;

	public ListNode(T data)
	{
		this.data = data;
	}

	@Override public String toString()
	{
		return data.toString();
	}
}
