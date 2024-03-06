/**
 * Name: Sicheng Yu
 * Course: CS-665 Software Designs & Patterns
 * Date: 03/05/2024
 * File Name: NewCustomerTest.java
 * Description: This is the class to do test for NewCustomer.
 */
import junit.framework.TestCase;
import org.junit.Test;

public class NewCustomerTest extends TestCase {
    @Test
    public void testGenerateEmail() {
        // Arrange
        NewCustomer newCustomer = new NewCustomer();
        String expectedEmailMessage = "Welcome! Thank you for being our new customer!";

        // Act
        String actualEmailMessage = newCustomer.generateEmail();

        // Assert
        assertEquals(expectedEmailMessage, actualEmailMessage);
    }

}