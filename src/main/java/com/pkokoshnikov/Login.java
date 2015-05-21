package com.pkokoshnikov;

import com.pkokoshnikov.database.UserDAO;
import com.pkokoshnikov.state.State;

import javax.ws.rs.FormParam;
import javax.ws.rs.POST;
import javax.ws.rs.Path;
import java.util.concurrent.ConcurrentHashMap;

@Path("/login")
public class Login {

    @POST
    public String login(@FormParam("id") final Integer id) {
        final ConcurrentHashMap<Integer, State> stateMap = ServletContextClass.getStateMap();
        if (stateMap.get(id) != null) {
            return "FAILED: the user with such id already works with service";
        }
        UserDAO userDAO = new UserDAO();
        return userDAO.tryLogin(id);
    }
}
