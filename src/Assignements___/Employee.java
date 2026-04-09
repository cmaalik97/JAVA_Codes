package Assignements___;

public abstract class Employee {
    protected int employeeId;
    protected double salary;

    public Employee(int employeeId, double salary) {
        this.employeeId = employeeId;
        this.salary = salary;
    }

    abstract double calculateSalary();

}
