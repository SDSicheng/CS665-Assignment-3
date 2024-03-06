/**
 * Name: Sicheng Yu
 * Course: CS-665 Software Designs & Patterns
 * Date: 03/05/2024
 * File Name: VIPCustomerTest.java
 * Description: This is the class to do test for VIPCustomer.
 */
import junit.framework.TestCase;
import org.junit.Test;

public class VIPCustomerTest extends TestCase {
    @Test
    public void testGenerateEmail() {
        // Arrange
        VIPCustomer VipCustomer = new VIPCustomer();
        String expectedEmailMessage = "Thank you for being our most important customer!";

        // Act
        String actualEmailMessage = VipCustomer.generateEmail();

        // Assert
        assertEquals(expectedEmailMessage, actualEmailMessage);
    }

}