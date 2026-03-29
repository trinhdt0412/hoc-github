package bai3.code;

public class OfficeWorker extends Employee {
    public OfficeWorker(String id, String name, double baseSalary) {
        super(id, name, baseSalary);
    }

    @Override
    public double calculatePay() {
        return this.baseSalary;
    }

    @Override
    public void work() {
        System.out.println("Lap dat thiet bi");
    }
}
