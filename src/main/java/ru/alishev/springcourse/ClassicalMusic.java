package ru.alishev.springcourse;

import org.springframework.context.annotation.Scope;
import org.springframework.context.event.ContextClosedEvent;
import org.springframework.context.event.EventListener;
import org.springframework.stereotype.Component;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;
import java.util.ArrayList;
import java.util.List;


//@Component
//@Scope("singleton")
public class ClassicalMusic implements Music{
    public ClassicalMusic(){}

    public static ClassicalMusic getClassicalMusic(){
        System.out.println("Hello from Factory method.");
        return new ClassicalMusic();
    }

    @Override
    public List<String> getSong() {
        List<String> musicList = new ArrayList<>();
        musicList.add("Hungarian Rapsody");
        musicList.add("Symphony No. 5");
        musicList.add("The Four Seasons: Spring");
        return musicList;
    }

    // init destroy => public/protected/private void (no arguments)
    @PostConstruct
    public void doMyInit(){
        System.out.println("Doing my initialization of Classical Music.");
    }

    @PreDestroy
    public void doMyDestroy(){
        System.out.println("Doing my destruction of Classical Music.");
    }

    // for prototype no destroy method called
}
