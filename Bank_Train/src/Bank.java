public class Bank {

    private int id;
    private String name;
    private double value;

    public Bank(int id, String name, double value) {
        this.id = id;
        this.name = name;
        this.value = value;
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

    public double getValue() {
        return value;
    }

    public void deposit(double amount) {
        if (amount > 0) {
            value += amount;
            System.out.printf("Deposited: %.2f\n", amount );
            System.out.printf("New balance: %.2f\n", value );
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
        }
        else {
            System.out.println("insufficient balance");
        }
    }

    public String toString() {
        return id + ", " + name + ", " + String.format("%.2f", value);
    }
}
