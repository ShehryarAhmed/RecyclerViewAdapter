package com.uberclone.clone.recyclerviewadaptersample;

public class Books {

    private String Title;
    private String Email;
    private int Id;
    private float Cost;

    public Books() {

    }

    public Books(String title, String email, int id, float cost) {
        Title = title;
        Email = email;
        Id = id;
        Cost = cost;
    }

    public String getTitle() {
        return Title;
    }

    public void setTitle(String title) {
        Title = title;
    }

    public String getEmail() {
        return Email;
    }

    public void setEmail(String email) {
        Email = email;
    }

    public int getId() {
        return Id;
    }

    public void setId(int id) {
        Id = id;
    }

    public float getCost() {
        return Cost;
    }

    public void setCost(float cost) {
        Cost = cost;
    }
}
