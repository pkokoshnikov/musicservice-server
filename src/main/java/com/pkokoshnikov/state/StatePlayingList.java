package com.pkokoshnikov.state;

import com.pkokoshnikov.database.LoadSongsList;
import com.pkokoshnikov.database.Song;

import java.util.Iterator;

public class StatePlayingList {
    final private LoadSongsList loadSongsList;
    private Iterator<Song> iterator;
    private StatePlayingSong statePlayingSong;


    public StatePlayingList(LoadSongsList loadSongsList) {
        this.loadSongsList = loadSongsList;
        reloadList();
    }

    public boolean next() {
        if (statePlayingSong.hasNext()) {
            return true;
        } else if (iterator.hasNext()) {
            statePlayingSong = new StatePlayingSong(iterator.next());
        } else reloadList();

        return false;
    }

    private void reloadList() {
        loadSongsList.loadSongsList();
        iterator = loadSongsList.getSongList().iterator();
        if (this.iterator.hasNext()) {
            statePlayingSong = new StatePlayingSong(this.iterator.next());
        }
    }

    public String getNameOfSong() {
        return "#play#" + statePlayingSong.getNameOfSong();
    }

    public String getLineOfSong() {
        return statePlayingSong.next();
    }

    public void nextTrack() {
        if (iterator.hasNext()) {
            statePlayingSong = new StatePlayingSong(iterator.next());
        } else reloadList();
    }

    public boolean isEmpty() {
        return loadSongsList.getSongList().isEmpty();
    }

    public Integer getCurrentSongId() {
        return statePlayingSong.getSongId();
    }
}
