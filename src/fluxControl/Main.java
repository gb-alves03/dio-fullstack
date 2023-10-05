package fluxControl;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Digite o primeiro parâmetro: ");
        int firstParameter = scanner.nextInt();
        System.out.println("Digite o segundo parâmetro: ");
        int secondParameter = scanner.nextInt();

        try {
            Contador.contar(firstParameter, secondParameter);
        } catch(Exception e) {
            System.out.println("O segundo parâmetro deve ser maior que o primeiro " + e.getMessage());
        }
    }
}