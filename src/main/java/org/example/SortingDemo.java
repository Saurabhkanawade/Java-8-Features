package org.example;

import lombok.extern.java.Log;

import java.util.*;

@Log
public class SortingDemo {
    public static void main(String[] args) {
        List<Employee> employees = new EmployeeDAO().getEmployee();
        employees.stream().sorted(Comparator.comparing(Employee::getName)).forEach(t -> log.info("" + t));
        employees.stream().sorted(Comparator.comparing(Employee::getSalary)).forEach(t -> log.info("" + t));
        employees.stream().sorted(Comparator.comparing(Employee::getSalary).reversed()).forEach(t -> log.info("" + t));
        employees.stream().sorted(Comparator.comparing(Employee::getName).reversed()).forEach(t -> log.info("" + t));
        List<Integer> list = new ArrayList<>();
        List<Integer> list1 = Arrays.asList(1, 2, 3, 4, 6);
        list.add(10);
        list.add(20);
        list.add(30);
        list.add(40);
        //  list.stream().sorted(Comparator.reverseOrder()).forEach(t -> log.info("" + t));
        Collections.sort(list);
        Collections.reverse(list);
        log.info("" + list);
        Map<Integer, String> map = new HashMap<>();
        map.put(1, "s");
        map.put(2, "k");
        map.put(3, "r");
        map.put(4, "p");
        map.put(5, "s");
        map.put(6, "r");
        map.put(7, "u");
        map.entrySet().stream().sorted(Map.Entry.comparingByKey()).forEach(t -> log.info("" + t));
        Map<Employee, Integer> employeeMap = new HashMap<>();
        employeeMap.put(new Employee(1, "suchit", 18000L), 60);
        employeeMap.put(new Employee(2, "kunal", 20000L), 50);
        employeeMap.put(new Employee(3, "uttam", 180000L), 70);
        employeeMap.put(new Employee(4, "rushikesh", 180000L), 60);
        employeeMap.entrySet().stream().sorted(Map.Entry.comparingByKey(Comparator.comparing(Employee::getSalary))).forEach(t -> log.info("map1" + t));
        employeeMap.entrySet().stream().sorted(Map.Entry.comparingByKey(Comparator.comparing(Employee::getSalary).reversed())).forEach(t -> log.info("map2" + t));
        employees.stream().map(Employee::getName).forEach(t-> log.info("using map "+t));

    }
}

