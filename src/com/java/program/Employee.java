package com.java.program;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.Optional;
import java.util.stream.Collectors;

public class Employee {
    private int id;
    private String name;
    private double salary;
    private String department;
    private String address;

    public Employee(int id, String name, double salary, String department, String address) {
        this.id = id;
        this.name = name;
        this.salary = salary;
        this.department = department;
        this.address = address;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getSalary() {
        return salary;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }

    public String getDepartment() {
        return department;
    }

    public void setDepartment(String department) {
        this.department = department;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    @Override
    public String toString() {
        return "Employee{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", salary=" + salary +
                ", department='" + department + '\'' +
                ", address='" + address + '\'' +
                '}';
    }

    public static void main(String[] args) {

        ArrayList<Employee> empList = new ArrayList<>();
        empList.add(new Employee(101, "Rajesh Kumar", 45000.50, "IT", "Delhi"));
        empList.add(new Employee(105, "Priya Sharma", 52000.75, "HR", "Mumbai"));
        empList.add(new Employee(103, "Amit Verma", 48000.00, "Finance", "Pune"));
        empList.add(new Employee(106, "Neha Gupta", 51000.25, "Marketing", "Bangalore"));
        empList.add(new Employee(105, "Suresh Singh", 60000.00, "Operations", "Kolkata"));
        empList.add(new Employee(102, "Suresh Singh", 60000.00, "Operations", "Kolkata"));
        empList.add(new Employee(104, "Anjali Mehta", 47000.80, "Sales", "Chennai"));

        System.out.println("=====Find employee with given id=====");
        empList.stream().filter(e->e.id==104).forEach(System.out::println);
        System.out.println("=====Find employee with given id=====not null safe");
        Employee empNotNullSafe = empList.stream().filter(e -> e.getId() == 103).findFirst().get();
        System.out.println(empNotNullSafe);
        System.out.println("=====Find employee with given id=====with null safe");
        Optional<Employee> empNullSafe = empList.stream().filter(e -> e.getId() == 1023).findFirst();
        System.out.println(empNullSafe);
        System.out.println("======All id's >2=====");
        empList.stream().filter(e->e.getId()>102).map(map->map.getId()).forEach(System.out::println);
        System.out.println("======All id's only=====");
        empList.stream().map(Employee::getId).forEach(System.out::println);
        System.out.println("======All sorted id only=====");
        empList.stream().map(Employee::getId).distinct().forEach(System.out::println);
        System.out.println("======All sorted id only remove duplicates=====");
        empList.stream().map(Employee::getId).sorted().distinct().forEach(System.out::println);
        System.out.println("======all record sorted by id======");
        empList.stream().sorted(Comparator.comparing(Employee::getId)).forEach(System.out::println);
        System.out.println("======highest salary======");
        Employee maxSlary = empList.stream().max(Comparator.comparing(Employee::getSalary)).orElse(null);
        System.out.println(maxSlary);
        Employee secondHighest = empList.stream().sorted(Comparator.comparing(Employee::getSalary).reversed()).skip(1).findFirst().orElse(null);
        System.out.println(secondHighest);
        System.out.println("========sum of all employee salary==========");
        double sum = empList.stream().mapToDouble(Employee::getSalary).sum();
        System.out.println(sum);
        System.out.println("========average of all employee salary==========");
        Double avrgSalary = empList.stream().collect(Collectors.averagingDouble(Employee::getSalary));
        System.out.println(avrgSalary);
        System.out.println("========fetch 3 minimum paid salary employee==========");
        Employee minimum3rdPaid = empList.stream().sorted(Comparator.comparing(Employee::getSalary)).skip(2).findFirst().orElse(null);
        System.out.println(minimum3rdPaid);
    }
}
