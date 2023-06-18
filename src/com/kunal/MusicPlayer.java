package com.kunal;

import java.util.List;

public class MusicPlayer {

    private List<Song> playList;


    public void addSong(String title, String artist, float duration) {
        Song song = new Song(title, artist, duration);
        playList.add(song);
    }

    public List<Song> getPlayList() {
        return this.playList;
    }

     class Song {

        private String title;
        private String artist;
        private float duration;

        public Song(String title, String artist, float dur) {
            this.artist = artist;
            this.duration = dur;
            this.title = title;
        }

        public void setTitle(String title) {
            this.title = title;
        }

        public float getDuration() {
            return duration;
        }

        public String getArtist() {
            return artist;
        }

        public String getTitle() {
            return title;
        }

        public void setArtist(String artist) {
            this.artist = artist;
        }

        public void setDuration(float duration) {
            this.duration = duration;
        }

        public void printSongInfo() {
            System.out.printf("Song Name: %s\nArtist: %s\nDuration of Song: %f", this.title, this.artist, this.duration);
        }
    }

}
