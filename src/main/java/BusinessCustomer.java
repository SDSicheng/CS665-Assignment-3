/**
 * Name: Sicheng Yu
 * Course: CS-665 Software Designs & Patterns
 * Date: 03/05/2024
 * File Name: BusinessCustomer.java
 * Description: This is the class handle email send to BusinessCustomer.
 */
public class BusinessCustomer implements Customer {
    @Override
    public String generateEmail() {
        System.out.println("Email sent.");
        return "Thank you for choosing us as your business partner!";
    }
}
