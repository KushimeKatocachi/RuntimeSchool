package StreamAPI;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class EmployeeMain {
    public static void main(String[] args) {
        List<Employee> employee = new ArrayList<>();
        employee.add(new Employee(25, 40000, "Alya "));
        employee.add(new Employee(30, 50000, "Marya "));
        employee.add(new Employee(55, 100000, "Armen"));
        employee.add(new Employee(40, 80000, "Armen"));
        employee.add(new Employee(45, 90000, "Armen"));

        double averageSalary = employee.stream()
                .filter(e -> e.getAge() >= 30)
                        .filter(e -> e.getAge() >= 30)
                        .mapToDouble(Employee::getSalary)
                        .average()
                        .orElse(0);

        System.out.println("Average salary of employees age 30 or above: " + averageSalary);
    }
}
