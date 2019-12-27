package webapp;

import layer.User;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;

@WebServlet(name = "login")
public class login extends HttpServlet {
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        User user = new User();

        request.setAttribute("username",request.getParameter("loginName"));
        request.setAttribute("password",request.getParameter("password"));

        if(user.isValidUser(request.getParameter("loginName"),request.getParameter("password"))){
            request.getRequestDispatcher("/welcome.jsp").forward(request,response);
        }
        request.setAttribute("errorMessage","Invalid login and password. Try again");
        request.getRequestDispatcher("/login.jsp").forward(request,response);

    }

    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        PrintWriter out = response.getWriter();
        out.println("login-name: " + request.getParameter("loginName") + "password: " + request.getParameter("password"));
    }
}
