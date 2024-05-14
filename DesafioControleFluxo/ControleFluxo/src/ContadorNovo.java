import java.util.Scanner;

public class ContadorNovo {
    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Digite o primeiro parâmetro:");
        int parametroUm = sc.nextInt();
        System.out.println("Digite o segundo parâmetro:");
        int parametroDois = sc.nextInt();
        contar(parametroDois,parametroUm);
        sc.close();


    }
    public static void contar(int parametroDois, int parametroUm){
        if (parametroUm > parametroDois){
            System.out.println("O segundo parâmetro deve ser maior que o primeiro. Tente Novamente\n");
        }
        else{
            for (int i = parametroUm; i <= parametroDois; i++) {
                System.out.printf("Imprimindo o número %d\n", i);
            }
        }
    }
}
