package com.example.avatoop.Model;

public class ModelGamesTable {
    int id;
    int imageIconLeague;
    int imageIconTeam1;
    int imageIconTeam2;
    int imageIconTeam3;
    int imageIconTeam4;

    String titleLeage;
    String titleTeam1;
    String titleTeam2;
    String titleTeam3;
    String titleTeam4;
    String game1Time;
    String game2Time;

    public ModelGamesTable() {
    }

    public ModelGamesTable(int id, int imageIconLeague, int imageIconTeam1, int imageIconTeam2, int imageIconTeam3, int imageIconTeam4, String titleLeage, String titleTeam1, String titleTeam2, String titleTeam3, String titleTeam4, String game1Time, String game2Time) {
        this.id = id;
        this.imageIconLeague = imageIconLeague;
        this.imageIconTeam1 = imageIconTeam1;
        this.imageIconTeam2 = imageIconTeam2;
        this.imageIconTeam3 = imageIconTeam3;
        this.imageIconTeam4 = imageIconTeam4;
        this.titleLeage = titleLeage;
        this.titleTeam1 = titleTeam1;
        this.titleTeam2 = titleTeam2;
        this.titleTeam3 = titleTeam3;
        this.titleTeam4 = titleTeam4;
        this.game1Time = game1Time;
        this.game2Time = game2Time;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getImageIconLeague() {
        return imageIconLeague;
    }

    public void setImageIconLeague(int imageIconLeague) {
        this.imageIconLeague = imageIconLeague;
    }

    public int getImageIconTeam1() {
        return imageIconTeam1;
    }

    public void setImageIconTeam1(int imageIconTeam1) {
        this.imageIconTeam1 = imageIconTeam1;
    }

    public int getImageIconTeam2() {
        return imageIconTeam2;
    }

    public void setImageIconTeam2(int imageIconTeam2) {
        this.imageIconTeam2 = imageIconTeam2;
    }

    public int getImageIconTeam3() {
        return imageIconTeam3;
    }

    public void setImageIconTeam3(int imageIconTeam3) {
        this.imageIconTeam3 = imageIconTeam3;
    }

    public int getImageIconTeam4() {
        return imageIconTeam4;
    }

    public void setImageIconTeam4(int imageIconTeam4) {
        this.imageIconTeam4 = imageIconTeam4;
    }

    public String getTitleLeage() {
        return titleLeage;
    }

    public void setTitleLeage(String titleLeage) {
        this.titleLeage = titleLeage;
    }

    public String getTitleTeam1() {
        return titleTeam1;
    }

    public void setTitleTeam1(String titleTeam1) {
        this.titleTeam1 = titleTeam1;
    }

    public String getTitleTeam2() {
        return titleTeam2;
    }

    public void setTitleTeam2(String titleTeam2) {
        this.titleTeam2 = titleTeam2;
    }

    public String getTitleTeam3() {
        return titleTeam3;
    }

    public void setTitleTeam3(String titleTeam3) {
        this.titleTeam3 = titleTeam3;
    }

    public String getTitleTeam4() {
        return titleTeam4;
    }

    public void setTitleTeam4(String titleTeam4) {
        this.titleTeam4 = titleTeam4;
    }

    public String getGame1Time() {
        return game1Time;
    }

    public void setGame1Time(String game1Time) {
        this.game1Time = game1Time;
    }

    public String getGame2Time() {
        return game2Time;
    }

    public void setGame2Time(String game2Time) {
        this.game2Time = game2Time;
    }
}