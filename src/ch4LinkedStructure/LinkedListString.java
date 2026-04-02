package ch4LinkedStructure;
import java.util.*;
public class LinkedListString {

    public static void main(String[] args) {
        // create LinkedList of Strings
        LinkedList<String> names= new LinkedList<>();
        // Add elemant
        names.add("Ali");
        names.add("Abdi");
        names.add("Hussein");
        System.out.println("Initial list: "+ names);
        //Add at the begeninig and end
        names.addFirst("Mohamud");
        names.addLast("Geedi");
        System.out.println("After addFirst and addlist: "+ names);
        // Access elemant'
        System.out.println("First elemant: "+ names.getFirst());
        System.out.println("Lirst elemant: "+ names.getLast());
        System.out.println("by index: "+names.get(2));
        // Remove elemant
        names.removeFirst();//Mohamud
        names.removeLast();//Geedi
        //names.remove(1);
        names.remove("Abdi");
        System.out.println("After removing first and last " + names);
    }
}
