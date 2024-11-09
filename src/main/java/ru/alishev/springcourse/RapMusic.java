package ru.alishev.springcourse;

import org.springframework.stereotype.Component;

import java.util.ArrayList;
import java.util.List;

//@Component
public class RapMusic implements Music{
    @Override
    public List<String> getSong() {
        List<String> musicList = new ArrayList<>();
        musicList.add("Sicko Mode");
        return musicList;
    }
}
