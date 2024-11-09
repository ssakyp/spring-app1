package ru.alishev.springcourse;

import org.springframework.stereotype.Component;

@Component
public class ClassicalMusic implements Music{
    private ClassicalMusic(){}

    public static ClassicalMusic getClassicalMusic(){
        System.out.println("Hello from Factory method.");
        return new ClassicalMusic();
    }

    @Override
    public String getSong() {
        return "Hungarian Rapsody";
    }

    // init destroy => public/protected/private void (no arguments)
    public void doMyInit(){
        System.out.println("Doing my initialization of Classical Music.");
    }

    public void doMyDestroy(){
        System.out.println("Doing my destruction of Classical Music.");
    }

    // for prototype no destroy method called
}
