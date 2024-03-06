/**
 * Name: Sicheng Yu
 * Course: CS-665 Software Designs & Patterns
 * Date: 03/05/2024
 * File Name: ReturningCustomer.java
 * Description: This is the class handle email send to ReturningCustomer.
 */
public class ReturningCustomer implements Customer{
    @Override
    public String generateEmail() {
        System.out.println("Email sent.");
        return "Thank you for coming back!";
    }
}
