package edu.macalester.comp124.baylor.queues;

/**
 * Created by baylor on 4/9/14.
 */
public class MyLinkedList<T>
{
	protected ListNode<T> head, tail;

	public void add(T item)
	{
		ListNode<T> newNode = new ListNode<T>(item);
		if (null == head)
		{
			head = newNode;
			tail = newNode;
		}
		else
		{
			tail.next = newNode;
			tail = newNode;
		}
	}

	public void clear()
	{
		head = null;
		tail = null;
	}

	public boolean isEmpty()
	{
		return (null == head);
	}

	public int getSize()
	{
		int count = 0;

		if (null == head)
		{
			return 0;
		}
		ListNode current = head;
		while (null != current)
		{
			count++;
			current = current.next;
		}

		return count;
	}

	public T get(int desiredIndex)
	{
		if (null == head)
		{
			return null;
		}

		int count = 0;
		ListNode<T> current = head;
		while (null != current)
		{
			if (count == desiredIndex)
			{
				return current.data;
			}
			count++;
			current = current.next;
		}

		return null;
	}
}
