package person.example.designpatterns.example1.impl;

import person.example.designpatterns.example1.service.Observer;

public class ConcreteObserver extends Observer {

    private String name;
    private String state;
    private ConcreteSubject subject;

    public ConcreteObserver(String name, ConcreteSubject subject) {
        this.name = name;
        this.subject = subject;
    }

    @Override
    public void update() {
        this.state = this.subject.getSubjectState();
        System.out.println("name: " + this.name + ",state: " + this.state);
    }
}
