package ch3_CollectionAndStack;
import java.util.Stack;
public class StackEx3 {
    public static void main(String[] args) {
//        Stack<Integer> s1=new Stack<>();
//        s1.push(10);
//        s1.push(20);
//        s1.push(30);
//        int top=s1.peek();
//        System.out.println("The top element is "+top);
//        int out=s1.pop();
//        System.out.println("The removed element is "+out);
//        s1.push(40);
//        System.out.println(s1);
//        System.out.println(s1.size());
//        s1.pop();
//        s1.pop();
//        s1.pop();
//        System.out.println(s1.isEmpty());

//        System.out.println(" ");
//        System.out.println(" ");
        //Another output
        //My test
        System.out.println("The output 2");
        Stack<Integer> test=new Stack<>();
        test.push(10);
        test.push(20);
        test.push(30);
        test.push(40);
        test.push(50);
        test.push(60);
        int top2=test.peek();
        System.out.println("The top element is "+top2);
        test.pop();
        int out2=test.pop();

        System.out.println("The removed element is "+out2);
        test.push(50);
        System.out.println(test);
        System.out.println(test.size());
        test.pop();
        test.pop();
        test.pop();
        test.pop();
        System.out.println(test.isEmpty());


    }
}
