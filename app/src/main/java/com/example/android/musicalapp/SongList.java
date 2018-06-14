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
 * {@link SongList} represents a single Android platform release.
 * Each object has 3 properties: name, version number, and image resource ID.
 */
public class SongList {

    // Name of the Android version (e.g. Gingerbread, Honeycomb, Ice Cream Sandwich)
    private String mArtistName;

    // Android version number (e.g. 2.3-2.7, 3.0-3.2.6, 4.0-4.0.4)
    private String mArtistSong;

    // Drawable resource ID
    private int mImageResourceId;

    /*
    * Create a new SongList object.
    *
    * @param vName is the name of the Android version (e.g. Gingerbread)
    * @param vNumber is the corresponding Android version number (e.g. 2.3-2.7)
    * @param image is drawable reference ID that corresponds to the Android version
    * */
    public SongList(String vName, String vNumber, int imageResourceId) {
        mArtistName = vName;
        mArtistSong = vNumber;
        mImageResourceId = imageResourceId;
    }

    /**
     * Get the name of the Android version
     */
    public String getVersionName() {
        return mArtistName;
    }

    /**
     * Get the Android version number
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
