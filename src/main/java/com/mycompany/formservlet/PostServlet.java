/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/JSP_Servlet/Servlet.java to edit this template
 */
package com.mycompany.formservlet;

import com.mycompany.ejb.PostBeanLocal;
import jakarta.ejb.EJB;
import java.io.IOException;
import java.io.PrintWriter;
import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

/**
 *
 * @author JoseAlbertoPortugalO get user values from form send data to EJB to
 * validate(more than 18 years, post between 0-150 words, mail is valid) show
 * validation result
 */
@WebServlet(name = "PostServlet", urlPatterns = {"/PostServlet"})
public class PostServlet extends HttpServlet {

    @EJB // with business logic
    private PostBeanLocal validation;

    /**
     * Processes requests for both HTTP <code>GET</code> and <code>POST</code>
     * methods.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    protected void processRequest(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        response.setContentType("text/html;charset=UTF-8");
        try (PrintWriter out = response.getWriter()) {
            out.println("<!DOCTYPE html>");
            out.println("<html>");
            out.println("<head>");
            out.println("<title>Servlet ServletValidation</title>");
            out.println("</head>");
            out.println("<body>");
            out.println("<h1>EJB validation</h1>");

            String mail = request.getParameter("mail");
            if (validation.isValidEmail(mail)) {
                out.println("<p>El correu electrònic " + mail + " és vàlid</p>");
            } else {
                out.println("<p>El correu electrònic no és vàlid.</p>");
            }

            String age = request.getParameter("age");
            if (validation.isValidAge(age)) {
                out.println("<p>Tens" + age + " anys i pots escriure un missatge a l'aplicació.</p>");
            } else {
                out.println("<p>Has de ser major d'edat per escriure un missatge a l'aplicació.</p>");
            }

            String message = request.getParameter("message");
            if (validation.isValidPost(message)) {
                out.println("<p>El missatge '" + message + "' és vàlid.</p>");
            } else {
                out.println("<p>El missatge no és vàlid. Ha de tenir menys de 150 caràcters.</p>");
            }

            out.println("</body>");
            out.println("</html>");
        }
    }

    // <editor-fold defaultstate="collapsed" desc="HttpServlet methods. Click on the + sign on the left to edit the code.">
    /**
     * Handles the HTTP <code>GET</code> method.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        processRequest(request, response);
    }

    /**
     * Handles the HTTP <code>POST</code> method.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        processRequest(request, response);
    }

    /**
     * Returns a short description of the servlet.
     *
     * @return a String containing servlet description
     */
    @Override
    public String getServletInfo() {
        return "Short description";
    }// </editor-fold>

}
