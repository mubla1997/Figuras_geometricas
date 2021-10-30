package org.practica.Figures_Geometriques.Services;

import org.practica.Figures_Geometriques.DAOs.UserDAO;
import org.practica.Figures_Geometriques.DAOs.UserDAOImpl;
import org.practica.Figures_Geometriques.Models.User;

import java.sql.SQLException;
import java.util.List;

public class LoginService {
    UserDAO userDAO = new UserDAOImpl();
    List<User> userList = userDAO.getUsers();

    public boolean userOk(String username, String password){
        User user = userDAO.getUser(username);

        if (username == null || password == null) return false;
        if(user == null) return false;

        if (password.equals(user.getPassword())) return true;
        return false;
    }

    public boolean createUserOk(String username, String password) throws SQLException {

        for(User us : userList){
            if(us.getUsername().equals(username)){
                return false;
            }
        }
        User user = new User();
        user.setUsername(username);
        user.setPassword(password);
        userDAO.createUser(user); //Exception
        return true;
    }
}
