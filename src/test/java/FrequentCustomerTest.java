/**
 * Name: Sicheng Yu
 * Course: CS-665 Software Designs & Patterns
 * Date: 03/05/2024
 * File Name: FrequentCustomerTest.java
 * Description: This is the class to do test for FrequentCustomer.
 */
import junit.framework.TestCase;
import org.junit.Test;

public class FrequentCustomerTest extends TestCase {
    @Test
    public void testGenerateEmail() {
        // Arrange
        FrequentCustomer frequentCustomer = new FrequentCustomer();
        String expectedEmailMessage = "Thank you for choosing us as your supply provider!";

        // Act
        String actualEmailMessage = frequentCustomer.generateEmail();

        // Assert
        assertEquals(expectedEmailMessage, actualEmailMessage);
    }

}