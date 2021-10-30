package org.practica.Figures_Geometriques.DAOs;

import org.practica.Figures_Geometriques.Models.User;

import java.sql.SQLException;
import java.util.List;


public interface UserDAO {

    User getUser(String username);
    List<User> getUsers();
    void createUser(User user) throws SQLException;
}
