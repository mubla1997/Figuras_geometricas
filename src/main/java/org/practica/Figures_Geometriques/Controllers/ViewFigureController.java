package org.practica.Figures_Geometriques.Controllers;

import org.practica.Figures_Geometriques.DAOs.FigureDAO;
import org.practica.Figures_Geometriques.DAOs.FigureDAOImpl;
import org.practica.Figures_Geometriques.Models.Figure;
import org.practica.Figures_Geometriques.Services.FigureService;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import java.io.IOException;

@WebServlet(value ="/priv/viewFigure")
public class ViewFigureController extends HttpServlet {

    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        HttpSession session = req.getSession();
        FigureDAO figureDAO = new FigureDAOImpl();
        String nameFigure = req.getParameter("name");
        String user_own = req.getParameter("user_own");

        Figure figure = figureDAO.getFigure(nameFigure,user_own);

        session.setAttribute("viewFigure",figure);

        RequestDispatcher dispatcher = req.getRequestDispatcher("/WEB-INF/jsp/ViewFigureUser.jsp");
        dispatcher.forward(req, resp);
    }

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {

        RequestDispatcher dispatcher = req.getRequestDispatcher("/WEB-INF/jsp/Draw.jsp");
        dispatcher.forward(req, resp);
    }
}
