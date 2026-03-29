package bai3.code;

public abstract class Employee implements IWorkable {
    String id;
    String name;
    double baseSalary;

    public Employee(String id, String name, double baseSalary) {
        this.id = id;
        this.name = name;
        this.baseSalary = baseSalary;
    }

    public void work() {
        System.out.println("Lam viec...");
    }
    public abstract double calculatePay();

    public String toString() {
        return this.name + " - Pay: " + this.calculatePay();
    }
}
