package com.pkokoshnikov.state;

import com.pkokoshnikov.database.Song;
import com.pkokoshnikov.database.Song;
import com.pkokoshnikov.database.Song;

import java.util.*;

public class StatePlayingSong {
    private String name;
    private Integer songId;
    private Iterator<String> iterator;

    StatePlayingSong(Song song) {
        ArrayList<String> splitText = new ArrayList<String>();
        Collections.addAll(splitText, song.getText().split("\\r?\\n"));
        name = song.getName();
        songId = song.getSongId();
        iterator = splitText.iterator();
    }

    public boolean hasNext() {
        return iterator.hasNext();
    }

    public String next() {
        return iterator.next();
    }

    public String getNameOfSong() {
        return name;
    }

    public Integer getSongId() {
        return songId;
    }
}
