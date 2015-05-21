package com.pkokoshnikov.state.help;

import com.pkokoshnikov.state.MainMenuState;
import com.pkokoshnikov.state.State;
import com.pkokoshnikov.Key;
import com.pkokoshnikov.state.MainMenuState;
import com.pkokoshnikov.state.State;
import com.pkokoshnikov.state.MainMenuState;
import com.pkokoshnikov.state.State;

public class InfoHelpRoomState implements State {

    @Override
    public String getMessage() {
        return "The service provides ability to listen and buy music content!!!\n" +
                "Press 2 to exit to menu information \n" +
                "Press * to exit main menu , press # to return to previous menu";
    }

    @Override
    public State getNextState(Key key, Integer userId) {
        switch (key) {
            case two:
                return new PriceHelpRoomState();
            case grid:
                return new MenuHelpRoomState();
            case star:
                return new MainMenuState();
            default:
                return this;
        }
    }
}
