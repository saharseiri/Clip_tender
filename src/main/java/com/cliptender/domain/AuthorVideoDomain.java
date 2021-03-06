package com.cliptender.domain;

import javax.persistence.*;
import java.util.List;

@Entity
public class AuthorVideoDomain {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Integer id;
    private String login;
    private String firstName;
    private String lastName;
    private String email;
    private String gender;
    private String branchActivity;
    @OneToMany
    private List<RecordedVideoDomain> listRecordedVideo;

    public AuthorVideoDomain() {
    }

    public AuthorVideoDomain(Integer id, String login, String firstName, String lastName, String email, String gender, String branchActivity, List<RecordedVideoDomain> listRecordedVideo) {
        this.id = id;
        this.login = login;
        this.firstName = firstName;
        this.lastName = lastName;
        this.email = email;
        this.gender = gender;
        this.branchActivity = branchActivity;
        this.listRecordedVideo = listRecordedVideo;
    }

    public String getLogin() {
        return login;
    }

    public void setLogin(String login) {
        this.login = login;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public String getBranchActivity() {
        return branchActivity;
    }

    public void setBranchActivity(String branchActivity) {
        this.branchActivity = branchActivity;
    }

    public List<RecordedVideoDomain> getListRecordedVideo() {
        return listRecordedVideo;
    }

    public void setListRecordedVideo(List<RecordedVideoDomain> listRecordedVideo) {
        this.listRecordedVideo = listRecordedVideo;
    }
}
