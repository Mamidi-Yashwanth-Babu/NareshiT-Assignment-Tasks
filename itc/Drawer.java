package itc;

class Drawer extends Thread {
    private Account account;

    // Constructor to initialize account
    public Drawer(Account account) {
        this.account = account;
    }

    @Override
    public void run() {
        int[] withdrawals = {200, 500, 300}; // Amounts to withdraw
        for (int amount : withdrawals) {
            account.withdraw(amount);
            try {
                Thread.sleep(1000); // 1 second waiting period
            } catch (InterruptedException e) {
                Thread.currentThread().interrupt();
                System.out.println("Thread interrupted.");
            }
        }
    }
}