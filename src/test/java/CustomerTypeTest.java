/**
 * Name: Sicheng Yu
 * Course: CS-665 Software Designs & Patterns
 * Date: 03/05/2024
 * File Name: CustomerTypeTest.java
 * Description: This is the class to do test for CustomerType.
 */
import junit.framework.TestCase;
import org.junit.Test;

public class CustomerTypeTest extends TestCase {
    @Test
    public void testGenerateBusinessCustomer() {
        Customer customer = CustomerType.genrateCustomer(CustomerType.customerType.Business);
        assertTrue(customer instanceof BusinessCustomer);
    }

    @Test
    public void testGenerateReturningCustomer() {
        Customer customer = CustomerType.genrateCustomer(CustomerType.customerType.Returning);
        assertTrue(customer instanceof ReturningCustomer);
    }

    @Test
    public void testGenerateFrequentCustomer() {
        Customer customer = CustomerType.genrateCustomer(CustomerType.customerType.Frequent);
        assertTrue(customer instanceof FrequentCustomer);
    }

    @Test
    public void testGenerateNewCustomer() {
        Customer customer = CustomerType.genrateCustomer(CustomerType.customerType.New);
        assertTrue(customer instanceof NewCustomer);
    }

    @Test
    public void testGenerateVIPCustomer() {
        Customer customer = CustomerType.genrateCustomer(CustomerType.customerType.VIP);
        assertTrue(customer instanceof VIPCustomer);
    }

}