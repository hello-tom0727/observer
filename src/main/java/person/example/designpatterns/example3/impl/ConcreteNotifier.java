package person.example.designpatterns.example3.impl;

import person.example.designpatterns.example3.service.Notifier;

/**
 * @author: 卢海鹏
 * @create: 2021-03-04 11:16
 * @description:
 */
public class ConcreteNotifier extends Notifier {
    @Override
    public void addListener(Object object, String methodName, Object... args) {
        this.getEventHandler().addEvent(object, methodName, args);
    }

    @Override
    public void notifyX() {
        try {
            this.getEventHandler().notifyX();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
