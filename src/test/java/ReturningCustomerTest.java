/**
 * Name: Sicheng Yu
 * Course: CS-665 Software Designs & Patterns
 * Date: 03/05/2024
 * File Name: ReturningCustomerTest.java
 * Description: This is the class to do test for ReturningCustomer.
 */
import junit.framework.TestCase;
import org.junit.Test;

public class ReturningCustomerTest extends TestCase {

    @Test
    public void testGenerateEmail() {
        // Arrange
        ReturningCustomer returningCustomer = new ReturningCustomer();
        String expectedEmailMessage = "Thank you for coming back!";

        // Act
        String actualEmailMessage = returningCustomer.generateEmail();

        // Assert
        assertEquals(expectedEmailMessage, actualEmailMessage);
    }

}