package Assignements___;

public class PartTimeEmployee extends Employee implements Taxable{


    public PartTimeEmployee(int employeeId, double salary) {
        super(employeeId, salary);
    }

    @Override
    double calculateSalary() {
        return salary -calculateTax();
    }

    @Override
    public double calculateTax() {
        return salary * 0.10;
    }
}
