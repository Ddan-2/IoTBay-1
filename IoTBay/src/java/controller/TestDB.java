package controller;


import java.sql.*;

import java.util.*;

import java.util.logging.*;
import model.dao.DBConnector;
import model.dao.DBManager;

public class TestDB {

    private static Scanner in = new Scanner(System.in);


    public static void main(String[] args) throws SQLException {
        try {
            DBConnector connector = new DBConnector();
            Connection conn = connector.openConnection();
            DBManager db = new DBManager(conn);
            System.out.println("Start");
            System.out.println("Card Owner Name: ");
            String name = in.nextLine();

            System.out.println("Card Number: ");

            String cardNumber = in.nextLine();

            System.out.println("PCard Expiry Date: ");

            String expiryDate = in.nextLine();

            System.out.println("Card CVV: ");
            String cvv = in.nextLine();

            System.out.println("Email: ");
            String userEmail = in.nextLine();

            

            
//NAME, ADDRESS, PHONE, DOB, EMAIL, PASSWORD"

            db.addPayment(name, cardNumber, expiryDate, cvv, userEmail);
            System.out.println("Payment Dateil is added to the database.");

            connector.closeConnection();

        } catch (ClassNotFoundException | SQLException ex) {
            Logger.getLogger(TestDB.class.getName()).log(Level.SEVERE, null, ex);
        }    
        
        
    }
    
    

    private void runQueries() throws SQLException {
//        testAdd();
    }

//    private void testAdd() {
//        try {
//
//            System.out.print("User name: ");
//
//            String name = in.nextLine();
//
//            System.out.print("User address: ");
//
//            String address = in.nextLine();
//
//            System.out.print("User phone: ");
//
//            String phone = in.nextLine();
//
//            System.out.print("User dob: ");
//
//            String dob = in.nextLine();
//
//            System.out.print("User email: ");
//
//            String email = in.nextLine();
//            System.out.print("User password: ");
//
//            String password = in.nextLine();
////NAME, ADDRESS, PHONE, DOB, EMAIL, PASSWORD"
//
//            db.addUser(name, address, phone, dob, email, password);
//            System.out.println("User is added to the database.");
//
//            connector.closeConnection();
//
//        } catch (SQLException ex) {
//
//            Logger.getLogger(TestDB.class.getName()).log(Level.SEVERE, null, ex);
//        }
//    }
}
