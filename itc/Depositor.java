package itc;

class Depositor extends Thread {
    private Account account;

    // Constructor to initialize account
    public Depositor(Account account) {
        this.account = account;
    }

    @Override
    public void run() {
        int[] deposits = {500, 300, 700}; // Amounts to deposit
        for (int amount : deposits) {
            account.deposit(amount);
            try {
                Thread.sleep(1000); // 1 second waiting period
            } catch (InterruptedException e) {
                Thread.currentThread().interrupt();
                System.out.println("Thread interrupted.");
            }
        }
    }
}
