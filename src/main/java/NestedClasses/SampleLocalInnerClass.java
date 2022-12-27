package NestedClasses;

public class SampleLocalInnerClass {
    public static void main(String[] args) {
        NewMath newMath =  new NewMath();
        newMath.getResult();
    }
}

class NewMath {

    public void getResult() {
        class Division {
            private int numerator;
            private int denominator;

            public int getNumerator() {
                return numerator;
            }

            public int getDenominator() {
                return denominator;
            }

            public void setNumerator(int numerator) {
                this.numerator = numerator;
            }

            public void setDenominator(int denominator) {
                this.denominator = denominator;
            }

            public int dividing() {
                return numerator /  denominator;
            }

            public int restOfDividing() {
                return numerator % denominator;
            }
        }

        Division division = new Division();
        division.setNumerator(21);
        division.setDenominator(4);
        System.out.println("Numerator = " + division.getNumerator());
        System.out.println("Denominator = " + division.getDenominator());
        System.out.println("Division result = " + division.dividing());
        System.out.println("Rest of division = " + division.restOfDividing());
    }

    static class Summ {
        class Minus {
        }
    }

}
