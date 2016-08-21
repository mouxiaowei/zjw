package com.app01.lianxi.biying.mode;

/**
 * Created by Administrator on 2016/6/21.
 */
public class Passage {

    private int image;

    private String title;

    private String author;

    private String text;

    public Passage() {
    }

    public Passage(int image, String title, String author, String text) {
        this.image = image;
        this.title = title;
        this.author = author;
        this.text = text;
    }

    public int getImage() {
        return image;
    }

    public void setImage(int image) {
        this.image = image;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public String getText() {
        return text;
    }

    public void setText(String text) {
        this.text = text;
    }
}
