package ch_13AbstractClassAndInterfaces;

public abstract class Person {
    private String name;
    private int age;

    Person(String name , int age){
        this.name=name;
        this.age=age;
    }

    //abstract methods
    abstract void  display();



}
