package com.pkokoshnikov.state.manage;

import com.pkokoshnikov.state.MainMenuState;
import com.pkokoshnikov.state.State;
import com.pkokoshnikov.Key;
import com.pkokoshnikov.state.MainMenuState;
import com.pkokoshnikov.state.State;
import com.pkokoshnikov.state.MainMenuState;
import com.pkokoshnikov.state.State;

public class MenuManageRoomState implements State {

    @Override
    public String getMessage() {
        return "You are in menu manage of service and editing personal record library \n" +
               "Press 1 during playing of melody to jump next song \n" +
               "Press 2 to delete current melody. To exit in main menu press *\n" +
               "Press 1 to begin listen your record library.";
    }

    @Override
    public State getNextState(Key key, Integer userId) {
        switch (key) {
            case one:
                return new PlayingManageRoomState(userId);
            case star:
                return new MainMenuState();
            default:
                return this;
        }
    }
}
