package Generics;

import java.util.ArrayList;
import java.util.List;

public class SampleOfSubtypingGenerics {
    public static void main(String[] args) {
        X x = new Y(); // полиморфизм
        x.canDo();

        Number newNumber = new Integer(10); //Number(super) <- (child class) Integer, Double
        Number secondNumber = new Double(3.14);
        Double number = Double.valueOf(new Integer(100));
        Double number2 = Double.valueOf(new Float(100F));

        List<X> list1 = new ArrayList<>(); // ставит по умолчанию X
//        List<Number> list = new ArrayList<Integer>(); // ставит Number
//        ArrayList<Double> dAl = new ArrayList<Double>();
//        dAl.add(100);
//        list.add(18);
//        list.add(3.14);
        Double m = (double) new Integer(10);


//        ArrayList<Integer> list2= new ArrayList<Integer>();
//        list2.add(18);
//        list2.add(3.14);

        LimitedInfo<Bus> limitedInfo = new LimitedInfo<>(new Bus());
        System.out.println(limitedInfo);
        Bus bus = limitedInfo.getVariable();

//        LimitedInfo<Double> limitedInfoDouble = new LimitedInfo<>(3.14);
//        System.out.println(limitedInfoDouble.getVariable());
//
//        LimitedInfo<Integer> limitedInfoInteger = new LimitedInfo<>(10);
//        System.out.println(limitedInfoInteger.getVariable());
    }
}

class X {
    void canDo(){}
}
class Y extends X {
    void canFly() {}
}

interface I1 {}
interface I2 {}

class LimitedInfo<T extends Number &I1 & I2 > {
    private T variable;

    public LimitedInfo(T variable) {
        this.variable = variable;
    }

    public T getVariable() {
        return variable;
    }

    @Override
    public String toString() {
        return "LimitedInfo{" +
                "variable=" + variable +
                '}';
    }
}

class Bus extends Number implements I1,I2 {
    @Override
    public int intValue() {
        return 0;
    }

    @Override
    public long longValue() {
        return 0;
    }

    @Override
    public float floatValue() {
        return 0;
    }

    @Override
    public double doubleValue() {
        return 0;
    }
}
