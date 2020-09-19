package com.cliptender.domain;

import javax.persistence.*;
import java.util.List;
import java.util.Set;

@Entity
public class SuggestionVideoDomain {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private int id;
    @JoinColumn(name = "recorded_video_id", referencedColumnName = "id")
    private RecordedVideoDomain recordedVideo;
    @JoinColumn(name = "request_video_id", referencedColumnName = "id")
    private RequestVideoDomain requestVideo;

    public SuggestionVideoDomain() {
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public RecordedVideoDomain getRecordedVideo() {
        return recordedVideo;
    }

    public void setRecordedVideo(RecordedVideoDomain recordedVideo) {
        this.recordedVideo = recordedVideo;
    }

    public RequestVideoDomain getRequestVideo() {
        return requestVideo;
    }

    public void setRequestVideo(RequestVideoDomain requestVideo) {
        this.requestVideo = requestVideo;
    }
}
