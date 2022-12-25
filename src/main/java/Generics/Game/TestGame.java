package Generics.Game;

import java.sql.Struct;

public class TestGame {
    public static void main(String[] args) {
        Schoolar schoolar1 = new Schoolar("Ivan", 13);
        Schoolar schoolar2 = new Schoolar("Maria", 15);

        Schoolar schoolar3 = new Schoolar("Petya", 12);
        Schoolar schoolar4 = new Schoolar("Olia", 14);

        Student student1 = new Student("Nikolay", 20);
        Student student2 = new Student("Ksenia", 18);

        Employee employee1 = new Employee("Maxim", 30);
        Employee employee2 = new Employee("Mikhail", 45);

        Team<Schoolar> schoolarTeam = new Team("Dragons");
        schoolarTeam.addNewTeamParticipant(schoolar1);
        schoolarTeam.addNewTeamParticipant(schoolar2);

        Team<Schoolar> schoolarTeam2 = new Team("Apple");
        schoolarTeam2.addNewTeamParticipant(schoolar3);
        schoolarTeam2.addNewTeamParticipant(schoolar4);

        Team<Student> studentTeam = new Team("Vector");
        studentTeam.addNewTeamParticipant(student1);
        studentTeam.addNewTeamParticipant(student2);

        Team<Employee> employeeTeam = new Team("Job");
        employeeTeam.addNewTeamParticipant(employee1);
        employeeTeam.addNewTeamParticipant(employee2);

        schoolarTeam.playWith(schoolarTeam2);

        NewInt samplу = new NewInt() {
            @Override
            public void move() {

            }

            @Override
            public void done() {

            }
        };

        SI newSI = new SI() {
            @Override
            public int hashCode() {
                return super.hashCode();
            }
        };
    }
}

interface NewInt {
    void move();
    void done();
}

interface  SI {}
