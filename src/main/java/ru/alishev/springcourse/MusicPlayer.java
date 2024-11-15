package ru.alishev.springcourse;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

//@Component
//@Scope("prototype")
public class MusicPlayer {
    //private final ClassicalMusic classicalMusic;
    //private final RockMusic someRockMusic;
    private List<Music> musicList = new ArrayList<>();
//    @Autowired
//    @Qualifier("someRockMusic")
//    private Music music1;
//    private Music music2;

    //@Autowired
//    public MusicPlayer(ClassicalMusic classicalMusic, RockMusic someRockMusic) {
////        this.music1 = music1;
////        this.music2 = music2;
//        this.classicalMusic = classicalMusic;
//        this.someRockMusic = someRockMusic;
//    }
    //    private ClassicalMusic classicalMusic;
//    private RockMusic rockMusic;

//    @Autowired
//    public MusicPlayer(ClassicalMusic classicalMusic, RockMusic rockMusic){
//        this.classicalMusic = classicalMusic;
//        this.rockMusic = rockMusic;
//    }

    @Value("${musicPlayer.name}")
    private String name;
    @Value("${musicPlayer.volume}")
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

     //Inversion of Control
    public MusicPlayer(List<Music> musicList) {
        this.musicList = musicList;     // polymorphism
    }

//    public void playMusic(Genre genre){
//        Random random = new Random();
//        // random number between 0 - 2
//        int randomNumber = random.nextInt(3);
//        if(genre == Genre.CLASSICAl){
//            //random classical song
//            System.out.println(classicalMusic.getSong().get(randomNumber));
//        } else {
//            // random rock song
//            System.out.println(someRockMusic.getSong().get(randomNumber));
//        }
//    }


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
    public void playMusic(){
        Random random = new Random();
        int randNumber = random.nextInt(3);
        System.out.println(musicList.get(randNumber).getSong().get(randNumber));
    }
}
