package person.example.designpatterns.example3.impl;

import java.util.ArrayList;
import java.util.List;

/**
 * @author: 卢海鹏
 * @create: 2021-03-04 10:53
 * @description: 可以一次通知多个实体类
 */
public class EventHandler {
    private List<Event> eventList;
    public EventHandler() {
        eventList = new ArrayList<>();
    }

    public void addEvent(Object object, String methodName, Object... args) {
        eventList.add(new Event(object, methodName, args));
    }

    public void notifyX() throws Exception{
        for (Event event : eventList) {
            event.invoke();
        }
    }
}
