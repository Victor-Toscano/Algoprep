package ds;

import java.util.*;
import java.util.stream.Collectors;

public class StreamsExample {

    List<Employee> employees;
    List<String> list;

    public StreamsExample() {
        list = new ArrayList<>(Arrays.asList("Victor", "Isai", "Mateo", "Jorge", "Alicia", "Miriam"));

        employees = new ArrayList<>();
        employees.add(new Employee("Victor Toscano", 37, 15438.60, "Engineering"));
        employees.add(new Employee("Isai Robles", 30, 11235.20, "Engineering"));
        employees.add(new Employee("Mateo Aguilar", 27, 9560.60, "Engineering"));
        employees.add(new Employee("Jorge Martinez", 45, 22354.60, "Engineering"));
        employees.add(new Employee("Alicia Jimenez", 35, 8634.80, "HR"));
        employees.add(new Employee("Miriam Sanchez", 33, 9632.00, "HR"));
    }

    public String streamsExample() {
        StringBuilder result = new StringBuilder();

        result.append("\n").append("List count: ");
        result.append(list.stream().count());

        result.append("\n").append("Unsorted: ");
        result.append(list.stream().collect(Collectors.toList()));

        result.append("\n").append("Sorted: ");
        result.append(list.stream().sorted().collect(Collectors.toList()));

        result.append("\n");
        System.out.println(result);
        return result.toString();
    }

    public String streamsExample1() {
        StringBuilder result = new StringBuilder();

        result.append("\n").append("Employee count: ");
        result.append(employees.stream().count());

        result.append("\n").append("Sorted by name: ");
        result.append(employees.stream().sorted().collect(Collectors.toList()));
        //result.append(employees.stream().sorted().map());

        result.append("\n").append("Sorted by age: ");
        result.append(employees.stream().sorted(Comparator.comparing(Employee::getAge)).collect(Collectors.toList()));

        result.append("\n").append("Oldest person: ");
        result.append(employees.stream().sorted(Comparator.comparing(Employee::getAge).reversed()).findFirst());

        result.append("\n").append("Distinct departments: ");
        result.append(employees.stream()
                .map((e) -> e.getDepartment())
                .distinct()
                .collect(Collectors.toList()));

        result.append("\n").append("Average salary by department: ");
        Map<String, Double> averageSalaryByDepartment = employees.stream()
                .collect(
                        Collectors.groupingBy(Employee::getDepartment,
                        Collectors.averagingDouble(Employee::getSalary))
                );
        result.append(averageSalaryByDepartment);

        System.out.println("Oldest person for each department:");
        employees.stream()
        .sorted(Comparator.comparing(Employee::getAge).reversed())
        .collect(Collectors.groupingBy(
                Employee::getDepartment,
                Collectors.maxBy(Comparator.comparing(Employee::getAge))))
        .forEach((department, employee) -> {
            System.out.println(department);
            System.out.println(employee.map(value -> value.getName() + " (" + value.getAge() + ")").orElse(""));
        });

        result.append("\n");
        System.out.println(result);
        return result.toString();
    }
}
