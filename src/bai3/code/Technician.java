package bai3.code;

public class Technician extends Employee {
    int overtimeHours;

    public Technician(String id, String name, double baseSalary, int overtimeHours) {
        super(id, name, baseSalary);
        this.overtimeHours = overtimeHours;
    }

    @Override
    public double calculatePay() {
        return this.baseSalary + this.overtimeHours*20000;
    }

    @Override
    public void work() {
        System.out.println("Lap dat thiet bi");
    }
}
