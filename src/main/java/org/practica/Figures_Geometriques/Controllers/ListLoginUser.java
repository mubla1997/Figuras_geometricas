package org.practica.Figures_Geometriques.Controllers;

import org.practica.Figures_Geometriques.DAOs.FigureDAO;
import org.practica.Figures_Geometriques.DAOs.FigureDAOImpl;
import org.practica.Figures_Geometriques.DAOs.UserDAO;
import org.practica.Figures_Geometriques.Models.Figure;
import org.practica.Figures_Geometriques.Services.FigureService;
import org.practica.Figures_Geometriques.Services.LoginService;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import java.io.IOException;
import java.util.List;

@WebServlet(value ="/priv/list")
public class ListLoginUser extends HttpServlet {
   List<Figure> listFigures;
    HttpSession session;
    FigureDAO figureDAO;
    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {

        session = req.getSession();
        figureDAO = new FigureDAOImpl();
        listFigures = figureDAO.showFiguresUser((String) session.getAttribute("username"));
        session.setAttribute("listFigures", listFigures);

        RequestDispatcher dispatcher = req.getRequestDispatcher("/WEB-INF/jsp/ViewListLogin.jsp");
        dispatcher.forward(req,resp);
    }

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
            figureDAO = new FigureDAOImpl();

            String nameFigure = req.getParameter("nom");

            Figure figure = figureDAO.getFigure(nameFigure, (String) session.getAttribute("username"));
            figureDAO.deleteFigure(figure);

            RequestDispatcher dispatcher = req.getRequestDispatcher("/WEB-INF/jsp/ViewListLogin.jsp");
            dispatcher.forward(req,resp);

    }
}
