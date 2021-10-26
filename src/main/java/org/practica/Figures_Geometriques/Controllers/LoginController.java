package org.practica.Figures_Geometriques.Controllers;

import org.practica.Figures_Geometriques.Services.LoginService;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import java.io.IOException;
import java.io.Writer;

@WebServlet(value = "/login")
public class LoginController extends HttpServlet {
    LoginService loginService = new LoginService();

    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        RequestDispatcher dispatcher = req.getRequestDispatcher("/WEB-INF/jsp/LoginForm.jsp");
        dispatcher.forward(req,resp);
    }

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        String username = req.getParameter("username");
        String password = req.getParameter("password");

        if(loginService.userOk(username,password)){
            HttpSession session = req.getSession();
            session.setAttribute("auth",true);
            session.setAttribute("username",username);

            RequestDispatcher dispatcher = req.getRequestDispatcher("/WEB-INF/jsp/LoginOk.jsp");
            dispatcher.forward(req,resp);
            return;
        }

        req.setAttribute("message","username or password incorrect");
        RequestDispatcher dispatcher = req.getRequestDispatcher("/WEB-INF/jsp/LoginForm.jsp");
        dispatcher.forward(req,resp);
    }
}
