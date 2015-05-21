package com.pkokoshnikov;

import com.pkokoshnikov.state.MainMenuState;
import com.pkokoshnikov.state.State;
import com.pkokoshnikov.state.MainMenuState;
import com.pkokoshnikov.state.State;
import com.pkokoshnikov.state.MainMenuState;
import com.pkokoshnikov.state.State;

import javax.servlet.ServletContext;
import javax.ws.rs.*;
import javax.ws.rs.core.Context;
import java.util.concurrent.ConcurrentHashMap;

@Path("/nextstate")
public class NextState {

    @Context
    ServletContext servletContext;

    @POST
    public String next(@FormParam("id") final Integer id, @FormParam("key") final String key) {

        final ConcurrentHashMap<Integer, State> stateMap = ServletContextClass.getStateMap();
        final State nextState = getNextState(stateMap, id, Key.valueOf(key));
        stateMap.put(id, nextState);
        return nextState.getMessage();
    }

    private State getNextState(final ConcurrentHashMap<Integer, State> stateMap, final Integer userId, final Key key) {
        final State currentState = stateMap.get(userId);
        if (currentState == null) {
            return new MainMenuState();
        } else {
            return currentState.getNextState(key, userId);
        }
    }
}

