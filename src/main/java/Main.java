/**
 * Name: Sicheng Yu
 * Course: CS-665 Software Designs & Patterns
 * Date: 03/05/2024
 * File Name: Main.java
 * Description: This is the class run test and create instance. (5 instances created)
 */
public class Main {
    public static void main(String[] args){
        /***create 5 instances to see if factory method works*/
        Customer Business = CustomerType.genrateCustomer(CustomerType.customerType.Business);
        System.out.println(Business.generateEmail());
        Customer Returning = CustomerType.genrateCustomer(CustomerType.customerType.Returning);
        System.out.println(Returning.generateEmail());
        Customer Frequent = CustomerType.genrateCustomer(CustomerType.customerType.Frequent);
        System.out.println(Frequent.generateEmail());
        Customer New = CustomerType.genrateCustomer(CustomerType.customerType.New);
        System.out.println(New.generateEmail());
        Customer VIP = CustomerType.genrateCustomer(CustomerType.customerType.VIP);
        System.out.println(VIP.generateEmail());

    }
}
