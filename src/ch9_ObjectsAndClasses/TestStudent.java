package ch9_ObjectsAndClasses;

public class TestStudent {
    public static void main(String[] args) {
        Student std1=new Student();
        std1.name="warfaa";
        std1.id=101;
        std1.add="Hodan";
        System.out.println("Student 1 Details:");
        System.out.println("name: "+std1.name);
        System.out.println(" id: "+std1.id);
        System.out.println("address: "+std1.add);

        System.out.println(" ");
        Student std2=new Student(1002,"Geedi","hodan");
        System.out.println("Student 2 Details");
        System.out.println("name: "+std2.name);
        System.out.println(" id: "+std2.id);
        System.out.println("address: "+std2.add);
    }
}
