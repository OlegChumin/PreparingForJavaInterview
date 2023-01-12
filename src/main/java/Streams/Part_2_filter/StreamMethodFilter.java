package Streams.Part_2_filter;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class StreamMethodFilter {
    public static void main(String[] args) {
        StudentSample student1 = new StudentSample("Ivan", 'm', 22, 3, 8.3);
        StudentSample student2 = new StudentSample("Nikolay", 'm', 28, 2, 6.4);
        StudentSample student3 = new StudentSample("Elena", 'f', 19, 1, 8.9);
        StudentSample student4 = new StudentSample("Petr", 'm', 35, 4, 7);
        StudentSample student5 = new StudentSample("Maria", 'f', 23, 3, 9.1);
        StudentSample student6 = new StudentSample("Oleg", 'm', 47, 3, 10.0);

        ArrayList<StudentSample> students = new ArrayList<>();
        students.add(student1);
        students.add(student2);
        students.add(student3);
        students.add(student4);
        students.add(student5);
        students.add(student6);

        System.out.println("students " + students);
        List<StudentSample> filteredStudents = students.stream().filter(el -> el.getAge() > 22 && el.getAverageGrade() < 8.0).collect(Collectors.toList());
        System.out.println(filteredStudents);

        Stream<StudentSample>  studentsStream = Stream.of(student1, student2, student3, student4, student6);
        List<StudentSample> sortedListOfStudents = studentsStream.sorted((st1, st2) -> st1.getName().compareTo(st2.getName())).collect(Collectors.toList());
        List<StudentSample> sortedListOfStudentsNew = studentsStream.sorted(Comparator.comparing(StudentSample::getName)).collect(Collectors.toList());
        System.out.println(sortedListOfStudents);

    }
}

class StudentSample {
    private String name;
    private char maleFemale;
    private int age;
    private int course;
    private double averageGrade;

    public StudentSample(String name, char maleFemale, int age, int course, double averageGrade) {
        this.name = name;
        this.maleFemale = maleFemale;
        this.age = age;
        this.course = course;
        this.averageGrade = averageGrade;
    }

    @Override
    public String toString() {
        return "Student{" +
                "name='" + name + '\'' +
                ", maleFemale=" + maleFemale +
                ", age=" + age +
                ", course=" + course +
                ", averageGrade=" + averageGrade +
                '}';
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public char getMaleFemale() {
        return maleFemale;
    }

    public void setMaleFemale(char maleFemale) {
        this.maleFemale = maleFemale;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public int getCourse() {
        return course;
    }

    public void setCourse(int course) {
        this.course = course;
    }

    public double getAverageGrade() {
        return averageGrade;
    }

    public void setAverageGrade(double averageGrade) {
        this.averageGrade = averageGrade;
    }
}
