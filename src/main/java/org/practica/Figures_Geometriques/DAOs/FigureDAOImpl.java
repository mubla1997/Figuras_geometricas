package org.practica.Figures_Geometriques.DAOs;

import org.practica.Figures_Geometriques.Models.Figure;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class FigureDAOImpl implements FigureDAO {

    Database db = new Database();

    @Override
    public Figure getFigure(String nameFigure, String username_own) {
        Connection con = db.getConnection();

        try{
            PreparedStatement preparedStatement = con.prepareStatement("select * from figura where name=? and username_own=?;");
            preparedStatement.setString(1,nameFigure);
            preparedStatement.setString(2,username_own);
            ResultSet rs = preparedStatement.executeQuery();

            if(rs.next()){
                Figure figure = new Figure();
                figure.setName(rs.getString(1));
                figure.setTypeFigure(rs.getString(2));
                figure.setCoordenateY(rs.getInt(3));
                figure.setCoordenateY(rs.getInt(4));
                figure.setSize(rs.getInt(5));
                figure.setColor(rs.getString(6));
                figure.setUsername_own(rs.getString(7));

                preparedStatement.close();
                rs.close();
                con.close();
                return figure;
            }
        }catch (Exception e){
            e.printStackTrace();
        }
        return null;
    }

    @Override
    public List <Figure> showFigures() {

        Connection con = db.getConnection();
        List<Figure> listFigures = new ArrayList <>();

        try{
            PreparedStatement preparedStatement = con.prepareStatement("select * from figura");
            ResultSet rs = preparedStatement.executeQuery();

            while(rs.next()){
                Figure figure = new Figure();
                figure.setName(rs.getString(1));
                figure.setTypeFigure(rs.getString(2));
                figure.setCoordenateY(rs.getInt(3));
                figure.setCoordenateY(rs.getInt(4));
                figure.setSize(rs.getInt(5));
                figure.setColor(rs.getString(6));
                figure.setUsername_own(rs.getString(7));

                listFigures.add(figure);
            }

            preparedStatement.close();
            con.close();
            return listFigures;

        }catch (Exception e){
            e.printStackTrace();
        }
        return null;
    }

    @Override
    public List <Figure> showFiguresUser(String username) {
        Connection con = db.getConnection();
        List<Figure> listFiguresUser = new ArrayList <>();

        try{
            PreparedStatement preparedStatement = con.prepareStatement("select * from figura where username_own=?;");
            preparedStatement.setString(1,username);
            ResultSet rs = preparedStatement.executeQuery();

            while(rs.next()){
                Figure figure = new Figure();
                figure.setName(rs.getString(1));
                figure.setTypeFigure(rs.getString(2));
                figure.setCoordenateY(rs.getInt(3));
                figure.setCoordenateY(rs.getInt(4));
                figure.setSize(rs.getInt(5));
                figure.setColor(rs.getString(6));
                figure.setUsername_own(rs.getString(7));

                listFiguresUser.add(figure);
            }

            preparedStatement.close();
            con.close();
            return listFiguresUser;

        }catch (Exception e){
            e.printStackTrace();
        }
        return null;
    }

    @Override
    public void createFigure(Figure figure) {
        Connection con = db.getConnection();

        try{
            PreparedStatement preparedStatement = con.prepareStatement("insert into figura values(?,?,?,?,?,?,?");
            preparedStatement.setString(1,figure.getName());
            preparedStatement.setString(2,figure.getTypeFigure());
            preparedStatement.setInt(3,figure.getCoordenateX());
            preparedStatement.setInt(4,figure.getCoordenateY());
            preparedStatement.setInt(5,figure.getSize());
            preparedStatement.setString(6,figure.getColor());
            preparedStatement.setString(7,figure.getUsername_own());

            preparedStatement.execute();
            preparedStatement.close();

        }catch (Exception e){
            e.printStackTrace();
        }
    }

    @Override
    public void deleteFigure(Figure figure) {
        Connection con = db.getConnection();

        try{
            PreparedStatement preparedStatement = con.prepareStatement("delete from figura where nom=? and username_own=?;");
            preparedStatement.setString(1,figure.getName());
            preparedStatement.setString(2,figure.getUsername_own());
            preparedStatement.execute();
            preparedStatement.close();

        }catch (Exception e){
            e.printStackTrace();
        }
    }
}
