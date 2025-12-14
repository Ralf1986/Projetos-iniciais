import java.util.Objects;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        int opcao;
        do {
            System.out.println("|-----------UTILIDADES------------|");
            System.out.println("Escolha uma opção");
            System.out.println("1-Calculadora");
            System.out.println("0-Sair");
            opcao = scanner.nextInt();


            switch (opcao) {
                case 1:
                    Calculadora calculadora = new Calculadora();
                    calculadora.iniciarCalculadora();
                    break;
                case 0:
                    System.out.println("Encerrando o programa...");
                    break;
                default:
                    System.out.println("Operação invalida. Tente novamente");
            }

        } while (opcao != 0);
        scanner.close();

    }
}
