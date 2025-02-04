package itc;

class Account {
    private int balance = 0; // Initial balance is 0

    // Synchronized method to withdraw
    public synchronized void withdraw(int amount) {
        while (balance < amount) {
            try {
                System.out.println("Insufficient balance, waiting for deposit...");
                wait();
            } catch (InterruptedException e) {
                Thread.currentThread().interrupt();
                System.out.println("Thread interrupted.");
            }
        }
        balance -= amount;
        System.out.println("Withdrawn: " + amount + ", Updated Balance: " + balance);
        notifyAll(); // Notify other threads
    }

    // Synchronized method to deposit
    public synchronized void deposit(int amount) {
        balance += amount;
        System.out.println("Deposited: " + amount + ", Updated Balance: " + balance);
        notifyAll(); // Notify waiting threads
    }
}