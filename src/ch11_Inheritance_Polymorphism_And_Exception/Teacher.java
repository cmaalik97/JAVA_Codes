package ch11_Inheritance_Polymorphism_And_Exception;

public class Teacher extends Person{
    //add variable
    double salary;

    Teacher(String name, String tel, int age, double salary) {
        super(name, tel, age);
        this.salary = salary;
    }


    void display() {
        super.display();
        System.out.println("Salary: " + salary);
    }
}
