package desafio03;

import java.util.Arrays;
import java.util.Scanner;

public class ContarParesDiferenca {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Insira o tamanho do array");
        int n = scanner.nextInt();

        System.out.println("Insira o valor alvo");
        int k = scanner.nextInt();

        int[] arr = new int[n];

        System.out.println("Insira os valores do array");
        for (int i = 0; i < n; i++) {
            arr[i] = scanner.nextInt();
        }

        int count = contarParesDiferenca(arr, k);
        System.out.println(count);

        scanner.close();
    }

    public static int contarParesDiferenca(int[] arr, int k) {
        Arrays.sort(arr);

        int count = 0;
        int i = 0;
        int j = 1;

        while (j < arr.length) {
            int diff = arr[j] - arr[i];

            if (diff == k) {
                count++;
                j++;
            } else if (diff > k) {
                i++;
            } else {
                j++;
            }
        }

        return count;
    }
}
