package NestedClasses;

public class SampleInnerClass {
    public static void main(String[] args) {
//        Truck truck = new Truck("orange", "B-Type");
//        System.out.println(truck);
//        Truck.Engine engine = truck.new Engine(300);
//        truck.setEngine(engine);
//        System.out.println(truck);

        Truck truck = new Truck("red", "C", 250);
    }
}

class Truck {
    String color;
    String platformType;
    Engine engine;

    private class Engine{
        int horsePower;

        public Engine(int horsePower) {
            this.horsePower = horsePower;
            System.out.println(platformType);
        }

        @Override
        public String toString() {
            return "Engine{" +
                    "horsePower=" + horsePower +
                    '}';
        }
    }

    public Truck(String color, String platformType, int horsePower) {
        this.color = color;
        this.platformType = platformType;
        this.engine = this.new Engine(horsePower);
    }
    public void setEngine(Engine engine) {
        this.engine = engine;
    }

    @Override
    public String toString() {
        return "Truck{" +
                "color='" + color + '\'' +
                ", platformType='" + platformType + '\'' +
                ", engine=" + engine +
                '}';
    }
}
