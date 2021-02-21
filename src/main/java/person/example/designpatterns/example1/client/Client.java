package person.example.designpatterns.example1.client;

import person.example.designpatterns.example1.impl.ConcreteObserver;
import person.example.designpatterns.example1.impl.ConcreteSubject;

public class Client {

    public static void main(String[] args) {
        ConcreteSubject subject = new ConcreteSubject();
        subject.setSubjectState("AAA");
        subject.attach(new ConcreteObserver("X", subject));
        subject.attach(new ConcreteObserver("Y", subject));

        subject.update();
    }
}
