package person.example.designpatterns.example3.service;

import person.example.designpatterns.example3.impl.EventHandler;

/**
 * @author: 卢海鹏
 * @create: 2021-03-04 11:11
 * @description:
 */
public abstract class Notifier {
    private EventHandler eventHandler = new EventHandler();

    public EventHandler getEventHandler() {
        return eventHandler;
    }

    public void setEventHandler(EventHandler eventHandler) {
        this.eventHandler = eventHandler;
    }

    /**
     * 增加需要通知的对象方法
     * @param object
     * @param methodName
     * @param args
     */
    public abstract void addListener(Object object, String methodName, Object... args);

    /**
     * 具体的通知行为
     */
    public abstract void notifyX();
}
