/**
 * Name: Sicheng Yu
 * Course: CS-665 Software Designs & Patterns
 * Date: 03/05/2024
 * File Name: CustomerType.java
 * Description: This is the class handle different customer type when creating instance. My choice is using switch
 * statement.
 */
public class CustomerType {

    /***use enum to make sure no other type would involve can always add new when needed*/
    public enum customerType{
        Business, Returning, Frequent, New, VIP
    }

    /***use switch method to choose the type of customer when instantiate*/
    public static Customer genrateCustomer(customerType typeName) {
        switch(typeName){
            case Business:
                return new BusinessCustomer();
            case Returning:
                return new ReturningCustomer();
            case Frequent:
                return new FrequentCustomer();
            case New:
                return new NewCustomer();
            case VIP:
                return new VIPCustomer();
            default:
                throw new IllegalArgumentException("Not a customer. No email sent.");
        }
    }
}
