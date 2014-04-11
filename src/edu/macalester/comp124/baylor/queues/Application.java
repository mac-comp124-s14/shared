package edu.macalester.comp124.baylor.queues;

import acm.program.ConsoleProgram;

/**
 * Created by baylor on 4/9/14.
 */
public class Application
	extends ConsoleProgram
{
	public void run()
	{
//		runLinkedListDemo();
//		runQueueDemo();
		runStackDemo();
	}

	private void runStackDemo()
	{
		MyStack<String> stack = new MyStack<String>();
		stack.push("Alice");
		stack.push("Bob");
		stack.push("Carol");
		stack.push("Danaerys");
		stack.push("Eddard");

		while (!stack.isEmpty())
		{
			String item = stack.pop();
			println(item);
		}
	}

	private void runQueueDemo()
	{
		MyQueue<String> queue = new MyQueue<String>();
		queue.push("Alice");
		queue.push("Bob");
		queue.push("Carol");
		queue.push("Danaerys");
		queue.push("Eddard");

		while (!queue.isEmpty())
		{
			String item = queue.pop();
			println(item);
		}
	}

	private void runLinkedListDemo()
	{
		MyLinkedList<String> list = new MyLinkedList<String>();
		list.add("Alice");
		list.add("Bob");
		list.add("Carol");
		list.add("Danaerys");
		list.add("Eddard");

		for (int i = 0; i < list.getSize(); i++)
		{
			String item = list.get(i);
			println(item);
		}
	}
}
