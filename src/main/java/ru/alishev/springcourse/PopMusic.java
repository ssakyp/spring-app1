package ru.alishev.springcourse;

public class PopMusic implements Music{
    @Override
    public String getSong() {
        return "Blinding Lights";
    }

    public void doMyInit(){
        System.out.println("Doing my initialization of PopMusic.");
    }

    public void doMyDestroy(){
        System.out.println("Doing my destruction of PopMusic");
    }
}
