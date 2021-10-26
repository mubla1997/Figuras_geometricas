package org.practica.Figures_Geometriques.DAOs;

import org.practica.Figures_Geometriques.Models.User;

import java.util.ArrayList;
import java.util.List;


public class UserDAOImpl implements UserDAO {
    List<User> listUsers = new ArrayList <>();

    public UserDAOImpl(){
        User user = new User();
        user.setUsername("pablo");
        user.setPassword("1234");
        listUsers.add(user);

        user = new User();
        user.setUsername("manolo");
        user.setPassword("12");
        listUsers.add(user);

        user = new User();
        user.setUsername("mikel");
        user.setPassword("123");
        listUsers.add(user);
    }
    @Override
    public User getUser(String username) {

        for (int i = 0; i < listUsers.size(); i++) {
            User  u = listUsers.get(i);
            if(u.getUsername().equals(username)){
                return u;
            }
        }
        return null;
    }
}
