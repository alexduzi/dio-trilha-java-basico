import java.util.Locale;
import java.util.Scanner;

public class ContaTerminal {
    public static void main(String[] args) throws Exception {
        
        Scanner scanner = new Scanner(System.in);

        System.out.print("Digite o número de sua conta bancária: ");
        int numero = scanner.nextInt();
        scanner.nextLine();
        
        System.out.print("Digite a sua agência:");
        String agencia = scanner.nextLine();

        System.out.print("Digite seu nome completo: ");
        String nomeCliente = scanner.nextLine();

        System.out.print("Digite seu saldo: ");
        double saldo = scanner.nextDouble();
        scanner.nextLine();

        String resultado = String.format("Olá %s, obrigado por criar uma conta em nosso banco" +
                                        ", sua agência é %s, conta %d e seu saldo %.2f já está disponível para saque", 
                                    nomeCliente, 
                                    agencia,
                                    numero,
                                    saldo);

        System.out.println(resultado);

        scanner.close();
    }
}
