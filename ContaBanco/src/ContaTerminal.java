import java.util.Scanner;

public class ContaTerminal {

    public int Numero;
    public String Agencia;
    public String NomeCliente;
    public double Saldo;


    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        System.out.println("Por favor, digite o número da Agência !");
        String Agencia = sc.nextLine();
        System.out.println("Por favor, digite o usuário:");
        String NomeCliente = sc.nextLine();
        System.out.println("Por favor, digite o saldo:");
        double Saldo = sc.nextDouble();
        System.out.println("Por favor, digite o número da conta:");
        int Numero = sc.nextInt();



        System.out.printf("Olá %s, obrigado por criar uma conta em nosso banco, sua agência é %s, conta %s e seu saldo %.2f já está disponível para saque", NomeCliente, Agencia, Numero, Saldo);
        
        
        sc.close();

        
    }
}
