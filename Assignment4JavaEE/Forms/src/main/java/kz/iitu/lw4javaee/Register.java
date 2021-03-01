package kz.iitu.lw4javaee;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.validation.ConstraintViolation;
import javax.validation.Validation;
import javax.validation.Validator;
import javax.validation.ValidatorFactory;
import java.io.IOException;
import java.util.Set;

@WebServlet(value = "/registrationPage")
public class Register extends HttpServlet {

    private static final long serialVersionUID = 1L;
    public Register() {
        super();
    }

    public void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException{
        request.getRequestDispatcher("/registrationPage.jsp").forward(request, response);
    }

    public void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {

        try {
            User user = new User();
            user.setName(request.getParameter("name"));
            user.setSurname(request.getParameter("surname"));
            user.setEmail(request.getParameter("email"));
            user.setUsername(request.getParameter("username"));
            user.setPassword(request.getParameter("password"));


            ValidatorFactory validatorFactory = Validation.buildDefaultValidatorFactory();
            Validator validator = validatorFactory.getValidator();
            Set<ConstraintViolation<User>> constraintViolations = validator.validate(user);
            if (!constraintViolations.isEmpty()) {
                String errors = "<ul>";
                for (ConstraintViolation<User> constraintViolation : constraintViolations) {
                    errors += "<li>" + constraintViolation.getPropertyPath() + " " + constraintViolation.getMessage()
                            + "</li>";
                }
                errors += "</ul>";

                request.setAttribute("user", user);
                request.setAttribute("errors", errors);

                request.getRequestDispatcher("registrationPage.jsp").forward(request, response);
            } else {
                request.setAttribute("user", user);
                request.getRequestDispatcher("home2.jsp").forward(request, response);
            }
        } catch (Exception e) {
            request.setAttribute("errors", e.getMessage());
            request.getRequestDispatcher("registrationPage.jsp").forward(request, response);
        }

    }
}
