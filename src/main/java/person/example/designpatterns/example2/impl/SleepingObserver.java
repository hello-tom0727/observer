package person.example.designpatterns.example2.impl;

import person.example.designpatterns.example2.service.Observer;
import person.example.designpatterns.example2.service.WeekendEvent;

/**
 * @author: 卢海鹏
 * @create: 2021-02-23 18:51
 * @description:
 */
public class SleepingObserver implements Observer {
    @Override
    public void onEvent(WeekendEvent event) {
        if (event instanceof SleepingEvent) {
            System.out.println("Hello: " + event.getName());
        }
    }

    @Override
    public boolean equals(Object obj) {
        return super.equals(obj);
    }
}
