package desafio04;

import java.util.Scanner;

public class DesembaralharLinhas {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Informe quantas vezes vai ser testado");
        int n = scanner.nextInt();
        scanner.nextLine();

        StringBuilder sb = new StringBuilder();

        System.out.println("Informe as linhas");
        for (int i = 0; i < n; i++) {
            String linha = scanner.nextLine();
            String desembaralhada = desembaralharLinha(linha);
            sb.append(desembaralhada).append("\n");
        }

        System.out.println(sb);
        scanner.close();
    }

    public static String desembaralharLinha(String linha) {
        int meio = linha.length() / 2;
        StringBuilder sb = new StringBuilder();

        for (int i = meio - 1; i >= 0; i--) {
            sb.append(linha.charAt(i));
        }

        for (int i = linha.length() - 1; i >= meio; i--) {
            sb.append(linha.charAt(i));
        }

        return sb.toString();
    }
}
