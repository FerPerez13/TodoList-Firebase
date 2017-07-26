package com.example.fer.todolist_firebase;

import java.io.Serializable;

/**
 * Created by fer on 26/07/17.
 */

public class Card implements Serializable{

    private String title;
    private String description;

    public Card() {
    }

    public Card(String title, String description){
        this.title = title;
        this.description = description;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    @Override
    public String toString() {
        return "Card{" + "title='" + title + ", description='" + description + '}';
    }
}
