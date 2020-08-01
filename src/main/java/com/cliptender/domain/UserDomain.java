package com.cliptender.domain;

import javax.persistence.*;
import java.util.List;

@Entity
public class UserDomain extends ApplicationBusinessUserDomain{

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Integer id;
    private String clipName;
    private int count;
    private int age;
    @ManyToMany
    private List<RequestVideo> requestVideoList;

    public UserDomain() {
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

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public List<RequestVideo> getRequestVideoList() {
        return requestVideoList;
    }

    public void setRequestVideoList(List<RequestVideo> requestVideoList) {
        this.requestVideoList = requestVideoList;
    }
}


