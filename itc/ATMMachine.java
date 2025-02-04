package itc;

public class ATMMachine {
    public static void main(String[] args) {
        Account account = new Account();

        // Create threads for Depositor and Drawer
        Depositor depositor = new Depositor(account);
        Drawer drawer = new Drawer(account);

        // Start the threads
        depositor.start();
        drawer.start();
    }
}
