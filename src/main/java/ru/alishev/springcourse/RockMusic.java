package ru.alishev.springcourse;

import org.springframework.stereotype.Component;

import java.util.ArrayList;
import java.util.List;

//@Component("someRockMusic")
public class RockMusic implements Music{
    @Override
    public List<String> getSong() {
        List<String> musicList = new ArrayList<>();
        musicList.add("Wind cries Mary");
        musicList.add("Bohemian Rhapsody");
        musicList.add("Stairway to Heaven");
        return musicList;
    }
}
