/**
 * Name: Sicheng Yu
 * Course: CS-665 Software Designs & Patterns
 * Date: 03/05/2024
 * File Name: VIPCustomer.java
 * Description: This is the class handle email send to VIPCustomer.
 */
public class VIPCustomer implements Customer{
    @Override
    public String generateEmail() {
        System.out.println("Email sent.");
        return "Thank you for being our most important customer!";
    }
}
