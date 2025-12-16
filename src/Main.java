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
            System.out.println("2-Conversor de temperatura");
            System.out.println("3-Calculadora de area de triangulo");
            System.out.println("4-Gerar numero aleatório");
            System.out.println("0-Sair");
            opcao = scanner.nextInt();


            switch (opcao) {
                case 0:
                    System.out.println("Encerrando o programa...");
                    break;
                case 1:
                    Calculadora calculadora = new Calculadora();
                    calculadora.iniciarCalculadora();
                    break;
                case 2:
                    ConversorTemp conversorTemp = new ConversorTemp();
                    conversorTemp.conversor();
                    break;
                case 3:
                    CalcularAreaTriangulo calcularAreaTriangulo = new CalcularAreaTriangulo();
                    calcularAreaTriangulo.CalculaAreaTriangulo();
                    break;
                case 4:
                    GeradorDeNumeroAleatorio geradorDeNumeroAleatorio = new GeradorDeNumeroAleatorio();
                    geradorDeNumeroAleatorio.sortear();
                    break;
                default:
                    //System.out.println("Operação invalida. Tente novamente");
            }

        } while (opcao != 0);
        scanner.close();

    }
}
