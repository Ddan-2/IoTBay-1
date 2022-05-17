/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package controller;

import java.io.IOException;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import model.Payment;
import model.User;
import model.dao.DBManager;

/**
 *
 * @author dan
 */
public class PaymentServlet extends HttpServlet {

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        //1- retrieve the current session
        HttpSession session = request.getSession();
        //2- create an instance of the Validator class  
        Validator validator = new Validator();
        //3- capture the posted information      
        String cardNumber = request.getParameter("carNumber");
        String expiryDate = request.getParameter("expiryDate");
        String cvv = request.getParameter("cvv");
        String email = request.getParameter("email");

        //5- retrieve the manager instance from session  
        DBManager db;
        db = (DBManager) session.getAttribute("manager");
        validator.clear(session);

        try {
            User exists = db.findUser(email);
            if (exists != null) {
                session.setAttribute("existErr", "There is already account connected to this email.");
                request.getRequestDispatcher("register.jsp").include(request, response);
            } else {

                request.getRequestDispatcher("PaymentDetails.jsp").include(request, response);
            }
        } catch (SQLException ex) {
            Logger.getLogger(RegisterServlet.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
}
