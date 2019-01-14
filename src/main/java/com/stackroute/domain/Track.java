package com.stackroute.domain;

import io.swagger.annotations.ApiModelProperty;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
@Data //Using lombok to handle the getter setters
@NoArgsConstructor //Creates a zero argument constructor
@AllArgsConstructor //Creates an all argument constructor
@Builder

public class Track {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)

    @ApiModelProperty(value = "ID of each track")
    private int trackID;

    @ApiModelProperty(value = "Name of each track")
    private String trackName;

    @ApiModelProperty(value = "Comments for each track")
    private String comments;

//    public int getTrackID() {
//        return trackID;
//    }
//
//    public void setTrackID(int trackID) {
//        this.trackID = trackID;
//    }
//
//    public String getTrackName() {
//        return trackName;
//    }
//
//    public void setTrackName(String trackName) {
//        this.trackName = trackName;
//    }
//
//    public String getComments() {
//        return comments;
//    }
//
//    public void setComments(String comments) {
//        this.comments = comments;
//    }
}
