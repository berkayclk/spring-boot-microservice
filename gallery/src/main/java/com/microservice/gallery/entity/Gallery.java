package com.microservice.gallery.entity;

import java.io.Serializable;
import java.util.List;

public class Gallery implements Serializable {
    private int id;
    private String port;
    private List<Object> images;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getPort() {
        return port;
    }

    public void setPort(String port) {
        this.port = port;
    }

    public List<Object> getImages() {
        return images;
    }

    public void setImages(List<Object> images) {
        this.images = images;
    }
}
