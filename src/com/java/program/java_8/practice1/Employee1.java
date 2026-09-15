package com.java.program.java_8.practice1;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Employee1 {
    private int id;
    private String name;
    private double salary;
    private String department;
    private String address;

    public Employee1(int id, String name, double salary, String department, String address) {
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
        return "Employee1{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", salary=" + salary +
                ", department='" + department + '\'' +
                ", address='" + address + '\'' +
                '}';
    }

    public static void main(String[] args) {

        ArrayList<Employee1> empList = new ArrayList<>();
        empList.add(new Employee1(101, "Rajesh Kumar", 45000.50, "IT", "Delhi"));
        empList.add(new Employee1(105, "Priya Sharma", 52000.75, "HR", "Mumbai"));
        empList.add(new Employee1(103, "Amit Verma", 48000.00, "Finance", "Pune"));
        empList.add(new Employee1(106, "Neha Gupta", 51000.25, "Marketing", "Bangalore"));
        empList.add(new Employee1(105, "Suresh Singh", 60000.00, "Operations", "Kolkata"));
        empList.add(new Employee1(102, "Suresh Singh", 60000.00, "Operations", "Kolkata"));
        empList.add(new Employee1(104, "Anjali Mehta", 47000.80, "Sales", "Chennai"));


        System.out.println("Find Employee with Highest Salary");
        Employee1 firstMaxSalary = empList.stream().sorted(Comparator.comparing(Employee1::getSalary).reversed()).skip(0).findFirst().orElse(null);
        System.out.println(firstMaxSalary);

        Employee1 secondMax = empList.stream().sorted(Comparator.comparing(Employee1::getSalary).reversed()).skip(1).findFirst().orElse(null);
        System.out.println(secondMax);

        System.out.println("Group Employees by Department");
        Map<String, List<Employee1>> groupedEmployee = empList.stream().collect(Collectors.groupingBy(Employee1::getDepartment));
        System.out.println(groupedEmployee);

        System.out.println("Count Employees by Department");
        Map<String, Long> countEmployeeByDepartment = empList.stream().collect(Collectors.groupingBy(Employee1::getDepartment, Collectors.counting()));
        System.out.println(countEmployeeByDepartment);

        System.out.println("Sort Employees by Salary");
        empList.stream().sorted(Comparator.comparing(Employee1::getSalary)).forEach(System.out::println);

        System.out.println("Find Employees salary>?");
        empList.stream().filter(e->e.getSalary()>51000).forEach(System.out::println);

        System.out.println("Count total Employees ");
        long empCount = empList.stream().count();
        System.out.println(empCount);

        System.out.println("tempNameSortedBySalary");
        empList.stream().sorted(Comparator.comparing(Employee1::getSalary).thenComparing(Employee1::getName)).forEach(System.out::println);

        System.out.println("=====all name only=======");
        empList.stream().map(Employee1::getName).forEach(System.out::println);

        System.out.println("=====all sorted id only=======");
        empList.stream().map(Employee1::getId).sorted().forEach(System.out::println);

        System.out.println("========employee with longest name record==========");
        Employee1 maxLength = empList.stream().max(Comparator.comparing(e -> e.getName().length())).orElse(null);
        System.out.println(maxLength);

        System.out.println("========sum of all employee salary==========");
        double totalSum = empList.stream().mapToDouble(Employee1::getSalary).sum();
        System.out.println(totalSum);

        System.out.println("========average salary ==========");
        Double averageSalary = empList.stream().collect(Collectors.averagingDouble(Employee1::getSalary));
        System.out.println(averageSalary);

        System.out.println("========count employee salary > 50k==========");
        long countEmployee = empList.stream().filter(e -> e.getSalary() > 50000).count();
        System.out.println(countEmployee);

        System.out.println("========covert salary list to sorted unique list==========");
        empList.stream().sorted(Comparator.comparing(Employee1::getSalary)).distinct().forEach(System.out::println);

    }
}