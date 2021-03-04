package person.example.designpatterns.example3.impl;

import java.util.Date;

/**
 * @author: 卢海鹏
 * @create: 2021-03-04 11:18
 * @description:
 */
public class PlayingGameListener {

    public PlayingGameListener()
    {
        System.out.println("playing");
    }

    public void stopPlayingGame(Date date)
    {
        System.out.println("stop playing" + date);
    }
}
