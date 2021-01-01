package com.example.avatoop.Model;

public class ModelPost {
    int id ;
    int imageIcon;
    int imagePost;
    String postTitle;

    public ModelPost() {
    }


    public ModelPost(int id, int imageIcon, int imagePost, String postTitle) {
        this.id = id;
        this.imageIcon = imageIcon;
        this.imagePost = imagePost;
        this.postTitle = postTitle;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getImageIcon() {
        return imageIcon;
    }

    public void setImageIcon(int imageIcon) {
        this.imageIcon = imageIcon;
    }

    public int getImagePost() {
        return imagePost;
    }

    public void setImagePost(int imagePost) {
        this.imagePost = imagePost;
    }

    public String getPostTitle() {
        return postTitle;
    }

    public void setPostTitle(String postTitle) {
        this.postTitle = postTitle;
    }
}
