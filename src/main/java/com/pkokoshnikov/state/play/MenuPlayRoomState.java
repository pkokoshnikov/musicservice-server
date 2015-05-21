package com.pkokoshnikov.state.play;

import com.pkokoshnikov.Key;
import com.pkokoshnikov.state.State;
import com.pkokoshnikov.Key;
import com.pkokoshnikov.state.State;
import com.pkokoshnikov.Key;
import com.pkokoshnikov.state.State;

public class MenuPlayRoomState implements State {

    @Override
    public String getMessage() {
        return "Catalogue of content. To start listen choose category.\n" +
               "Popular - 1, New - 2, Hits - 3.\n" +
               "To exit press *";
    }

    @Override
    public State getNextState(Key key, Integer userId) {
       switch (key){
           case one: return new PlayingPlayRoomState("popular", userId);
           case two: return new PlayingPlayRoomState("new", userId);
           case three: return new PlayingPlayRoomState("hit", userId);
           default: return this;
       }
    }
}
