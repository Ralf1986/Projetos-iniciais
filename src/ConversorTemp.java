import java.util.Scanner;

public class ConversorTemp {

    Scanner scanner = new Scanner(System.in);

    public void conversor() {

        System.out.println("|--------Conversor de temperatura-------|");
        System.out.println();
        System.out.println("Escolha 1 para fahrenheit para celsius");
        System.out.println("Escolha 2 para celsius para fahrenheit");

        int escolha = scanner.nextInt();
        switch (escolha) {
            case 1:
                System.out.println("Digite a temperatura em Fahrenheit:");
                double numF = scanner.nextInt();
                double resultado = (numF - 32) * 5 / 9;
                System.out.println("Temperatura em Celsius: " + resultado);
                break;
            case 2:
                System.out.println("Digite a temperatura em Celsius:");
                double numC = scanner.nextInt();
                double resiltado2 = (numC * 9 / 5) + 32;
                System.out.println("Temperatura em Celsius: " + resiltado2);
                break;
            default:
                System.out.println("operador invalido");

        }

    }

}
