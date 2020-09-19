package com.cliptender.dto;

import java.time.Duration;

public class VideoRecordedDTO {
    private String title;
    private String description;
    private String autorLogin;
    private Duration duration;

    public VideoRecordedDTO() {
    }

    public VideoRecordedDTO(String title, String description, String autorLogin, Duration duration) {
        this.title = title;
        this.description = description;
        this.autorLogin = autorLogin;
        this.duration = duration;
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

    public String getAutorLogin() {
        return autorLogin;
    }

    public void setAutorLogin(String autorLogin) {
        this.autorLogin = autorLogin;
    }

    public Duration getDuration() {
        return duration;
    }

    public void setDuration(Duration duration) {
        this.duration = duration;
    }
}
