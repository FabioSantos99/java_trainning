
public class Bank {

    private int accountNumber;
    private String name;
    private double value;

    public Bank (int accountNumber, String name, double value) {
        this.accountNumber = accountNumber;
        this.name = name;
        this.value = value;
    }

    public int getAccountNumber() {
        return accountNumber;
    }

    public void setAccountNumber(int accountNumber) {
        this.accountNumber = accountNumber;
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

    public void setValue(double value) {
        this.value = value;
    }
    
    public void deposit(double amount) {
        if (amount > 0) {
            value += amount;
            System.out.printf("Depositado: %.2f\n", amount);
            System.out.printf("Novo saldo: %.2f\n", value);
        }
        else {
            System.out.println("Valor deve ser maior que zero");
        }

    }

    public void withdraw(double amount) {

        if (amount > 0 && amount <= value) {
            value -= amount;
            System.out.printf("Sacado: %.2f\n", amount);
            System.out.printf("Novo saldo: %.2f\n", value);

        }
        else {
            System.out.println("Valor de saque indisponível");
        }
    }

    public String toString() {
        return accountNumber + ", " + name + ", " + String.format("%.2f", value);
    }


}
