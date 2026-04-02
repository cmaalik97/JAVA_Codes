package ch11_Inheritance_Polymorphism_And_Exception;

public class paertTimeStudent extends Student {
    String mode;
    paertTimeStudent(){}

    public paertTimeStudent(String name, String tel, int age, String stdID, String mode) {
        super(name, tel, age, stdID);
        this.mode = mode;
    }

    void display(){
        super.display();
        System.out.println("Mode: "+ mode);
    }
}
