package Assignements___;

public class PayrollSystem {
    public static void main(String[] args) {
        FullTimeEmployee ft= new FullTimeEmployee(101,500);
        PartTimeEmployee pt= new PartTimeEmployee(102,300);

        System.out.println("full-Time: "+ft.employeeId + " Net Pay: $"+ ft.calculateSalary());
        System.out.println("Part-Time: "+pt.employeeId + " Net Pay: $"+ pt.calculateSalary());
    }
}
