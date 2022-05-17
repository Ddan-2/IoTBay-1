<%-- 
    Document   : payment
    Created on : 18/04/2022, 8:48:27 PM
    Author     : dan
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Payment</title>
        <link type="text/css" rel="stylesheet" href="PaymentStyle.css">
    </head>
    <body>
        <h1>Please enter your payment details</h1>
        <form action="ready.jsp" method="POST" id="payment-form">
            <label for="payment-method">Choose a payment method:</label>
            <select id="payment-method" name="payment-method">
                <option value="visacard">VISA Card</option>
                <option value="mastercard">MasterCard</option>
                <option value="paypal">PayPal</option>
                <option value="applepay">Apple Pay</option>
                <option value="giftcard">Gift Card</option>    
            </select>
            
            <h2>Card Details:</h2>
            <form>
                <label for="fname">First Name</label><br> 
                <input type="text" id="fname" name="fname" value=""><br>
                <label for="lname">Last Name</label><br>
                <input type="text" id="lname" name="lname" value=""><br>
                <label for="CNumber">Card Number</label><br>
                <input type="number" id="CNumber" name="CNumber" value=""><br>
                <label for="EDate">Expiry Date</label><br>
                <input type="EDate" id="EDate" name="EDate" placeholder="mm/yy" required="true"><br>
                <label for="cvv">CVV Code</label><br>
                <input type="password" id="cvv" name="cvv" value=""><br>
            </form>
            
            <div><a href="">Back to Order</a></div>
            <div class="align-right"><a href=""><button type="Next">Next</button></div>
        </form>
    </body>
</html>
