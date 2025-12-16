import java.util.Scanner;

public class CalcularAreaTriangulo {

    public void CalculaAreaTriangulo() {

        Scanner scanner = new Scanner(System.in);

        System.out.println("Calculando area de triangulo");

        System.out.println("Digite o primeiro lado do triangulo: ");
        double a = scanner.nextDouble();

        System.out.println("Digite o segundo lado do triangulo: ");
        double b = scanner.nextDouble();

        System.out.println("Digite o terceiro lado do triangulo: ");
        double c = scanner.nextDouble();

        double p = (a + b + c) / 2;
        double area = Math.sqrt(p * (p - a) * (p - b) * (p - c));

        System.out.println("Area do triangulo: " + area);

    }

}
