package ru.alishev.springcourse;

import org.springframework.context.support.ClassPathXmlApplicationContext;

import java.util.ArrayList;
import java.util.List;

public class TestSpring {
    public static void main(String[] args) {
        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");
        //Music music = context.getBean("musicBean", Music.class);
        //MusicPlayer musicPlayer = new MusicPlayer(music);

        // dependency injection using applicationContext.xml
        //MusicPlayer firstMusicPlayer = context.getBean("musicPlayer", MusicPlayer.class);   //scope is singleton by default
        //MusicPlayer secondMusicPlayer = context.getBean("musicPlayer", MusicPlayer.class);  //scope is singleton by default

        // prototype scope creates new bean every time
//        boolean compare = firstMusicPlayer == secondMusicPlayer;
//        System.out.println(compare);
//        System.out.println(firstMusicPlayer); // prints same hash means same object
//        System.out.println(secondMusicPlayer);
//
//        firstMusicPlayer.playMusic();
//        firstMusicPlayer.setVolume("43");
//        System.out.println(firstMusicPlayer.getName());
//        System.out.println(firstMusicPlayer.getVolume());
//        System.out.println(secondMusicPlayer.getVolume());
//        context.close();

//        Music music1 = context.getBean("someRockMusic", Music.class);
//        Music music2 = context.getBean("somePopMusic", Music.class);
//        Music music3 = context.getBean("someClassicalMusic", Music.class);
//        Music music4 = context.getBean("rapMusic", Music.class);
//
//        List<Music> musicList = new ArrayList<>();
//        musicList.add(music1);
//        musicList.add(music2);
//        musicList.add(music3);
//        musicList.add(music4);
//
//        MusicPlayer musicPlayer = new MusicPlayer(musicList);
//
//        musicPlayer.playMusic();

        MusicPlayer musicPlayer = context.getBean("musicPlayer", MusicPlayer.class);
        musicPlayer.playMusic(Genre.CLASSICAl);
        musicPlayer.playMusic(Genre.ROCK);
        System.out.println(musicPlayer.getName());
        System.out.println(musicPlayer.getVolume());

//        ClassicalMusic classicalMusic1 = context.getBean("classicalMusic", ClassicalMusic.class);
//        ClassicalMusic classicalMusic2 = context.getBean("classicalMusic", ClassicalMusic.class);
//        System.out.println(classicalMusic2 == classicalMusic1);
//        Computer computer = context.getBean("computer", Computer.class);
//        System.out.println(computer);

        context.close();

    }
}
