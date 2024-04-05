package Service;

import models.Customer;

import java.util.ArrayList;
import java.util.List;

public class CustomerService {
    private static List<Customer> customers = new ArrayList<>();

    public static void addCustomer(Customer customer) {
        customer.setIdCustomer(generateUniqueId());
        customers.add(customer);
    }

    public static void printCustomers() {
        for (Customer customer : customers) {
            System.out.println(customer);
        }
    }

    public static void updateCustomerPhoneNumber(long id, String newPhoneNumber) {
        for (Customer customer : customers) {
            if (customer.getIdCustomer() == id) {
                customer.setPhoneNumber(newPhoneNumber);
                break;
            }
        }
    }

    public static void listCustomers() {
        System.out.println("----- List of Customers -----");
        if (customers.isEmpty()) {
            System.out.println("No customers found.");
        } else {
            printCustomers();
        }
    }

    private static long generateUniqueId() {
    }
}
