import java.util.Scanner;

public class Main {
    public static void main(String[] args) 
        Scanner primeiroNumeroScanner = new Scanner(System.in);
        System.out.print("Digite o primeiro número: ");
        double primeiroNumero = primeiroNumeroScanner.nextDouble();
        Scanner segundoNumeroScanner = new Scanner(System.in);
        System.out.print("Digite o segundo número: ");
        double segundoNumero = segundoNumeroScanner.nextDouble();
        double resultado = primeiroNumero + segundoNumero;
        System.out.println("O resultado é: " + resultado);

    }
}