package com.backend.backend.entity;

import jakarta.persistence.*;

@Entity(name = "ART")
public class ArtEntity {

    @Id()
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "ID")
    private int id;

    @Column(name ="URL")
    private String imageURL;

    @Column(name ="NAME")
    private String name;

    @Column(name="TEXT")
    private String text;

    public ArtEntity(int id, String imageURL, String name, String text) {
        this.id = id;
        this.imageURL = imageURL;
        this.name = name;
        this.text = text;
    }

    public ArtEntity() {

    }

    @Override
    public String toString() {
        return "{" +
                "imageURL='" + imageURL + '\'' +
                ", name='" + name + '\'' +
                ", text='" + text + '\'' +
                '}';
    }
}
