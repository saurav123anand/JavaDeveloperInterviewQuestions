package codingQuestions;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.Set;
import java.util.stream.Collectors;

public class Test {
    public static void main(String[] args) {
        // given an employee list,sort employees based on their salaries in desc order
        List<Employee> employees=new ArrayList<>();
        employees.add(new Employee(1,"keshav",45000,"India"));
        employees.add(new Employee(1,"Rahul",55000,"USA"));
        employees.add(new Employee(1,"Raju",33000,"Bhutan"));
//        List<Employee> collect = employees.stream().sorted(Comparator.comparing(e -> e.getSalary(),Comparator.reverseOrder())).collect(Collectors.toList());
//        collect.forEach(employee -> {
//            System.out.println("employee name is "+ employee.getName() +" and salary is "+employee.getSalary());
//        });

        // second way
        List<Employee> collect = employees.stream().sorted((o1,o2)->o2.getSalary()-o1.getSalary()).collect(Collectors.toList());
        collect.forEach(employee -> {
            System.out.println("employee name is "+ employee.getName() +" and salary is "+employee.getSalary());
        });
    }
}
