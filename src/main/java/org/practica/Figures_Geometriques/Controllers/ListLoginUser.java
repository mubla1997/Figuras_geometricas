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
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

@WebServlet(value ="/list")
public class ListLoginUser extends HttpServlet {
   FigureService figureService = new FigureService();

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {

            RequestDispatcher dispatcher = req.getRequestDispatcher("/WEB-INF/jsp/ViewListLogin.jsp");
            dispatcher.forward(req,resp);
            return;

    }
}
