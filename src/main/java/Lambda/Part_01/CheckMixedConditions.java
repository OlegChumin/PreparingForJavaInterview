package Lambda.Part_01;

public class CheckMixedConditions implements  StudentCheck{
    @Override
    public boolean check(Student student) {
        return student.age > 20 && student.averageGrade < 9.5 && student.maleFemale == 'f';
    }
}
