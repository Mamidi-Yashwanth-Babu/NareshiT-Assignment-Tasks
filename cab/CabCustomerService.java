package cab;

import java.util.ArrayList;

class CabCustomerService {
    private ArrayList<CabCustomer> customerList = new ArrayList<>();

    // Add customer only if they are not an existing customer
    public void addCabCustomer(CabCustomer customer) {
        if (!isFirstCustomer(customer)) {
            customerList.add(customer);
            System.out.println(customer.getCustomerName() + " has been added as a new customer.");
        } else {
            System.out.println(customer.getCustomerName() + " is an existing customer.");
        }
    }

    // Check if customer is already in the list (based on phone number)
    public boolean isFirstCustomer(CabCustomer customer) {
        for (CabCustomer c : customerList) {
            if (c.getPhone().equals(customer.getPhone())) {
                return true; // Existing customer
            }
        }
        return false; // New customer
    }

    // Calculate bill based on distance
    public double calculateBill(CabCustomer customer) {
        if (!isFirstCustomer(customer)) {
            return 0; // New customers travel for free
        } else {
            int distance = customer.getDistance();
            if (distance <= 4) {
                return 80; // Fixed charge for up to 4 km
            } else {
                return 80 + (distance * 6); // Rs. 6 per km beyond 4 km
            }
        }
    }

    // Print the customer's bill in the given format
    public void printBill(CabCustomer customer) {
        double billAmount = calculateBill(customer);
        System.out.println(customer.getCustomerName().toUpperCase() + 
                           " Please pay your bill of Rs." + billAmount);
    }
}