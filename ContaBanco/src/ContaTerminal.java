import java.util.Locale;
import java.util.Scanner;


public class ContaTerminal {
    public static void main(String[] args) {
        
        Scanner scanner = new Scanner(System.in).useLocale(Locale.US);
        
        System.out.println("Digite o numero de sua conta: ");
        int numeroConta = scanner.nextInt();
        
        System.out.println("Digite a agência: ");
        String agenciaCliente = scanner.next();

        System.out.println("Digite seu nome: ");
        String nomeCliente = scanner.next();

        System.out.println("Digite seu sobrenome ");
        String sobrenomeCliente = scanner.next();
        
        System.out.println("Digite seu saldo: ");
        double saldoConta = scanner.nextDouble();

        System.out.println("Ola, " + nomeCliente + " " + sobrenomeCliente + ", obrigado por criar uma conta em nosso banco, sua agência é " + agenciaCliente + ", conta " + numeroConta + " e seu saldo R$" + saldoConta + " já está disponível para saque." );


    }

    
}