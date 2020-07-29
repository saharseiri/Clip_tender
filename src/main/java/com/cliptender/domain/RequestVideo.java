package com.cliptender.domain;

import javax.persistence.*;
import java.util.List;

@Entity
public class RequestVideo {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private int id;
    private String title;
    private String description;
    @ManyToMany
    private List<UserDomain> userDomainList;

    public RequestVideo() {
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

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public List<UserDomain> getUserDomainList() {
        return userDomainList;
    }

    public void setUserDomainList(List<UserDomain> userDomainList) {
        this.userDomainList = userDomainList;
    }
}
