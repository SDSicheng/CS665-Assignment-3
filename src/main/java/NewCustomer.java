/**
 * Name: Sicheng Yu
 * Course: CS-665 Software Designs & Patterns
 * Date: 03/05/2024
 * File Name: NewCustomer.java
 * Description: This is the class handle email send to NewCustomer.
 */
public class NewCustomer implements Customer{
    @Override
    public String generateEmail() {
        System.out.println("Email sent.");
        return "Welcome! Thank you for being our new customer!";
    }
}
