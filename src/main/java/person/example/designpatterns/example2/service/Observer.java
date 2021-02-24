package person.example.designpatterns.example2.service;

/**
 * @author: 卢海鹏
 * @create: 2021-02-23 18:45
 * @description:
 */
public interface Observer {
    /**
     * 处理具体事件
     * @param event
     */
    void onEvent(WeekendEvent event);
}
