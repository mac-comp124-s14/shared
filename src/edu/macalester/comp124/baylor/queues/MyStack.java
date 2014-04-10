package edu.macalester.comp124.baylor.queues;

/**
 * Created by baylor on 4/9/14.
 */
public class MyStack<T>
	extends MyLinkedList<T>
{
	public void push(T item)
	{
		ListNode<T> newNode = new ListNode<>(item);
		if (null == head)
		{
			head = newNode;
			tail = newNode;
		}
		else
		{
			newNode.next = head;
			head = newNode;
		}
	}

	public T pop()
	{
		if (null==head)
		{
			return null;
		}

		T item = head.data;

		//--- Kill first guy, make next guy king
		head = head.next;

		return item;
	}
}
