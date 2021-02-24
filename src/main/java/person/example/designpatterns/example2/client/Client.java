package person.example.designpatterns.example2.client;

import person.example.designpatterns.example2.impl.ConcreteSubject;
import person.example.designpatterns.example2.impl.ShoppingEvent;
import person.example.designpatterns.example2.impl.ShoppingObserver;
import person.example.designpatterns.example2.impl.SleepingObserver;
import person.example.designpatterns.example2.service.Subject;

/**
 * @author: 卢海鹏
 * @create: 2021-02-23 19:37
 * @description:
 */
public class Client {
    public static void main(String[] args) {
        Subject concreteSubject = new ConcreteSubject();
        ShoppingObserver shoppingObserver = new ShoppingObserver();
        SleepingObserver sleepingObserver = new SleepingObserver();
        concreteSubject.addObserver(shoppingObserver);
        concreteSubject.addObserver(sleepingObserver);
        concreteSubject.multicaster(new ShoppingEvent());
    }
}
