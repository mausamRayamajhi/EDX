package java8;

import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class EmpDatabase {
     static List<Employee> getEmployee(){
        return Stream.of(new Employee("Mausam",1000,"Health"),
                new Employee("Rajan",1000,"Health"),
                new Employee("Nabin",5000,"Health"),
                new Employee("Rajan",13420,"Health"),
                new Employee("Hari",1600,"Health"),
                new Employee("Laxman",900,"Health"),
                new Employee("Shyam",1100,"Health"),
                new Employee("Radhe",12300,"Health"),
                new Employee("suraj",10600,"Health"),
                new Employee("Hari",100,"Health"),
                new Employee("Sita",190,"Health"),
                new Employee("Gorpal",600,"Health"),
                new Employee("NTR",1345,"Health"),
                new Employee("Mahesh",123,"Health"),
                new Employee("Katu",154600,"Health"),
                new Employee("Bhate",1050,"Health")
                )
                .collect(Collectors.toList());
    }


}
