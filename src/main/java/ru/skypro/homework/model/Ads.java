package ru.skypro.homework.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "user")
public class Ads {
    @Id
    @GeneratedValue
    private Integer id;
    private Integer author;
    private String image;
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

    public Integer getId () {
        return id;
    }

    public void setId ( Integer pk ) {
        this.id = id;
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
