package org.practica.Figures_Geometriques.DAOs;

import org.practica.Figures_Geometriques.Models.User;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;


public class UserDAOImpl implements UserDAO {

    Database db = new Database();

    @Override
    public User getUser(String username) {
        Connection con = db.getConnection();

        try{

            PreparedStatement preparedStatement = con.prepareStatement("Select * from usuari where username=?;");
            preparedStatement.setString(1,username);
            ResultSet rs = preparedStatement.executeQuery();

            if(rs.next()){
                String us = rs.getString(1);
                String passwd = rs.getString(2);

                User user = new User();
                user.setUsername(us);
                user.setPassword(passwd);

                preparedStatement.close();

                return user;
            }
        }catch (Exception e){
            e.printStackTrace();
        }
        return null;
    }
    @Override
    public List <User> getUsers() {
        Connection con = db.getConnection();

        try{

            PreparedStatement preparedStatement = con.prepareStatement("Select * from usuari;");
            ResultSet rs = preparedStatement.executeQuery();
            List<User> listUsers = new ArrayList <>();


            while(rs.next()){

                User user = new User();
                user.setUsername(rs.getString(1));
                user.setPassword(rs.getString(2));
                listUsers.add(user);
            }
            preparedStatement.close();
            return listUsers;

        }catch (Exception e){
            e.printStackTrace();
        }
        return null;
    }

    @Override
    public void createUser(User user)  {
        Connection con = db.getConnection();

        try {
            PreparedStatement preparedStatement =
            con.prepareStatement("insert into usuari('username','passwd') values (?,?);");
            
            preparedStatement.setString(1, user.getUsername());
            preparedStatement.setString(2, user.getPassword());
            preparedStatement.execute();
            preparedStatement.close();
            con.close();

        }catch (Exception e){
            e.printStackTrace();
        }
    }
}
