package org.practica.Figures_Geometriques.Controllers;

import org.practica.Figures_Geometriques.Models.Figure;
import org.practica.Figures_Geometriques.Services.FigureService;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.util.List;

@WebServlet(value ="/indice")
public class IndiceServlet extends HttpServlet {
    FigureService figureService = new FigureService();
    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        RequestDispatcher dispatcher = req.getRequestDispatcher("/WEB-INF/jsp/Indice.jsp");
        dispatcher.forward(req,resp);
    }

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        String name = req.getParameter("nombre");
        String typefigure = req.getParameter("opcionFigura");
        String color = req.getParameter("opcionColor");
        int size = Integer.parseInt(req.getParameter("tamany"));
        int coordenateX = Integer.parseInt(req.getParameter("coordenadaX"));
        int coordenateY = Integer.parseInt(req.getParameter("coordenadaY"));



        figureService.verifyFigure(name,typefigure,color,size,coordenateX,coordenateY,req);
        RequestDispatcher dispatcher = req.getRequestDispatcher("/WEB-INF/jsp/Post.jsp");
        dispatcher.forward(req, resp);
    }
}
