import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {

        Scanner sc = new Scanner(System.in);

        System.out.print("Digite um numero para contar: ");
        int num = sc.nextInt();

        Factorial count1 = new Factorial(num);

        System.out.println("O resultado de " + count1.x + " é " + count1.factorial());
    }
}
