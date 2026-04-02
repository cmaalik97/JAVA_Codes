package ch3_CollectionAndStack;
import java.util.Scanner;
import java.util.Stack;
public class ReverseBetter {
    public String reverse (String input )
    {
        Stack<Character> stack=new Stack<>();
        for(char i:input.toCharArray()) {
            stack.push(i);
        }
        StringBuffer reverse=new StringBuffer();
        while(!stack.isEmpty())
            reverse.append(stack.pop());
        return reverse.toString();
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter word to be reversed");
        String input=sc.nextLine();
        //String input="ABCD";
       // ReversereBett test=new Reverser();
        //String result=test.reverse(input);
        //System.out.println("The Reversed String is:"+result);
    }
}