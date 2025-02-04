package cab;


public class CabCustomerServiceTester {
    public static void main(String[] args) {
        CabCustomerService cabService = new CabCustomerService();

        // Creating customer objects
        CabCustomer customer1 = new CabCustomer(1, "John", "Point A", "Point B", 6, "1234567890");
        CabCustomer customer2 = new CabCustomer(2, "Smith", "Point C", "Point D", 6, "0987654321");
        CabCustomer customer3 = new CabCustomer(3, "John", "Point E", "Point F", 4, "1234567890");

        // Adding customers
        cabService.addCabCustomer(customer1);
        cabService.addCabCustomer(customer2);
        cabService.addCabCustomer(customer3); // Same phone as customer1, so it is an existing customer

        // Printing bills
        cabService.printBill(customer1);
        cabService.printBill(customer2);
        cabService.printBill(customer3);
    }
}
