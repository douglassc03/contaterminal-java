import java.util.Scanner;
import java.util.Locale;

public class SimulacaoBancaria {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in); 
        double saldo = 0; 
        boolean sair = false;

        
            while (!sair) {
                System.out.println("\n");
                System.out.println("Escolha uma função:");
                System.out.println("1 - Depositar");
                System.out.println("2 - Sacar");
                System.out.println("3 - Ver o saldo");
                System.out.println("0 - Sair"); 
                
                int numero = sc.nextInt();

            
                switch (numero) {
                    case 0:
                        sair = true;
                        System.out.println("Programa encerrado.");
                        break;
                    case 1:
                        //System.out.println("Qual valor voce deseja depositar?");
                        double deposito = sc.nextDouble();
                        saldo += deposito;
                        System.out.printf(Locale.US,"Saldo Atual: %.1f%n",deposito);
                        break;
                    case 2:
                        //System.out.println("Qual valor voce deseja sacar?");
                        double sacar = sc.nextDouble();
                        if(sacar > saldo){
                            System.out.println("Saldo insuficiente.");
                        }
                        else{
                            saldo -= sacar;
                            System.out.printf(Locale.US,"Saldo atual: %.1f%n",saldo);
                        }
                        break;
                    case 3:
                        System.out.printf(Locale.US,"Saldo atual: %.1f%n",saldo);
                        break;
                }
            }
        sc.close();

    }
}   
