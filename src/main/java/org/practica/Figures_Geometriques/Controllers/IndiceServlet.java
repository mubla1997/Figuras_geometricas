package org.practica.Figures_Geometriques.Controllers;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

@WebServlet(value ="/indice")
public class IndiceServlet extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        RequestDispatcher dispatcher = req.getRequestDispatcher("/WEB-INF/jsp/Indice.jsp");
        dispatcher.forward(req,resp);
    }

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        String name = req.getParameter("nombre");
        String figure = req.getParameter("opcionFigura");
        String color = req.getParameter("opcionColor");
        int size = Integer.parseInt(req.getParameter("tamany"));
        int coordenateX = Integer.parseInt(req.getParameter("coordenadaX"));
        int coordenateY = Integer.parseInt(req.getParameter("coordenadaY"));

        req.setAttribute("name",name);
        req.setAttribute("figure",figure);
        req.setAttribute("color",color);
        req.setAttribute("size",size);
        req.setAttribute("coordenateX",coordenateX);
        req.setAttribute("coordenateY", coordenateY);

        RequestDispatcher dispatcher = req.getRequestDispatcher("/WEB-INF/jsp/Post.jsp");
        dispatcher.forward(req,resp);
    }
}
