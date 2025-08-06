package com.mycompany.formservlet;

import com.mycompany.ejb.SignupBeanLocal;
import jakarta.annotation.Resource;
import java.io.IOException;
import java.io.PrintWriter;
import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import jakarta.validation.ConstraintViolation;
import java.util.logging.Level;
import java.util.logging.Logger;
import jakarta.validation.Validator;
import java.lang.reflect.InvocationTargetException;
import javax.naming.InitialContext;
import javax.naming.NamingException;
import org.apache.commons.beanutils.BeanUtils;//Bean.populate

@WebServlet(name = "SignUpServlet", urlPatterns = {"/SignUpServlet"})
public class SignUpServlet extends HttpServlet {

    @Resource
    Validator validator;

    protected void processRequest(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        response.setContentType("text/html;charset=UTF-8");
        try (PrintWriter out = response.getWriter()) {

            out.println("<!DOCTYPE html>");
            out.println("<html>");
            out.println("<head>");
            out.println("<title>Servlet SingUp</title>");
            out.println("</head>");
            out.println("<body>");

            //SignupBeanLocal bean = (SignupBeanLocal) new InitialContext().lookup(
            //        "java:global/formServlets/SignupBean");
            // using module if servlet and EJB in same .war
            SignupBeanLocal bean = (SignupBeanLocal) new InitialContext().lookup("java:module/SignupBean");

            try {
                out.println("<h1>Dades rebudes del formulari</h1>");
                BeanUtils.populate(bean, request.getParameterMap());
                out.println("<p>" + bean.print() + "</p>");
            } catch (IllegalAccessException | InvocationTargetException e) {
                out.println(e.getMessage());
            }

            out.println("<h1>Llistat de validacions:</h1>");

            for (ConstraintViolation c : validator.validate(bean)) {
                out.println("<p>" + c.getMessage() + "</p>");
            }

            out.println("</body>");
            out.println("</html>");
        } catch (NamingException ex) {
            Logger.getLogger(SignUpServlet.class.getName()).log(Level.SEVERE, null, ex);
        }

    }

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        processRequest(request, response);
    }
}
