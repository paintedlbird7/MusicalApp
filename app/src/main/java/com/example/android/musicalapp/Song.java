package com.example.android.musicalapp;

/**
 * Created by rosaperez on 6/10/18.
 */


public class Song {

    private String mDefaultSong;

    private String mSiouxsieSong;

    public Song(String defaultSong, String siouxsieSong){
        mDefaultSong = defaultSong;
        mSiouxsieSong = siouxsieSong;
    }

    public Song(String s, String s1, int mary) {
    }


    public String getDefaultSong(){
        return mDefaultSong;
    }


    public String getSiouxsieSong() {
        return mSiouxsieSong;
    }


}





