package Patterns.Pattern_05_Decorator;

public class DecoratorPatternLesson {
    public static void main(String[] args) {
        Pizza cheesePizza = new CheesePizza(new DoughPizza());
        System.out.println(cheesePizza.makePizza());
        Pizza cheesePepperoni = new PepperoniPizza(cheesePizza);
        System.out.println(cheesePepperoni.makePizza());
        Pizza meatPizzaCheesePepperoni = new MeatPizza(cheesePepperoni);
        System.out.println(meatPizzaCheesePepperoni.makePizza());
        Pizza pepperoniPizza =  new PepperoniPizza(new DoughPizza());
        System.out.println(pepperoniPizza.makePizza());
    }
}

interface Pizza {
    String makePizza();
}

class DoughPizza implements Pizza {
    @Override
    public String makePizza() {
        return "with ";
    }
}

class CheesePizza implements Pizza {
    Pizza pizza;

    public CheesePizza(Pizza pizza) {
        this.pizza = pizza;
    }

    @Override
    public String makePizza() {
        return pizza.makePizza() + "cheese ";
    }
}

class PepperoniPizza implements Pizza {
    Pizza pizza;

    public PepperoniPizza(Pizza pizza) {
        this.pizza = pizza;
    }

    @Override
    public String makePizza() {
        return pizza.makePizza() + "pepperoni ";
    }
}

class MeatPizza implements Pizza {
    Pizza pizza;

    public MeatPizza(Pizza pizza) {
        this.pizza = pizza;
    }

    @Override
    public String makePizza() {
        return pizza.makePizza() + "meat ";
    }
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


