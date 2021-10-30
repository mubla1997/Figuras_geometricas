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
import java.sql.SQLException;

@WebServlet(value = "/register")
public class RegisterController extends HttpServlet {
    LoginService loginService = new LoginService();

    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        RequestDispatcher dispatcher = req.getRequestDispatcher("/WEB-INF/jsp/Register.jsp");
        dispatcher.forward(req,resp);
    }

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {


        String username = req.getParameter("username");
        String passwd = req.getParameter("password");
        String repPasswd = req.getParameter("repPass");

        boolean register = false;

        try {
            register = loginService.createUserOk(username,passwd);
        } catch (SQLException throwables) {
            throwables.printStackTrace();
        }

        if(!passwd.equals(repPasswd)){
            register = false;
        }
        if(register){
            req.setAttribute("message","User create");
            RequestDispatcher dispatcher = req.getRequestDispatcher("/WEB-INF/jsp/Register.jsp");
            dispatcher.forward(req,resp);
            return;
        }

        req.setAttribute("message","Error to create user");
        RequestDispatcher dispatcher = req.getRequestDispatcher("/WEB-INF/jsp/Register.jsp");
        dispatcher.forward(req,resp);
    }
}
