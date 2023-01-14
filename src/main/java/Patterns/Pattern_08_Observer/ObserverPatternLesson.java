package Patterns.Pattern_08_Observer;

import java.util.ArrayList;
import java.util.List;
import java.util.Observable;
import java.util.Observer;
import java.util.function.Consumer;

public class ObserverPatternLesson {
    public static void main(String[] args) throws InterruptedException {
        Subject subject = new Subject();
        Subscriber1 subscriber1 = new Subscriber1();
        subject.addSubscriberToSubscriberList(subscriber1);
        Subscriber2 subscriber2 = new Subscriber2();
        subject.addSubscriberToSubscriberList(subscriber2);
        subject.addSubscriberToSubscriberList(new Subscriber3());
        System.out.println(subject.listOfSubscribers);
        subject.notifySubscribers("Hi, you've been added to the subscribers of our news");
        subject.removeSubscriberFRomSubscribersList(subscriber2);
        System.out.println();

        Subject2 subject2 = new Subject2();
        subject2.addObserver(new Subscriber_4());
        Subscriber_5 subscriber5 = new Subscriber_5();
        subject2.addObserver(subscriber5);
        subject2.setChanged();
        subject2.notifyObservers("you been added to subscribers to Subscriber2 server");
        subject2.deleteObserver(subscriber5);

    }
}

interface MyObservable{
    public abstract void callMe(String message); // <- abstract method, as has no {....realisation}

//    default void makeSomething() {}
}

class Subscriber1 implements MyObservable {

    @Override
    public void callMe(String message) {
        System.out.println("subscrtiber_1 " + message);
    }
}

class Subscriber2 implements MyObservable {

    @Override
    public void callMe(String message) {
        System.out.println("subscrtiber_2 " + message);
    }
}

class Subscriber3 implements MyObservable {

    @Override
    public void callMe(String message) {
        System.out.println("subscrtiber_3 " + message);
    }
}

class Subject {
    List<MyObservable> listOfSubscribers = new ArrayList<>();

    public void addSubscriberToSubscriberList(MyObservable myObservable) {
        listOfSubscribers.add(myObservable);
    }

    public void removeSubscriberFRomSubscribersList(MyObservable myObservable) {
        listOfSubscribers.remove(myObservable);
    }

    public void notifySubscribers(String message) {
        listOfSubscribers.forEach(subscriberToBeNotified -> subscriberToBeNotified.callMe(message));
    }

}

class Subject2 extends Observable {
    @Override
    protected synchronized void setChanged() {
        super.setChanged();
    }
}

class Subscriber_4 implements Observer {
    @Override
    public void update(Observable o, Object arg) {
        System.out.println("subscriber_4 " + arg);
    }
}

class Subscriber_5 implements Observer {
    @Override
    public void update(Observable o, Object arg) {
        System.out.println("subscriber_5 " + arg);
    }
}





