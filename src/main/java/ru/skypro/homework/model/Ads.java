package ru.skypro.homework.model;

import com.fasterxml.jackson.annotation.JsonProperty;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

@Entity
public class Ads {
    @Id
    @GeneratedValue

    private Integer author;
    private String image;
    private Integer pk;
    private Integer price;
    private String title;

    public Integer getAuthor () {
        return author;
    }

    public void setAuthor ( Integer author ) {
        this.author = author;
    }

    public String getImage () {
        return image;
    }

    public void setImage ( String image ) {
        this.image = image;
    }

    public Integer getPk () {
        return pk;
    }

    public void setPk ( Integer pk ) {
        this.pk = pk;
    }

    public Integer getPrice () {
        return price;
    }

    public void setPrice ( Integer price ) {
        this.price = price;
    }

    public String getTitle () {
        return title;
    }

    public void setTitle ( String title ) {
        this.title = title;
    }
}
