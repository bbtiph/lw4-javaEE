package kz.iitu.lw4javaee;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.*;
import java.io.IOException;

@WebServlet(value = "/login")
public class Login extends HttpServlet {
    private static final long serialVersionUID = 1L;



    public void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException{
        request.getRequestDispatcher("loginPage.jsp").forward(request, response);
    }

    public void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        String user = request.getParameter("login");
        String pwd = request.getParameter("pwd");

        if(user.equals("magzhan") && pwd.equals("123456")){
            HttpSession session = request.getSession();
            session.setMaxInactiveInterval(30*60);
            Cookie userName = new Cookie("user", user);
            userName.setMaxAge(30*60);
            response.addCookie(userName);

            response.sendRedirect("home1.jsp");
        }else{
            RequestDispatcher rd = getServletContext().getRequestDispatcher("/loginPage.jsp");
            rd.include(request, response);
        }
    }

}
