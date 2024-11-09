package ru.alishev.springcourse;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class TestSpring {
    public static void main(String[] args) {
        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");
        //Music music = context.getBean("musicBean", Music.class);
        //MusicPlayer musicPlayer = new MusicPlayer(music);

        // dependency injection using applicationContext.xml
        MusicPlayer firstMusicPlayer = context.getBean("musicPlayer", MusicPlayer.class);   //scope is singleton by default
        MusicPlayer secondMusicPlayer = context.getBean("musicPlayer", MusicPlayer.class);  //scope is singleton by default

        // prototype scope creates new bean every time
        boolean compare = firstMusicPlayer == secondMusicPlayer;
        System.out.println(compare);
        System.out.println(firstMusicPlayer); // prints same hash means same object
        System.out.println(secondMusicPlayer);

        firstMusicPlayer.playMusic();
        firstMusicPlayer.setVolume("43");
        System.out.println(firstMusicPlayer.getName());
        System.out.println(firstMusicPlayer.getVolume());
        System.out.println(secondMusicPlayer.getVolume());
        context.close();
    }
}
