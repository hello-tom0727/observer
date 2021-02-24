package person.example.designpatterns.example2.service;

import java.util.ArrayList;
import java.util.List;

/**
 * @author: 卢海鹏
 * @create: 2021-02-23 19:17
 * @description:
 */
public abstract class Subject {

    private List<Observer> observerList = new ArrayList<>();

    public List<Observer> getObserverList() {
        return observerList;
    }

    public void setObserverList(List<Observer> observerList) {
        this.observerList = observerList;
    }

    /**
     * 添加观察者
     * @param observer
     */
    public void addObserver(Observer observer) {
        observerList.add(observer);
    }

    public void removeObserver(Observer observer) {
        observerList.remove(observer);
    }

    public void multicaster(WeekendEvent event) {
        observerList.forEach(o -> o.onEvent(event));
    }

    abstract public void doStart();

    abstract public void doEnd();
}
