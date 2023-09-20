import java.util.Random;

public class ArrayOrdemReversa {
public static void main(String[] args) {
    Random rand = new Random(); // Cria um objeto Random para gerar números aleatórios
    int[] numeros = new int[10]; // Declara um array de inteiros com tamanho 10

            // Preenche o array com 10 números aleatórios entre 1 e 100
            for (int i = 0; i < numeros.length; i++) {
                numeros[i] = rand.nextInt(100) + 1;
            }

            // Imprime os números do array na ordem original
            System.out.println("Números no array (ordem original):");
            for (int i = 0; i < numeros.length; i++) {
                System.out.print(numeros[i] + " ");
            }

            // Imprime os números do array em ordem reversa
            System.out.println("\\nNúmeros no array (ordem reversa):");
            for (int i = numeros.length - 1; i >= 0; i--) {
                System.out.print(numeros[i] + " ");
        }
    }
}