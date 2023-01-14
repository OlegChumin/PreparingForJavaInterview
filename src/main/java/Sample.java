public class Sample {
    public static void main(String[] args) {
        Worker worker_1 =  new Worker("Ilya", 24, 3000);
        System.out.println(worker_1.getName());
        System.out.println(worker_1.getAge());
        System.out.println(worker_1.getSalary());

        worker_1.setName("Leo");
        System.out.println(worker_1.getName());
        System.out.println(worker_1);
    }
}
class Employee extends Worker {

    public Employee(String name, int age, double salary) {
        super(name, age, salary);
    }

    @Override
    public double printName(Worker worker) {
        return 10.;
    }
}

class Worker {
    private String name;
    private int age;
    private double salary;

    public Worker(String name, int age, double salary) {
        this.name = name;
        this.age = age;
        this.salary = salary;
    }

    public double printName(Worker worker) {
        return worker.getSalary();
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public double getSalary() {
        return salary;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }

    @Override
    public String toString() {
        return "Worker{" +
                "name='" + name + '\'' +
                ", age=" + age +
                ", salary=" + salary +
                '}';
    }

    {
        Object object = new Object();
        object.toString();
    }

}



