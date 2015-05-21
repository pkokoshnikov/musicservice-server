package com.pkokoshnikov;

import com.pkokoshnikov.state.State;
import com.pkokoshnikov.state.State;
import com.pkokoshnikov.state.State;

import javax.ws.rs.FormParam;
import javax.ws.rs.POST;
import javax.ws.rs.Path;
import java.util.concurrent.ConcurrentHashMap;

@Path("/logout")
public class Logout {

    @POST
    public void login(@FormParam("id") final Integer id) {
        final ConcurrentHashMap<Integer, State> stateMap = ServletContextClass.getStateMap();
        stateMap.remove(id);
    }
}
