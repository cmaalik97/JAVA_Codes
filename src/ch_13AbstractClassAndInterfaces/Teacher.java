package ch_13AbstractClassAndInterfaces;

public class Teacher extends Person {
    private int Salary;

    public Teacher(String name, int age, int Salary){
        super(name,age);
        this.Salary=Salary;
    }

    @Override
    void display() {
        System.out.println("Teacher Information");
        System.out.println("Name: "+ getName());
        System.out.println("Age: "+ getAge());
        System.out.println("Salary: "+ Salary);
    }
}
