/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package model;

/**
 *
 * @author dan
 */
public class Payment {
    private String orderID;
    private String name;
    private String cardNumber;
    private String expiryDate;
    private String cvv;
    private User user;
    private String userEmail;
  
    
public Payment(String cardNumber, String expiryDate, String cvv, String userEmail) {
        this.cardNumber = cardNumber;
        this.expiryDate = expiryDate;
        this.cvv = cvv;
        this.userEmail = userEmail;
       }

//    public String getorderID() {
//        return order.getOrderID();
//    }

    public String getname() {
        return user.getName();
    }

    public String getcardNumber() {
        return cardNumber;
    }

    public String getexpiryDate() {
        return expiryDate;
    }

    public String getcvv() {
        return cvv;
    }
    public String getuserEmail() {
        return userEmail;
    }



    public void setcardNumber(String cardNumber) {
        this.cardNumber = cardNumber;
    }

    public void setexpiryDate(String expiryDate) {
        this.expiryDate = expiryDate;
    }

    public void setcvv(String cvv) {
        this.cvv = cvv;
    }
    public void setuserEmail(String userEmail) {
        this.userEmail = userEmail;
    }

   
}
