package com.using.array.model;

public class ShowAllData {
    private String nameshow;

    @Override
    public String toString() {
        return "ShowAllData{" +
                "nameshow='" + nameshow + '\'' +
                '}';
    }

    public String getNameshow() {
        return nameshow;
    }

    public void setNameshow(String nameshow) {
        this.nameshow = nameshow;
    }
}
