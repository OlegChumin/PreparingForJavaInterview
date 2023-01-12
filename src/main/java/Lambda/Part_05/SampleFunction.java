package Lambda.Part_05;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Function;

public class SampleFunction {
    public static void main(String[] args) {
        MAI_Students student1 = new MAI_Students("Ivan", 'm', 22, 3, 8.3);
        MAI_Students student2 = new MAI_Students("Nikolay", 'm', 28, 2, 6.4);
        MAI_Students student3 = new MAI_Students("Elena", 'f', 19, 1, 8.9);
        MAI_Students student4 = new MAI_Students("Petr", 'm', 35, 4, 7);
        MAI_Students student5 = new MAI_Students("Maria", 'f', 23, 3, 9.1);
        MAI_Students student6 = new MAI_Students("Oleg", 'm', 47, 3, 10.0);

        ArrayList<MAI_Students> mai_students = new ArrayList<>();
        mai_students.add(student1);
        mai_students.add(student2);
        mai_students.add(student3);
        mai_students.add(student4);
        mai_students.add(student5);
        mai_students.add(student6);

        double averageAge = averageOfSomething(mai_students, element -> (double) element.age);
        System.out.println(averageAge);

        double averageGrade = averageOfSomething(mai_students, el -> el.averageGrade);
        System.out.println(averageGrade);
    }


    private static double averageOfSomething(List<MAI_Students> list, Function<MAI_Students, Double> function) {
        double sum = 0;
        for (MAI_Students element: list) {
            sum += function.apply(element);
        }
        return sum/ list.size();
    }
}


class MAI_Students {
    String name;
    char maleFemale;
    int age;
    int course;
    double averageGrade;

    public MAI_Students(String name, char maleFemale, int age, int course, double averageGrade) {
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
}
