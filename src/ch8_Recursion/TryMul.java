package ch8_Recursion;

public class TryMul {
    static  int mult(int n){
        if(n==1)return 1;
        return n * mult(n -1);
    }

    public static void main(String[] args) {
        System.out.println("mult: "+mult(5));
    }
}
