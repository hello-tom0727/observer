package person.example.designpatterns.example2.impl;

import person.example.designpatterns.example2.service.Subject;

/**
 * @author: 卢海鹏
 * @create: 2021-02-23 19:34
 * @description:
 */
public class ConcreteSubject extends Subject {
    @Override
    public void doStart() {
        System.out.println("开始");
    }

    @Override
    public void doEnd() {
        System.out.println("结束");
    }
}
