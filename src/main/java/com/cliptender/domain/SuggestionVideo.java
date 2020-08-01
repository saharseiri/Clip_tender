package com.cliptender.domain;

import org.springframework.boot.autoconfigure.domain.EntityScan;

import javax.persistence.*;
import java.util.List;

@Entity
public class SuggestionVideo {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private int id;
    private String title;
    private String discription;
    @ManyToMany
    private List<AuthorDomain> authorDomainList;

    public SuggestionVideo() {
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getDiscription() {
        return discription;
    }

    public void setDiscription(String discription) {
        this.discription = discription;
    }

    public List<AuthorDomain> getAuthorDomainList() {
        return authorDomainList;
    }

    public void setAuthorDomainList(List<AuthorDomain> authorDomainList) {
        this.authorDomainList = authorDomainList;
    }
}
