package org.practica.Figures_Geometriques.Services;

import org.practica.Figures_Geometriques.DAOs.UserDAO;
import org.practica.Figures_Geometriques.DAOs.UserDAOImpl;
import org.practica.Figures_Geometriques.Models.User;

public class LoginService {
    UserDAO userDAO = new UserDAOImpl();

    public boolean userOk(String username, String password){
        User user = userDAO.getUser(username);
        if (user == null) return false;

        System.out.println("password: " + password);
        System.out.println("User: " + user.getPassword());

        if (password.equals(user.getPassword())) return true;

        return false;
    }
}
