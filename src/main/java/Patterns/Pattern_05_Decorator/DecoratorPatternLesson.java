package Patterns.Pattern_05_Decorator;

public class DecoratorPatternLesson {
    public static void main(String[] args) {

    }
}

interface Pizza {
    String makePizza();
}

//class MakePizza implements Pizza{
//    boolean isPepperoni;
//    boolean isCheese;
//    boolean isCheesePepperoni;
//    // 25
//
//    @Override
//    public String makePizza() {
//        return "with " + (isPepperoni ? "pepperoni " : "") + (isCheese ? "cheese " : "" + (isCheesePepperoni ? "cheese pepperoni " : ""));
//    }
//}
//
//
//class CheesePizza implements Pizza{
//
//    @Override
//    public String makePizza() {
//        return "with cheese ";
//    }
//}
//
//class PepperoniPizza implements Pizza{
//
//    @Override
//    public String makePizza() {
//        return "with pepperoni ";
//    }
//}
//
//class CheesePepperoniiPizza implements Pizza{
//
//    @Override
//    public String makePizza() {
//        return "with cheese pepperoni ";
//    }
//}


