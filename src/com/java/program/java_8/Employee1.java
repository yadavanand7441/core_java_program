package com.java.program.java_8;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

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
        Employee1 highestSalary = empList.stream().sorted(Comparator.comparing(Employee1::getSalary).reversed()).skip(0).findFirst().orElse(null);
        System.out.println(highestSalary);

        System.out.println("Find Employee with Second Highest Salary");
        Employee1 secondMaxSalary = empList.stream().sorted(Comparator.comparing(Employee1::getSalary).reversed()).skip(1).findFirst().orElse(null);
        System.out.println(secondMaxSalary);
        System.out.println("Group Employees by Department");
        Map<String, List<Employee1>> employeesByDepartment = empList.stream().collect(Collectors.groupingBy(Employee1::getDepartment));
        employeesByDepartment.forEach((department, empLists) -> System.out.println(department + " : " + empLists));


        System.out.println("Count Employees by Department");
        Map<String, Long> employeeCountByDepartment
                = empList.stream().collect(Collectors.groupingBy(Employee1::getDepartment, Collectors.counting()));
        System.out.println(employeeCountByDepartment);


        System.out.println("Sort Employees by Salary");
        empList.stream().sorted(Comparator.comparing(Employee1::getSalary)).forEach(System.out::println);

        System.out.println("Find Employees salary>?");
        empList.stream().filter(e->e.getSalary()>51000).forEach(System.out::println);

        System.out.println("Count total Employees ");
        long count = empList.stream().map(Employee1::getDepartment).count();
        System.out.println(count);
    }
}
