import java.util.Random;
import java.util.Scanner;

public class GeradorDeNumeroAleatorio {


    public void sortear() {


        Scanner scanner = new Scanner(System.in);
        System.out.println("Digite o valor maximo a ser sorteado: ");
        int digitos = scanner.nextInt();
        Random random = new Random();
        int numAleatorio = random.nextInt(digitos) + 1;

        System.out.println("Numero Aleatorio: " + numAleatorio);


    }


}
