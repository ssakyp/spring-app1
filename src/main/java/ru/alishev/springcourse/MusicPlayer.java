package ru.alishev.springcourse;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.util.ArrayList;
import java.util.List;

@Component
public class MusicPlayer {
    //private List<Music> musicList = new ArrayList<>();
    //@Autowired
    //private Music music;
    private ClassicalMusic classicalMusic;
    private RockMusic rockMusic;

    @Autowired
    public MusicPlayer(ClassicalMusic classicalMusic, RockMusic rockMusic){
        this.classicalMusic = classicalMusic;
        this.rockMusic = rockMusic;
    }

    private String name;
    private String volume;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getVolume() {
        return volume;
    }

    public void setVolume(String volume) {
        this.volume = volume;
    }

//    @Autowired
//    public MusicPlayer(Music music){
//        this.music = music;
//    }

    // Inversion of Control
//    public MusicPlayer(List<Music> musicList) {
//        this.musicList = musicList;     // polymorphism
//    }

    public String playMusic(){
        System.out.println("Playing " + rockMusic.getSong());
        return "Playing " + classicalMusic.getSong();
    }


//    public void playMusic(){
//        System.out.println("Playing: ");
//        int i = 0;
//        for(Music music : musicList){
//            if(i != musicList.size() - 1){
//                System.out.print(music.getSong() + ", ");
//            } else{
//                System.out.print(music.getSong());
//            }
//            i++;
//        }
//        System.out.println();
//    }

//    @Autowired
//    public void setClassicalMusic(Music music ){
//        this.music = music;
//    }
//    public void setMusic(List<Music> musicList) {
//        this.musicList = musicList;
//    }

//    public MusicPlayer(){
//
//    }
}
