/*
 * Copyright (C) 2016 The Android Open Source Project
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *      http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
package com.example.android.musicalapp;

/**
 * {@link SongList} represents a single list of Siousxie and the Banshees songs.
 * Each object has 3 properties: song name, album name, and image resource ID.
 */
public class SongList {

    // Name of the Artist (e.g. Siousxie, Mary Wells, etc)
    private String mArtistName;

    // Artist song name (e.g. painted bird, slowdive, etc)
    private String mArtistSong;

    // Drawable resource ID
    private int mImageResourceId;

    /*
    * Create a new SongList object.
    *
    * @param vName is the name of the Artist Name (e.g. Siousxie)
    * @param vNumber is the corresponding Artist song name (e.g. painted bird, slow dive, she's a carnaval)
    * @param image is drawable reference ID that corresponds to the Artist name
    * */
    public SongList(String vName, String vNumber, int imageResourceId) {
        mArtistName = vName;
        mArtistSong = vNumber;
        mImageResourceId = imageResourceId;
    }

    /**
     * Get the name of the Artist name
     */
    public String getVersionName() {
        return mArtistName;
    }

    /**
     * Get the Artist song
     */
    public String getVersionNumber() {
        return mArtistSong;
    }

    /**
     * Get the image resource ID
     */
    public int getImageResourceId() {
        return mImageResourceId;
    }


}
