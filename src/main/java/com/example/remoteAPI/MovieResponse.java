package com.example.remoteAPI;
//class have parameter call model class
public class MovieResponse {
    private int budget;
    private String imdb_id;
    private String original_title;

    public MovieResponse(int budget, String imdb_id, String original_title) {
        this.budget = budget;
        this.imdb_id = imdb_id;
        this.original_title = original_title;
    }

    public int getBudget() {
        return budget;
    }

    public void setBudget(int budget) {
        this.budget = budget;
    }

    public String getImdb_id() {
        return imdb_id;
    }

    public void setImdb_id(String imdb_id) {
        this.imdb_id = imdb_id;
    }

    public String getOriginal_title() {
        return original_title;
    }

    public void setOriginal_title(String original_title) {
        this.original_title = original_title;
    }
}
