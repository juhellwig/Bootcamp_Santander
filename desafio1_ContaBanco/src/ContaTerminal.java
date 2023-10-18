import java.util.Locale;
import java.util.Scanner;

public class ContaTerminal {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in).useLocale(Locale.US);

        System.out.println("Digite o numero da agencia: \n");
        int numero = scanner.nextInt();

        System.out.println("Digite a agencia: \n");
        String agencia = scanner.next();

        System.out.println("Digite o nome do cliente: \n");
        String nome = scanner.next();

        System.out.println("Digite o saldo: \n");
        double saldo = scanner.nextDouble();

        System.out.println("Olá " + nome + ", obrigado por criar uma conta em nosso banco, sua agencia é " + agencia + ", conta " + numero + " e seu saldo de " + saldo + " já está disponível para saque.");
    }
}
