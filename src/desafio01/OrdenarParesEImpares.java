package desafio01;

import java.util.*;

public class OrdenarParesEImpares {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Insira a quantia de linhas");
        int linesQuantity = scanner.nextInt();

        List<Integer> valores = new ArrayList<>();

        System.out.println("Insira os valores");
        for (int i = 0; i < linesQuantity; i++) {
            int valor = scanner.nextInt();
            valores.add(valor);
        }

        List<Integer> ordenados = ordenarParesImpares(valores);

        System.out.println("Resultado: ");
        for (int valor : ordenados) {
            System.out.println(valor);
        }

        scanner.close();
    }

    public static List<Integer> ordenarParesImpares(List<Integer> valores) {
        List<Integer> pares = new ArrayList<>();
        List<Integer> impares = new ArrayList<>();

        for (int valor : valores) {
            if (valor % 2 == 0) {
                pares.add(valor);
            } else {
                impares.add(valor);
            }
        }

        Collections.sort(pares);

        Collections.sort(impares, Comparator.reverseOrder());

        List<Integer> ordenados = new ArrayList<>();
        ordenados.addAll(pares);
        ordenados.addAll(impares);

        return ordenados;
    }
}
