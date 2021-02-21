package person.example.designpatterns.example1.impl;

import person.example.designpatterns.example1.service.Subject;

/**
 * 具体的主题
 * 存在主题状态
 */
public class ConcreteSubject extends Subject {
    private String subjectState;

    public String getSubjectState() {
        return subjectState;
    }

    public void setSubjectState(String subjectState) {
        this.subjectState = subjectState;
    }
}
