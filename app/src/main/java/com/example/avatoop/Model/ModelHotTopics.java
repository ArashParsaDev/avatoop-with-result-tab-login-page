package com.example.avatoop.Model;

public class ModelHotTopics {
    int id ;
    int imageHotTopic;
    String titleHotTopic;
    String desHotTopic;

    public ModelHotTopics() {
    }

    public ModelHotTopics(int id, int imageHotTopic, String titleHotTopic, String desHotTopic) {
        this.id = id;
        this.imageHotTopic = imageHotTopic;
        this.titleHotTopic = titleHotTopic;
        this.desHotTopic = desHotTopic;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getImageHotTopic() {
        return imageHotTopic;
    }

    public void setImageHotTopic(int imageHotTopic) {
        this.imageHotTopic = imageHotTopic;
    }

    public String getTitleHotTopic() {
        return titleHotTopic;
    }

    public void setTitleHotTopic(String titleHotTopic) {
        this.titleHotTopic = titleHotTopic;
    }

    public String getDesHotTopic() {
        return desHotTopic;
    }

    public void setDesHotTopic(String desHotTopic) {
        this.desHotTopic = desHotTopic;
    }
}
