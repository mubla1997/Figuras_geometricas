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

@WebServlet(value ="/ViewFigure")
public class ViewFigureController extends HttpServlet {
    FigureService figureService = new FigureService();

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        String name = req.getParameter("nombre");
        String Typefigure = req.getParameter("opcionFigura");
        String color = req.getParameter("opcionColor");
        int size = Integer.parseInt(req.getParameter("tamany"));
        int coordenateX = Integer.parseInt(req.getParameter("coordenadaX"));
        int coordenateY = Integer.parseInt(req.getParameter("coordenadaY"));

        req.setAttribute("name",name);
        req.setAttribute("figure",Typefigure);
        req.setAttribute("color",color);
        req.setAttribute("size",size);
        req.setAttribute("coordenateX",coordenateX);
        req.setAttribute("coordenateY", coordenateY);


        if(figureService.ObtainFigure(name,Typefigure,color,size,coordenateX,coordenateY) == null) {
            Figure CreateFigure = figureService.ObtainFigure(name,Typefigure,color,size,coordenateX,coordenateY);
            req.setAttribute("createFigure", CreateFigure);
            RequestDispatcher dispatcher = req.getRequestDispatcher("/WEB-INF/jsp/Post.jsp");
            dispatcher.forward(req, resp);
            return;
        }
        req.setAttribute("message","Error to create figure");
        RequestDispatcher dispatcher = req.getRequestDispatcher("/WEB-INF/jsp/Post.jsp");
        dispatcher.forward(req, resp);
    }
}
