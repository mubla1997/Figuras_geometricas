package org.practica.Figures_Geometriques.DAOs;

import org.practica.Figures_Geometriques.Models.User;

import java.util.List;

public class UserDAOImpl implements UserDAO {
    @Override
    public List <User> getUsers() {
        return null;
    }

    @Override
    public User getUser(String username) {

        User user = new User();
        user.setUsername("pablo");
        user.setPassword("1234");
        return user;
    }
}
