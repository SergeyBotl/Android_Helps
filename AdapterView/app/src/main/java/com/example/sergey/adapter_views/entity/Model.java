package com.example.sergey.adapter_views.entity;

public class Model {
    int imageId;
    String marka;
    String model;

    public Model(int imageId, String marka, String model) {
        this.imageId = imageId;
        this.marka = marka;
        this.model = model;
    }

    public int getImageId() {
        return imageId;
    }

    public void setImageId(int imageId) {
        this.imageId = imageId;
    }

    public String getMarka() {
        return marka;
    }

    public void setMarka(String marka) {
        this.marka = marka;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    @Override
    public String toString() {
        return "Marka= " + marka +
                "\nmodel= " + model ;
    }
}
