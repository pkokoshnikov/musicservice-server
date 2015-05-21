package com.pkokoshnikov.state.manage;

import com.pkokoshnikov.state.MainMenuState;
import com.pkokoshnikov.state.State;
import com.pkokoshnikov.state.StatePlayingList;
import com.pkokoshnikov.Key;
import com.pkokoshnikov.database.SongUserListDAO;
import com.pkokoshnikov.state.MainMenuState;
import com.pkokoshnikov.state.State;
import com.pkokoshnikov.state.StatePlayingList;
import com.pkokoshnikov.state.MainMenuState;
import com.pkokoshnikov.state.State;
import com.pkokoshnikov.state.StatePlayingList;

public class PlayingManageRoomState implements State {

    public static final String YOUR_LIST_IS_EMPTY = "Your list is empty";
    private StatePlayingList statePlayingList;
    private String message;
    private Integer userId;
    private final SongUserListDAO songUserListDAO;

    public PlayingManageRoomState(Integer userId) {
        songUserListDAO = new SongUserListDAO(userId);
        this.statePlayingList = new StatePlayingList(songUserListDAO);
        if (!statePlayingList.isEmpty()) {
            message = statePlayingList.getNameOfSong();
        } else {
            message = YOUR_LIST_IS_EMPTY;
        }
        this.userId = userId;
    }

    @Override
    public String getMessage() {
        return message;
    }

    @Override
    public State getNextState(Key key, Integer userId) {

        switch (key) {
            case one:
                return playNextSong();
            case two:
                return deleteSong();
            case star:
                return new MainMenuState();
            case play:
                return playNextLine();
            default:
                return this;
        }
    }

    private State deleteSong() {
        message = statePlayingList.getNameOfSong().replaceFirst("#play#", "The song") + "\n" +
                "was deleted from your record library\n";
        songUserListDAO.deleteSong(statePlayingList.getCurrentSongId());
        statePlayingList.nextTrack();
        if (statePlayingList.isEmpty()) {
            message += YOUR_LIST_IS_EMPTY;
            return this;
        } else {
            message += statePlayingList.getNameOfSong();
            return this;
        }
    }

    private State playNextLine() {
        if (statePlayingList.isEmpty()) {
            message = YOUR_LIST_IS_EMPTY;
            return this;
        } else {
            if (statePlayingList.next()) message = statePlayingList.getLineOfSong();
            else message = statePlayingList.getNameOfSong();
            return this;
        }
    }

    private State playNextSong() {
        if (statePlayingList.isEmpty()) {
            message = YOUR_LIST_IS_EMPTY;
            return this;
        } else {
            statePlayingList.nextTrack();
            message = statePlayingList.getNameOfSong();
            return this;
        }
    }
}
