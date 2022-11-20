package ru.skypro.homework.model;

import com.fasterxml.jackson.annotation.JsonProperty;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import java.time.OffsetDateTime;

@Entity
public class AdsComment {
    @Id
    @GeneratedValue

    private Integer author;
    private OffsetDateTime createdAt;
    private Integer pk;
    private String text;

    public Integer getAuthor () {
        return author;
    }

    public void setAuthor ( Integer author ) {
        this.author = author;
    }

    public OffsetDateTime getCreatedAt () {
        return createdAt;
    }

    public void setCreatedAt ( OffsetDateTime createdAt ) {
        this.createdAt = createdAt;
    }

    public Integer getPk () {
        return pk;
    }

    public void setPk ( Integer pk ) {
        this.pk = pk;
    }

    public String getText () {
        return text;
    }

    public void setText ( String text ) {
        this.text = text;
    }
}
