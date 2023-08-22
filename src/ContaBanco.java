import java.util.Locale;
import java.util.Scanner;

public class ContaBanco {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in).useLocale(Locale.US);

        System.out.println("Digite o número da Agência: ");
        String agencia = sc.nextLine();
        System.out.println("Digite o número da conta: ");
        int numero = sc.nextInt();
        sc.nextLine();
        System.out.println("Digite seu Nome: ");
        String nomeCliente = sc.nextLine();
        System.out.println("Digite seu saldo: ");
        double saldo = sc.nextDouble();

        System.out.println("Olá " + nomeCliente + ", obrigado por criar uma conta em nosso banco, sua agência é "
                + agencia + ", conta " + numero + " e seu saldo " + saldo + " já está disponível para saque.");
        sc.close();
    }
}