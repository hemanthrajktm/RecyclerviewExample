package com.example.recyclerviewexample;

public class DataModel
{
   private String movie_name;
   private String year;

    public DataModel(String movie_name, String year) {
        this.movie_name = movie_name;
        this.year = year;
    }
    public String getMovie_name() {
        return movie_name;
    }

    public void setMovie_name(String movie_name) {
        this.movie_name = movie_name;
    }

    public String getYear() {
        return year;
    }

    public void setYear(String year) {
        this.year = year;
    }
}
