package com.cliptender.dto;

public class VideoSuggestionDTO {

    private String title;
    private String description;
    private String userSuggestion;

    public VideoSuggestionDTO() {
    }

    public VideoSuggestionDTO(String title, String description, String userSuggestion) {
        this.title = title;
        this.description = description;
        this.userSuggestion = userSuggestion;
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

    public String getUserSuggestion() {
        return userSuggestion;
    }

    public void setUserSuggestion(String userSuggestion) {
        this.userSuggestion = userSuggestion;
    }
}
