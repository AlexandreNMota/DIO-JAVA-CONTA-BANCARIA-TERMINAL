import java.util.Scanner;

public class ContaTerminal {
    public int conta;
    public String agencia;
    public String nomeCliente;
    public double saldo;
    Scanner scanner = new Scanner(System.in);
    public static void main(String[] args) {
        ContaTerminal conta = new ContaTerminal();
        conta.Login();
        conta.Extrato();
    }

    public  void Login(){
        System.out.println("Por favor, digite o número da agência: ");
        agencia = scanner.nextLine();
        System.out.println("Por favor, digite o número da conta: ");
        conta = scanner.nextInt();
        scanner.nextLine();
        System.out.println("Por favor, digite o seu nome: ");
        nomeCliente = scanner.nextLine();
        System.out.println("Por favor, digite o seu saldo: ");
        saldo = scanner.nextDouble();
    }

    public void Extrato(){
        System.out.println("Olá " + nomeCliente + ", obrigado por criar uma conta em nosso banco, sua agência é " +  agencia + ", conta " +  conta + " e seu saldo " +  saldo + " já está disponível para saque\"");
    }
}
