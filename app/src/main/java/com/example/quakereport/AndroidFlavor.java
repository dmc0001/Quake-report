package com.example.quakereport;

public class AndroidFlavor {
    private String intensity;
    private String place;
    private String date;

    public AndroidFlavor(String intensity, String place, String date) {
        this.intensity = intensity;
        this.place = place;
        this.date = date;
    }

    public String getIntensity() {
        return intensity;
    }

    public void setIntensity(String intensity) {
        this.intensity = intensity;
    }

    public String getPlace() {
        return place;
    }

    public void setPlace(String place) {
        this.place = place;
    }

    public String getDate() {
        return date;
    }

    public void setDate(String date) {
        this.date = date;
    }
}
