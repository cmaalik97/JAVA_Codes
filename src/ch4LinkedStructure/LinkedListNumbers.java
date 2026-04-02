package ch4LinkedStructure;
import java.util.LinkedList;
public class LinkedListNumbers {
    public static void main(String[] args){
        // create LinkedList of integers
        LinkedList<Integer> numbers = new LinkedList<>();
        // Add elemant
        numbers.add(10);
        numbers.add(20);
        numbers.add(30);
        System.out.println("Initial list: "+ numbers);
        //Add at the begeninig and end
        numbers.addFirst(5);
        numbers.addLast(40);
        System.out.println("After addFirst and addlist: "+ numbers);
        // Access elemant'
        System.out.println("First elemant: "+ numbers.getFirst());
        System.out.println("Lirst elemant: "+ numbers.getLast());
        // Remove elemant
        numbers.removeFirst();   // remove 5
        numbers.removeLast();    // remove 40
        System.out.println("After removing first and last " + numbers);

    }
}
