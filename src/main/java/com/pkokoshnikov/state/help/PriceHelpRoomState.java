package com.pkokoshnikov.state.help;

import com.pkokoshnikov.state.MainMenuState;
import com.pkokoshnikov.state.State;
import com.pkokoshnikov.Key;
import com.pkokoshnikov.state.MainMenuState;
import com.pkokoshnikov.state.State;
import com.pkokoshnikov.state.MainMenuState;
import com.pkokoshnikov.state.State;

public class PriceHelpRoomState implements State {

    @Override
    public String getMessage() {
        return "All content costs 1$.\n" +
               "Press 1 to exit from information menu\n" +
               "Press * to to main menu, press # - to return to previous menu";
    }

    @Override
    public State getNextState(Key key, Integer userId) {
        switch (key) {
            case one:
                return new InfoHelpRoomState();
            case grid:
                return new MenuHelpRoomState();
            case star:
                return new MainMenuState();
            default:
                return this;
        }
    }
}
