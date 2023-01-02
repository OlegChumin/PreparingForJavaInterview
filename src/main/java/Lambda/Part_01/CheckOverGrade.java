package Lambda.Part_01;

public class CheckOverGrade implements StudentCheck{
    @Override
    public boolean check(Student student) {
        return student.averageGrade > 8;
    }
}
