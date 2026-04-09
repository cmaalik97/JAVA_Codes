package ch_13AbstractClassAndInterfaces;

public class Student extends Person{
    private  int grade;

    public Student(String name,int age , int grade){
        super(name, age);
        this.grade=grade;
    }

    @Override
    void display() {
        System.out.println("Student Information");
        System.out.println("Name: "+ getName());
        System.out.println("Age: "+ getAge());
        System.out.println("Grade: "+ grade);
    }
}
