package desafio02;

import java.util.Scanner;

public class NotasEMoedas {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Insira o valor");
        String valorEmString = scanner.nextLine();
        double valor = Double.parseDouble(valorEmString);

        int[] notas = {100, 50, 20, 10, 5, 2};
        double[] moedas = {1, 0.50, 0.25, 0.10, 0.05, 0.01};

        System.out.println("NOTAS:");
        for (int i = 0; i < notas.length; i++) {
            int quantidadeNotas = (int) (valor / notas[i]);
            System.out.println(quantidadeNotas + " nota(s) de R$ " + notas[i] + ".00");
            valor %= notas[i];
        }

        System.out.println("MOEDAS:");
        for (int i = 0; i < moedas.length; i++) {
            int quantidadeMoedas = (int) (valor / moedas[i]);
            System.out.printf("%d moeda(s) de R$ %.2f\n", quantidadeMoedas, moedas[i]);
            valor %= moedas[i];
        }

        scanner.close();
    }
}
