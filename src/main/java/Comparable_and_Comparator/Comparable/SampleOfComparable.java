package Comparable_and_Comparator.Comparable;

import java.util.*;

public class SampleOfComparable {
    public static void main(String[] args) {
        List<Employee> employeeList = new ArrayList<>();
        employeeList.add(new Employee(100, "Vlad", "Kiev", 3000));
        employeeList.add(new Employee(75, "Leo", "Izmir", 4500));
        employeeList.add(new Employee(200, "Sandeep", "Pao", 2700));
        employeeList.add(new Employee(50, "Maria", "Munich", 2000));
        employeeList.add(new Employee(154, "Sunil", "Mumbay", 1000));
        employeeList.add(new Employee(154, "Sunil", "Mumbay1", 2000));
        employeeList.add(new Employee(154, "Sunil", "Mumbay2", 5000));

        System.out.println("Before sorting...");
        System.out.println(employeeList);
        System.out.println();
        Comparator salaryComparator = new SalaryComparator();
        Collections.sort(employeeList, new NameComparator().thenComparing(new SurNameComparator().thenComparing(Employee::compareTo)));
        System.out.println("After sorting...");
        System.out.println(employeeList);

//        Arrays.sort(new Employee[]{new Employee(100, "Vlad", "Kiev", 3000),
//                new Employee(75, "Leo", "Izmir", 4500),
//                new Employee(200, "Sandeep", "Pao", 2700),
//                new Employee(50, "Maria", "Munich", 2000),
//                new Employee(154, "Sunil", "Mumbay", 1000)});
    }
}

class Employee implements Comparable<Employee> {
    int id;
    String name;
    String surName;
    int salary;

    public Employee(int id, String name, String surName, int salary) {
        this.id = id;
        this.name = name;
        this.surName = surName;
        this.salary = salary;
    }

    @Override
    public String toString() {
        return "Employee{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", surName='" + surName + '\'' +
                ", salary=" + salary +
                '}' + "\n";
    }

    @Override
    public int compareTo(Employee anotherEmployee) {
//        if (this.id == anotherEmployee.id) {
//            return 0;
//        } else if (this.id < anotherEmployee.id) {
//            return -1;
//        } else return 1;
        return this.id - anotherEmployee.id;
    }


//    @Override
//    public int compareTo(Employee anotherEmployee) {
//        return this.name.compareTo(anotherEmployee.name);
//    }
}

class SalaryComparator implements Comparator<Employee> {

    @Override
    public int compare(Employee o1, Employee o2) {
//        return o1.salary.compareTo(o2.salary);  //change int salary to Integer salary!
        return Integer.valueOf(o1.salary).compareTo(Integer.valueOf(o2.salary));
    }
}

class NameComparator implements Comparator<Employee> {

    @Override
    public int compare(Employee o1, Employee o2) {
//        return o1.salary.compareTo(o2.salary);  //change int salary to Integer salary!
        return o1.name.compareTo(o2.name);
    }
}

class SurNameComparator implements Comparator<Employee> {

    @Override
    public int compare(Employee o1, Employee o2) {
//        return o1.salary.compareTo(o2.salary);  //change int salary to Integer salary!
        return o1.surName.compareTo(o2.surName);
    }
}