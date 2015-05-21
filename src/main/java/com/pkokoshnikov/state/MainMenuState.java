package com.pkokoshnikov.state;

import com.pkokoshnikov.Key;
import com.pkokoshnikov.state.manage.MenuManageRoomState;
import com.pkokoshnikov.state.help.MenuHelpRoomState;
import com.pkokoshnikov.state.play.MenuPlayRoomState;

public class MainMenuState implements State {

    @Override
    public String getMessage() {
        return "Choose section: 1 - to listen, 2 - to enter to private office, 3 - help";
    }

    @Override
    public State getNextState(Key key, Integer userId) {
        switch (key) {
            case one:
                return new MenuPlayRoomState();
            case two:
                return new MenuManageRoomState();
            case three:
                return new MenuHelpRoomState();
            default:
                return this;
        }
    }
}
