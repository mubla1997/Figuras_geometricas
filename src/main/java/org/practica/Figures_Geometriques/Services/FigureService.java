package org.practica.Figures_Geometriques.Services;

import org.practica.Figures_Geometriques.DAOs.FigureDAO;
import org.practica.Figures_Geometriques.DAOs.FigureDAOImpl;
import org.practica.Figures_Geometriques.Models.Figure;

import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;
import java.util.Date;
import java.util.List;

public class FigureService {

    FigureDAO figureDAO = new FigureDAOImpl();

    public void verifyFigure(String name, String typeFigure, String color, int size, int coordenateX, int coordenateY, HttpServletRequest req){
        HttpSession session = req.getSession();
        List<Figure> listFigures = figureDAO.showFiguresUser((String) session.getAttribute("usermame"));
        String message ="";
        boolean verify = true;

        if(coordenateX < 0  || coordenateX >= 1024){
            message = "X coordinate must be greater than 0 and lees than 1024.";
            session.setAttribute("message",message);
            verify = false;
        } else if(coordenateY < 0  || coordenateX >= 768){
            message = "Y coordinate must be greater than 0 and lees than 768.";
            session.setAttribute("message",message);
            verify = false;
        } else if(size <= 0){
            message = "Size must be greater than 0.";
            session.setAttribute("message",message);
            verify = false;
        } else if(name.equals("")){
            name = typeFigure + Math.round(Math.random() * 9999);
            while(!verifyName(listFigures, name)){
                name = typeFigure + Math.round(Math.random() * 9999);
            }
            } else if (!verifyName(listFigures, name)) {
            message = "This name already exists.";
            session.setAttribute("message",message);
            verify = false;
        }

        if(verify){
            message = null;
            session.setAttribute("nombre", name);
            session.setAttribute("opcionFigura", typeFigure);
            session.setAttribute("opcionColor", color);
            session.setAttribute("tamany", size);
            session.setAttribute("coordenadaX",coordenateX);
            session.setAttribute("coordenadaY", coordenateY);

            Figure figure = new Figure();
            figure.setName(name);
            figure.setTypeFigure(typeFigure);
            figure.setColor(color);
            figure.setSize(size);
            figure.setCoordenateX(coordenateX);
            figure.setCoordenateY(coordenateY);
            figure.setUsername_own((String) session.getAttribute("username"));
            figureDAO.createFigure(figure);
        }

    }
    boolean verifyName(List<Figure> listFigure, String name){
        for(Figure figure : listFigure){
            if(figure.getName().equals(name)){
                return false;
            }
        }
        return true;
    }
}
