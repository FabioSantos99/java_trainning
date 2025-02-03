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
            System.out.println("\nMenu:");
            System.out.println("1 - Cadastrar");
            System.out.println("2 - Consultar");
            System.out.println("3 - Sacar");
            System.out.println("4 - Depositar");
            System.out.println("5 - Sair");
            System.out.println("Escolha uma opção: ");
            option = sc.nextInt();
        
            switch (option) {
                case 1:
                System.out.print("Quantas contas desejar cadastrar?: ");
                int num = sc.nextInt();

                for (int i = 0; i < num; i++) {
        
                    System.out.println();
                    System.out.println("Conta " + (i + 1) + ":");
                    System.out.println("Numero da conta: ");
                    Integer accountNumber = sc.nextInt();
                    System.out.println("Name: ");
                    sc.nextLine();
                    String name = sc.nextLine();
                    System.out.println("Value: ");
                    Double value = sc.nextDouble();
        
                    Bank bk = new Bank(accountNumber, name, value);
        
                    list.add(bk);
                }
                break;

                case 2:
                for (Bank bank: list) {
                    System.out.println(bank);
                }
                break;

                case 3:
                System.out.println("Digite o numero da conta para sacar: ");
                int accountToWD = sc.nextInt();
                System.out.println("Digite o valor para sacar");
                double wd = sc.nextDouble();
                for (Bank bank : list) {
                    if (bank.getAccountNumber() == accountToWD) {
                        bank.withdraw(wd);
                        break;
                    }
                }
                break;

                case 4:
                System.out.println("Digite o numero da conta para depositar");
                int accountDP = sc.nextInt();
                System.out.println("Digite o valor de deposito: ");
                double DA = sc.nextDouble();
                for (Bank bank : list) {
                    if (bank.getAccountNumber() == accountDP) {
                        bank.deposit(DA);
                        break;
                    }
                }
                break;

                case 5:
                System.out.println("Saindo...");
                break;

                default:
                System.out.println("Opção invalida");
            }
        } while (option != 4);

        sc.close();

    }
}
