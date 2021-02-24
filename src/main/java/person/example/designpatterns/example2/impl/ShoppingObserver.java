package person.example.designpatterns.example2.impl;

import person.example.designpatterns.example2.service.Observer;
import person.example.designpatterns.example2.service.WeekendEvent;

/**
 * @author: 卢海鹏
 * @create: 2021-02-23 18:48
 * @description:
 */
public class ShoppingObserver implements Observer {
    @Override
    public void onEvent(WeekendEvent event) {
        if (event instanceof ShoppingEvent) {
            System.out.println("hello: " + event.getName());
        }
    }
}
