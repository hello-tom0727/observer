package person.example.designpatterns.example3.impl;

import java.util.Date;

/**
 * @author: 卢海鹏
 * @create: 2021-03-04 11:18
 * @description:
 */
public class WatchingTVListener {
    public WatchingTVListener()
    {
        System.out.println("watching TV");
    }

    public void stopWatchingTV(Date date)
    {
        System.out.println("stop watching" + date);
    }
}
