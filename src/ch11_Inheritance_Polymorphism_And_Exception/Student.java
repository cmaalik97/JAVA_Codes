package ch11_Inheritance_Polymorphism_And_Exception;

public class Student extends Person {
    //add a variable
    String stdID;

    //constructor
    Student(){}
    Student(String name, String tel , int age,String stdID){
        super(name, tel ,age);//call superclass constructor
        this.stdID=stdID;
        System.out.println("Student constructor (with arg)");
    }
    //method
    void display(){
        super.display();
        System.out.println("Student ID: "+ stdID);
    }

}
