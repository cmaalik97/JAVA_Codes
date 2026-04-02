package ch8_Recursion;

public class PrintHello {
    static void printHello(int n){
        if(n==0)return;
        System.out.println("Hello Recursion");
        printHello(n-1);
    }

    public static void main(String[] args) {
        printHello(3);
    }
}
