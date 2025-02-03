import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {

        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);
        List <Bank> list = new ArrayList<>();

        int option;

        do {
            System.out.println("Welcome to the Bank!");
            System.out.println("1 - register account");
            System.out.println("2 - consult");
            System.out.println("3 - Deposit");
            System.out.println("4 - Withdraw");
            System.out.println("5 - Exit");
            option = sc.nextInt();

        switch (option) {
            case 1:
            System.out.print("How many accounts do you want to register?: ");
            int num = sc.nextInt();
            for (int i = 0; i<num; i++) {
                System.out.println("id " + (i + 1) + ":");
                System.out.println("Numero da conta: ");
                int id = sc.nextInt();
                System.out.println("Name: ");
                sc.nextLine();
                String name = sc.nextLine();
                System.out.println("Value: ");
                double value = sc.nextDouble();
                
                Bank bk = new Bank(id, name, value);

                list.add(bk);
            }
            break;
            
            case 2:
            for (Bank bank: list) {
                System.out.println(bank);
            }
            break;

            case 3:
            System.out.println("Tape the account number to deposit");
            int dpID = sc.nextInt();
            System.out.println("Tape value to deposit: ");
            double dp = sc.nextDouble();
            for (Bank bank: list) {
                if (bank.getId() == dpID) {
                    bank.deposit(dp);
                    break;
                }
            }
            break;

            case 4:
            System.out.println("Tape the account number to deposit");
            int dwID = sc.nextInt();
            System.out.println("Tape the value to withdraw: ");
            double dw = sc.nextDouble();
            for (Bank bank : list) {
                if (bank.getId() == dwID) {
                    bank.withdraw(dw);
                    break;
                }
            }
            break;

            case 5:
            System.out.println("Exit...Bye!");
            break;

            default:
            System.out.println("Invalid option");
                break;
        }

        } while (option != 5);

        sc.close();
    }
}
