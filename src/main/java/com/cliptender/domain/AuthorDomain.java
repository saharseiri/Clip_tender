package com.cliptender.domain;

import javax.persistence.*;
import java.util.List;

@Entity
public class AuthorDomain extends ApplicationBusinessUserDomain{

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Integer id;
    private String clipName;
    private int count;
//    @ManyToMany
//    private List<SuggestionVideo> suggestionVideoList;

    public AuthorDomain() {
        super();
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getClipName() {
        return clipName;
    }

    public void setClipName(String clipName) {
        this.clipName = clipName;
    }

    public int getCount() {
        return count;
    }

    public void setCount(int count) {
        this.count = count;
    }

//    public List<SuggestionVideo> getSuggestionVideoList() {
//        return suggestionVideoList;
//    }

//    public void setSuggestionVideoList(List<SuggestionVideo> suggestionVideoList) {
//        this.suggestionVideoList = suggestionVideoList;
//    }
}
