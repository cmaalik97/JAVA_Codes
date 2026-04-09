package ch_13AbstractClassAndInterfaces;

public class Main {
    public static void main(String[] args) {
        Student student=new Student("Abdimalik" , 22 ,100);
        student.SetName("Aisha");
        System.out.println("---------------");
        student.display();

        Person teacher=new Teacher("Jamac",34 ,400);
        teacher.SetName("Fatima");
        teacher.display();
    }
}

