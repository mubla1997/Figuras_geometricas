package org.practica.Figures_Geometriques.DAOs;

import org.practica.Figures_Geometriques.Models.User;

import java.util.List;

public interface UserDAO {
    List<User> getUsers();
    User getUser(String username);
}
