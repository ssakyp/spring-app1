package ru.alishev.springcourse;

import java.util.ArrayList;
import java.util.List;

public class MusicPlayer {
    private List<Music> musicList = new ArrayList<>();

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

    // Inversion of Control
    public MusicPlayer(List<Music> musicList) {
        this.musicList = musicList;     // polymorphism
    }

    public void playMusic(){
        System.out.println("Playing: ");
        int i = 0;
        for(Music music : musicList){
            if(i != musicList.size() - 1){
                System.out.print(music.getSong() + ", ");
            } else{
                System.out.print(music.getSong());
            }
            i++;
        }
        System.out.println();
    }

    public void setMusic(List<Music> musicList) {
        this.musicList = musicList;
    }

    public MusicPlayer(){

    }
}
