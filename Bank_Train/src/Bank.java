import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;
import java.util.List;

public class Bank {

    private int id;
    private String name;
    private double value;

    private List<String> depositHistory = new ArrayList<>();
    private List<String> withdrawnHistory = new ArrayList<>();

    public Bank(int id, String name, double value) {
        this.id = id;
        this.name = name;
        this.value = 0.00;
    }
    
    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

   

    public void deposit(double amount) {
        if (amount > 0) {
            value += amount;
            System.out.printf("Deposited: %.2f\n", amount );
            System.out.printf("New balance: %.2f\n", value );
           String timestamp = LocalDateTime.now().format(DateTimeFormatter.ofPattern("dd/MM/yyyy HH:mm:ss"));
            depositHistory.add("Deposited: " + amount + " at " + timestamp);
        }
        else {
            System.out.println("Please to deposit a positive value");
        }
    }

    public void withdraw(double amount) {
        if (amount > 0 && amount <= value) {
            value -= amount;
            System.out.printf("Withdraw: %.2f\n", amount);
            System.out.printf("New Balance: %.2f\n", value);
            String timestamp = LocalDateTime.now().format(DateTimeFormatter.ofPattern("dd/MM/yyyy HH:mm:ss"));
            withdrawnHistory.add("Withdrawn: " + amount + " at " + timestamp);
        }
        else {
            System.out.println("insufficient balance");
        }
    }

    public String toString() {
        return id + ", " + name + ", " + String.format("%.2f", value);
    }

    public void transactionHistory() {
        System.out.println("\nDepositedHistoric:");
        for (String transaction : depositHistory) {
            System.out.println(transaction);
        }

        System.out.println("\nWithdrawnHistoric:");
        for (String transaction : withdrawnHistory) {
            System.out.println(transaction);
        }
    }
}