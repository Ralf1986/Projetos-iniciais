import java.util.Scanner;

public class Calculadora {

    public void iniciarCalculadora() {


        Scanner scanner = new Scanner(System.in);
        System.out.print("|----------Calculadora-------------|");


        System.out.println("Digite um numero");
        double num1 = scanner.nextDouble();

        System.out.println("Digite o operador");
        System.out.println("+, -, / ou *");
        String operador = scanner.next();

        System.out.println("Digite outro numero");
        double num2 = scanner.nextDouble();

        double resultado;


        switch (operador) {
            case "+":
                resultado = num1 + num2;
                break;
            case "-":
                resultado = num1 - num2;
                break;
            case "*":
                resultado = num1 * num2;
                break;
            case "/":
                if (num2 == 0) {
                    System.out.println("Digite outro numero");
                    return;
                }
                resultado = num1 / num2;
                break;
            default:
                System.out.println("operador invalido");
                return;

        }

        System.out.println("Resultado: " + resultado);


    }
}
