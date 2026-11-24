class Employee {
    double baseSalary;

    double calculateSalary() {
        return baseSalary;
    }
}

class SalesEmployee extends Employee {
    double bonus;

    @Override
    double calculateSalary() {
        return super.calculateSalary() + bonus;
    }
}

public class Main2 {
    public static void main(String[] args) {

        SalesEmployee obj = new SalesEmployee();

        obj.baseSalary = 25000;
        obj.bonus = 5000;

        System.out.println("Base Salary: " + obj.baseSalary);
        System.out.println("Bonus: " + obj.bonus);
        System.out.println("Total Salary: " + obj.calculateSalary());
    }
}