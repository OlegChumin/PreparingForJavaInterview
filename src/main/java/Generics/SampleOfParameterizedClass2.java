package Generics;

import java.util.ArrayList;

public class SampleOfParameterizedClass2 {
    public static void main(String[] args) {
        Pair<String, Integer> pair1 = new Pair<>("Hallo", 20);
        System.out.println(pair1.getVarTypeV1() + " " + pair1.getVarTypeV2());

        Pair<Integer, Double> pair2 = new Pair<>(55, 3.14);
        System.out.println(pair2.getVarTypeV1() + " " + pair2.getVarTypeV2());

        SamePair<String> samePair = new SamePair<>("Hallo", "Bye");
        System.out.println(samePair.getVarTypeV1() + " " + samePair.getVarTypeV2());

    }
}

class Pair<V1, V2> {
    private V1 varTypeV1; // raw type Object
    private V2 varTypeV2; // raw type Object

    public Pair(V1 varTypeV1, V2 varTypeV2) {
        this.varTypeV1 = varTypeV1;
        this.varTypeV2 = varTypeV2;
    }

    public V1 getVarTypeV1() {
        return varTypeV1;
    }

    public V2 getVarTypeV2() {
        return varTypeV2;
    }
}

class SamePair<V> {
    private V varTypeV1; // raw type Object
    private V varTypeV2; // raw type Object

    public SamePair(V varTypeV1, V varTypeV2) {
        this.varTypeV1 = varTypeV1;
        this.varTypeV2 = varTypeV2;
    }

    public static <V> V getSecondElementFromCollection(ArrayList<V> al) {
        return al.get(1);
    }

    public V getSecondElementFromCollectionNew(ArrayList<V> al) {
        return al.get(1);
    }

    public V getVarTypeV1() {
        return varTypeV1;
    }

    public V getVarTypeV2() {
        return varTypeV2;
    }
}


