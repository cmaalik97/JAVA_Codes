package ch11_Inheritance_Polymorphism_And_Exception;

public class Person {
    private  String name,tel;
    private  int age;
    //constructor
    Person(){
        //defaults
        this.name="Ali abdi";
        this.tel="0245";
        this.age=20;
        System.out.println("Person constructor (no args)");
    }
    Person(String name , String tel, int age){
        this.name=name;
        this.tel=tel;
        this.age=age;
    }

    void display(){
        System.out.println("Name: "+ name);
        System.out.println("Tel: "+tel);
        System.out.println("Age: "+age);
    }

}
