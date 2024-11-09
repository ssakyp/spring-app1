package ru.alishev.springcourse;

public class MusicPlayer {
    private Music music;

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
    public MusicPlayer(Music music) {
        this.music = music;     // polymorphism
    }

    public void playMusic(){
        System.out.println("Playing: " + music.getSong());
    }

    public void setMusic(Music music) {
        this.music = music;
    }

    public MusicPlayer(){

    }
}
