package ch3_CollectionAndStack;

public class StackArray {
    //data fields
    int[] stack;
    int top;
    int size;
    //Constructor with size parameter
    StackArray(int size){
        this.size=size;
        stack=new int[size];
        top=-1;
    }
    //push method
    public void push(int value){
        if(top==size-1)
            System.out.println("Stack Overflow");
        else
            stack[++top]=value;
    }
    //pop method
    public int pop() {
        if (top == -1) {
            System.out.println("Stack is empty");
            return -1;
        } else
            return stack[top--];
    }
    //peek method
    public int peek(){
        if(top==-1){
            System.out.println("Stack is empty");
            return -1;
        }
        else
            return stack[top];
    }
    //Display all elements
    public void display(){
        if(top==-1)
            System.out.println("Stack is empty");
        else {
            System.out.println("Stack Elements");
            for(int i=0;i<=top;i++)
                System.out.println(stack[i] + " ");
            System.out.println();
        }
    }
    //Main Method
    static void main(String[] args) {
        StackArray s=new StackArray(5);
        s.push(10);
        s.push(20);
        s.push(30);
        s.push(40);
        s.push(50);
        s.push(60);
        System.out.println("Top element is "+s.peek());
        System.out.println("popped element is "+ s.pop());
        s.display();
    }

}