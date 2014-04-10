package edu.macalester.comp124.queues;

/**
 * @author Shilad Sen
 */
public class BoundedQueue {

    private String queue[];
    private int currentSize;
    private int front;

    public BoundedQueue(int capacity) {
        queue = new String[capacity];
        currentSize = 0;
        front = 0;
    }

    public boolean enqueue(String elem) {
        if (currentSize == queue.length) {
            return false;
        }
        int dest = (front + currentSize) % queue.length;
        queue[dest] = elem;
        currentSize++;
        return true;
    }

    public String dequeue() {
        if (currentSize == 0) {
            return null;
        }
        String result = queue[front % queue.length];
        queue[front % queue.length] = null;
        currentSize--;
        front++;

        return result;
    }

    public static void main(String args[]) {

        BoundedQueue queue = new BoundedQueue(3);
        while (true) {
            queue.enqueue("foo");
            queue.dequeue();
            if (queue.front % 10000000 == 0) {
                System.out.println("front is " + queue.front);
            }
        }
    }
}























