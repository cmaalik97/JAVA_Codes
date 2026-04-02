package ch5_Queues;
import java.util.ArrayDeque;
import java.util.Queue;

public class QueueEx1 {
    public static void main(String[] args) {
        // Create a Queue
        Queue<String> queue = new ArrayDeque<>();

        // Adding elements using add() and offer()
        System.out.println("Adding elements to the queue...");
        queue.add("Add Task 1 Using add() method");  // Throws exception if it fails
        queue.offer("Add Task 2 Using (offer) method");  // Returns false if it fails

        // Display the queue
        System.out.println("Queue after additions: " + queue);

        // Removing elements using remove() and poll()
        System.out.println("\nRemoving elements from the queue...");
        System.out.println("Removed with remove(): " + queue.remove());  // Throws exception if empty
        System.out.println("Removed with poll(): " + queue.poll());  // Returns null if empty

        // Attempt to remove from an empty queue
        System.out.println("\nAttempting to remove from an empty queue...");
        try {
            System.out.println("Removed with remove(): " + queue.remove());
            } catch (Exception e) {
            System.out.println("Exception caught: " + e);
            }

        System.out.println("Removed with poll(): " + queue.poll());  // Returns null if empty
    }


}
