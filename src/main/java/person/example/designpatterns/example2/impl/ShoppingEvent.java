package person.example.designpatterns.example2.impl;

import person.example.designpatterns.example2.service.WeekendEvent;

/**
 * @author: 卢海鹏
 * @create: 2021-02-22 18:50
 * @description:
 */
public class ShoppingEvent implements WeekendEvent {
    @Override
    public String getName() {
        return "shopping";
    }
}
