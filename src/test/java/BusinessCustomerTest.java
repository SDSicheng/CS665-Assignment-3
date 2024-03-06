/**
 * Name: Sicheng Yu
 * Course: CS-665 Software Designs & Patterns
 * Date: 03/05/2024
 * File Name: BusinessCustomerTest.java
 * Description: This is the class to do test for BusinessCustomer.
 */
import junit.framework.TestCase;
import org.junit.Test;

public class BusinessCustomerTest extends TestCase {
    @Test
    public void testGenerateEmail() {
        // Arrange
        BusinessCustomer businessCustomer = new BusinessCustomer();
        String expectedEmailMessage = "Thank you for choosing us as your business partner!";

        // Act
        String actualEmailMessage = businessCustomer.generateEmail();

        // Assert
        assertEquals(expectedEmailMessage, actualEmailMessage);
    }
}