package Generics;

import java.util.ArrayList;

public class SampleOfTypeErasure {
    public static void main(String[] args) {
        // type erasure  - для обратной совместимости
        ArrayList<Integer> al = new ArrayList<Integer>(); // для JVM - Compiler ставит Object
        int i = al.get(0);
//        ArrayList al = new ArrayList(); // raw type
//        int i = (Integer) al.get(0);
    }

    public void abc(SuperInfo<Integer> superInfo) { // совпадение сигнатур запрещено
        Integer i = superInfo.getSuperVar();
    }

    public void abc(SuperInfo<String> superInfo, int x) {
        String str = superInfo.getSuperVar();
    }


}

class Parent{

}

class Child extends Parent {

}

class SuperInfo <T> {
    private T superVar;

    public SuperInfo(T superVar) {
        this.superVar = superVar;
    }

    public T getSuperVar() {
        return superVar;
    }

    @Override
    public String toString() {
        return "SuperInfo{" +
                "superVar=" + superVar +
                '}';
    }
}
