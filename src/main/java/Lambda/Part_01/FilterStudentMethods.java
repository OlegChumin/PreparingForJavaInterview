package Lambda.Part_01;

import java.util.ArrayList;
import java.util.function.Predicate;

public class FilterStudentMethods {
    void printStudentOverGrade(ArrayList<Student> al, double grade) {
        System.out.println("Filter Students by grade > " + grade);
        for (Student element: al) {
            if(element.averageGrade > grade) {
                System.out.println(element);
            }
        }
        printEndLine();
    }

    void printStudentUnderAge(ArrayList<Student> al, int studentAge) {
        System.out.println("Filter Students by age < " + studentAge);
        for (Student element: al) {
            if(element.age < studentAge) {
                System.out.println(element);
            }
        }
        printEndLine();
    }

    void printStudentMixedConditions(ArrayList<Student> al, int studentAge, double grade, char sex) {
        System.out.println("Filter Students by age > " + studentAge + " AND averageGrade < " + grade + " AND maleFemale == " + sex);
        for (Student element: al) {
            if(element.age > studentAge && element.averageGrade < grade && element.maleFemale == sex) {
                System.out.println(element);
            }
        }
        printEndLine();
    }

    private void printEndLine() {
        System.out.println("---------------------------------------------------------------------");
        System.out.println();
    }

    void testStudents(ArrayList<Student> al, StudentCheck studentCheck) {
        System.out.println("Print filtered Student using check() from interface StudentCheck");
        for (Student element: al) {
            if(studentCheck.check(element)) {
                System.out.println(element);
            }
        }
        printEndLine();
    }

    void testStudentsUsingPredicate(ArrayList<Student> al, Predicate<Student> predicate) {
        System.out.println("Students, filtered using test() from Predicate <T> T");
        for (Student element: al) {
            if(predicate.test(element)) {
                System.out.println(element);
            }
        }
        printEndLine();
    }

    void printArrayList(ArrayList<Student> al) {
        for (Student element: al) {
            System.out.println(element);
        }
        printEndLine();
    }
}
