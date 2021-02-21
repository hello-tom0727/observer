package person.example.designpatterns.example1.service;

import java.util.ArrayList;
import java.util.List;

/**
 * 抽象主题
 * 里面记录了所有的观察者，以及提供了增加，删除，遍历的方法
 */
public abstract class Subject {
    List<Observer> observerList = new ArrayList<>();

    public void attach(Observer observer) {
        observerList.add(observer);
    }

    public void detach(Observer observer) {
        observerList.add(observer);
    }

    public void update() {
        for (Observer observer : observerList) {
            observer.update();
        }
    }
}
