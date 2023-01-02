package Lambda.Part_01;

public class CheckUnderAge implements StudentCheck{
    @Override
    public boolean check(Student student) {
        return student.age < 25;
    }
}
