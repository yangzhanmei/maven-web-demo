package demo.actions;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

public class LoginServlet extends HttpServlet {

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        String username = req.getParameter("username");
        String password = req.getParameter("password");

        req.getSession().setAttribute("username",username);
        if(username.equals("123") && password.equals("123")) {
            resp.sendRedirect("/");
        }
        else{
            String message = "Invalid username or password";
            req.getSession().setAttribute("message",message);
            resp.sendRedirect("/login.html");
        }
    }
}
