package person.example.designpatterns.example3.impl;

import java.util.Date;

import person.example.designpatterns.example3.service.Notifier;

/**
 * @author: 卢海鹏
 * @create: 2021-03-04 11:19
 * @description:
 */
public class Test {
    public static void main(String[] args) {
        Notifier goodNotifier = new ConcreteNotifier();

        PlayingGameListener playingGameListener = new PlayingGameListener();

        WatchingTVListener watchingTVListener = new WatchingTVListener();

        goodNotifier.addListener(playingGameListener, "stopPlayingGame", new Date());

        goodNotifier.addListener(watchingTVListener, "stopWatchingTV", new Date());

        goodNotifier.notifyX();
    }
}
