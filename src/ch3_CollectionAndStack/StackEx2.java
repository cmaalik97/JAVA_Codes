package ch3_CollectionAndStack;
import java.util.Stack;
public class StackEx2 {
    public static void main(String[] args) {
        //write your code here
        Stack<Integer> s1=new Stack<Integer>();
        s1.push(10);
        s1.push(20);
        s1.push(30);
        System.out.println("Orignal Stack: "+ s1.toString());
        int top=s1.peek();
        System.out.println("top element: "+ top);
        System.out.println("Stack after accessing top element: "+ s1);
        int out=s1.pop();
        System.out.println("Removed element: "+out);
        System.out.println("Stack after pop Operation: "+s1);
        System.out.println(s1.peek());
    }


}
