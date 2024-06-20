package hackathon.advance.ra.model;

import java.time.LocalDate;

public class Song {
    // Heap , stack
    private String songId, songName, descriptions, songWriter;
    private Singer singer;
    private LocalDate createDate;
    private boolean songStatus; // cấp phát động
    private static int nextId = 1;  // cấp phát tĩnh


    public Song(String songName, String descriptions, String songWriter, Singer singer, LocalDate createDate, boolean songStatus) {
        this.songName = songName;
        this.descriptions = descriptions;
        this.songWriter = songWriter;
        this.singer = singer;
        this.createDate = createDate;
        this.songStatus = songStatus;
    }

    public Song() {
    }

    public String getSongId() {
        return songId;
    }

    public void setSongId(String songId) {
        this.songId = songId;
    }

    public String getSongName() {
        return songName;
    }

    public void setSongName(String songName) {
        this.songName = songName;
    }

    public String getDescriptions() {
        return descriptions;
    }

    public void setDescriptions(String descriptions) {
        this.descriptions = descriptions;
    }

    public String getSongWriter() {
        return songWriter;
    }

    public void setSongWriter(String songWriter) {
        this.songWriter = songWriter;
    }

    public Singer getSinger() {
        return singer;
    }

    public void setSinger(Singer singer) {
        this.singer = singer;
    }

    public LocalDate getCreateDate() {
        return createDate;
    }

    public void setCreateDate(LocalDate createDate) {
        this.createDate = createDate;
    }

    public boolean isSongStatus() {
        return songStatus;
    }

    public void setSongStatus(boolean songStatus) {
        this.songStatus = songStatus;
    }

    @Override
    public String toString() {
        return "Song{" +
                "songId='" + songId + '\'' +
                ", songName='" + songName + '\'' +
                ", descriptions='" + descriptions + '\'' +
                ", songWriter='" + songWriter + '\'' +
                ", singer=" + singer +
                ", createDate=" + createDate +
                ", songStatus=" + songStatus +
                '}';
    }

}
