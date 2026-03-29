package bai3.code;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter the number of employees");
        int n = Integer.parseInt(scanner.nextLine());

        Employee[] employees = new Employee[n];

        for (int i = 0; i < n; i++) {
            System.out.println("Enter your employee:");
            String line = scanner.nextLine();

            String[] parts = line.split("\\s+");
            String type = parts[0];
            String id = parts[1];
            String name = parts[2];
            double baseSalary = Double.parseDouble(parts[3]);

            if (type.equals("O")) {
                employees[i] = new OfficeWorker(id, name, baseSalary);
            }

            if (type.equals("T")) {
                int overtimeHours = Integer.parseInt(parts[4]);
                employees[i] = new Technician(id, name, baseSalary, overtimeHours);
            }
        }

        System.out.println("");
        System.out.println("=== EMPLOYEES ===");
        for (Employee employee : employees) {
            System.out.println(employee);
            employee.work();
            System.out.println("");
        }


    }
}
