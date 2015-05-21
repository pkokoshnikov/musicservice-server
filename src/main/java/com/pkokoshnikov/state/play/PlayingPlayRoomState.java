package com.pkokoshnikov.state.play;

import com.pkokoshnikov.state.MainMenuState;
import com.pkokoshnikov.state.State;
import com.pkokoshnikov.state.StatePlayingList;
import com.pkokoshnikov.Key;
import com.pkokoshnikov.database.SongCategoryListDAO;
import com.pkokoshnikov.state.MainMenuState;
import com.pkokoshnikov.state.State;
import com.pkokoshnikov.state.StatePlayingList;
import com.pkokoshnikov.state.MainMenuState;
import com.pkokoshnikov.state.State;
import com.pkokoshnikov.state.StatePlayingList;
import com.pkokoshnikov.state.manage.PlayingManageRoomState;

import static com.pkokoshnikov.state.manage.PlayingManageRoomState.YOUR_LIST_IS_EMPTY;

public class PlayingPlayRoomState implements State {

    private StatePlayingList statePlayingList;
    private String message;
    private final SongCategoryListDAO songCategoryListDAO;

    public PlayingPlayRoomState(String category, Integer userId){
        songCategoryListDAO = new SongCategoryListDAO(category, userId);
        this.statePlayingList = new StatePlayingList(songCategoryListDAO);
        message = "Press 1 during playing of melody to jump next song\n" +
                  "Press 2 - to buy current song. To exit to main menu press *.\n" +
                  "Press # to exit to previous menu. Press 1 to start listen.\n";
    }

    @Override
    public String getMessage() {
        return message;
    }

    @Override
    public State getNextState(Key key, Integer userId) {

        switch(key){
            case one: return playNextSong();
            case two: return addSong();
            case grid: return new MenuPlayRoomState();
            case star: return new MainMenuState();
            case play: return playNextLine();
            default: return this;
        }
    }

    private State addSong() {
        message = statePlayingList.getNameOfSong().replaceFirst("#play#","Song ") + "\n" +
                "was deleted from your record library\n";
        songCategoryListDAO.addSong(statePlayingList.getCurrentSongId());
        statePlayingList.nextTrack();
        message += statePlayingList.getNameOfSong();
        return this;
    }

    private State playNextLine() {
        if(statePlayingList.isEmpty()){
            message = YOUR_LIST_IS_EMPTY;
            return this;
        }
        else{
            if(statePlayingList.next()) message = statePlayingList.getLineOfSong();
            else message = statePlayingList.getNameOfSong();
            return this;
        }
    }

    private State playNextSong() {
        if(statePlayingList.isEmpty()){
            message = YOUR_LIST_IS_EMPTY;
            return this;
        }
        else{
            statePlayingList.nextTrack();
            message = statePlayingList.getNameOfSong();
            return this;
        }
    }
}
