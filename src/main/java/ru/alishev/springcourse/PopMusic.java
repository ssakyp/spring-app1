package ru.alishev.springcourse;

import org.springframework.stereotype.Component;

import java.util.ArrayList;
import java.util.List;

//@Component("somePopMusic")
public class PopMusic implements Music{
    @Override
    public List<String> getSong() {
        List<String> musicList = new ArrayList<>();
        musicList.add("Blinding Lights");
        musicList.add("Shape of You.");
        musicList.add("Uptown Funk");
        return musicList;
    }

    public void doMyInit(){
        System.out.println("Doing my initialization of PopMusic.");
    }

    public void doMyDestroy(){
        System.out.println("Doing my destruction of PopMusic");
    }
}
