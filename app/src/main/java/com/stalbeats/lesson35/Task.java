package com.stalbeats.lesson35;
import java.io.Serializable;

public class Task implements Serializable {
    public String title;
    public String descreption;
    public boolean isDone;

    public Task(String title, String descreption, boolean isDone) {
        this.title = title;
        this.descreption = descreption;

        this.isDone = isDone;
    }

    public Task(String title, String descreption) {
        this.title = title;
        this.descreption = descreption;
    }

}