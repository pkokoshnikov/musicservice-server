package com.pkokoshnikov.state;

import com.pkokoshnikov.Key;

public interface State {
    public String getMessage();

    public State getNextState(Key key, Integer userId);
}
