package org.practica.Figures_Geometriques.Controllers;

import org.practica.Figures_Geometriques.DAOs.FigureDAO;
import org.practica.Figures_Geometriques.DAOs.FigureDAOImpl;
import org.practica.Figures_Geometriques.Models.Figure;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

@WebServlet(value ="/list")
public class ListLoginUser extends HttpServlet {
    FigureDAO figureDAO = new FigureDAOImpl();
    List<Figure> ListFigures = figureDAO.showFigures();

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        req.setAttribute("list", ListFigures);
        RequestDispatcher dispatcher = req.getRequestDispatcher("/WEB-INF/jsp/LoginForm.jsp");
        dispatcher.forward(req,resp);
    }
}
