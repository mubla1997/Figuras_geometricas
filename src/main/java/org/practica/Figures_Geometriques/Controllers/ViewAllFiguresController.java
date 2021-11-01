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
import javax.servlet.http.HttpSession;
import java.io.IOException;
import java.util.List;

@WebServlet(value="/priv/viewAllFigures")
public class ViewAllFiguresController extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        FigureDAO figureDAO = new FigureDAOImpl();
        List<Figure> listFigure =figureDAO.showFigures();
        HttpSession session = req.getSession();

        session.setAttribute("listFigures", listFigure);

        RequestDispatcher dispatcher = req.getRequestDispatcher("/WEB-INF/jsp/ViewAllFigures.jsp");
        dispatcher.forward(req, resp);
    }

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        RequestDispatcher dispatcher = req.getRequestDispatcher("/WEB-INF/jsp/ViewAllFigures.jsp");
        dispatcher.forward(req, resp);
    }
}
