package com.pkokoshnikov.state.help;

import com.pkokoshnikov.Key;
import com.pkokoshnikov.state.State;
import com.pkokoshnikov.Key;
import com.pkokoshnikov.state.State;
import com.pkokoshnikov.Key;
import com.pkokoshnikov.state.State;

public class MenuHelpRoomState implements State {
    @Override
    public String getMessage() {
        return "Press 1 to retrieve information about service, press 2 to listen information about cost";
    }

    @Override
    public State getNextState(Key key, Integer userId) {
        switch (key) {
            case one:
                return new InfoHelpRoomState();
            case two:
                return new PriceHelpRoomState();
            default:
                return this;
        }
    }
}
