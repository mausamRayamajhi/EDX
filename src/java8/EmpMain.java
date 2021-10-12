package java8;

import java.util.List;
import java.util.stream.Collectors;

public class EmpMain {
    public static void main(String[] args) {
        List<String> names = EmpDatabase.getEmployee()
                .stream()
                .filter(employee -> employee.salary > 1500)
                .map(employee -> employee.getName())
                .distinct()
                .sorted()
                .collect(Collectors.toList());

        System.out.println(names);
    }
}
