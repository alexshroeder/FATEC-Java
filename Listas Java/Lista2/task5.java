import java.util.Random;

public class ContagemNumerosImpares {
public static void main(String[] args) {
    Random rand = new Random(); // Cria um objeto Random para gerar números aleatórios
    int[] numeros = new int[30]; // Declara um array de inteiros com tamanho 30

        // Preenche o array com 30 números aleatórios entre 1 e 100
        for (int i = 0; i < numeros.length; i++) {
            numeros[i] = rand.nextInt(100) + 1;
        }

        int contadorImpares = 0; // Inicializa o contador de números ímpares

        // Itera pelo array e conta quantos números são ímpares
        for (int i = 0; i < numeros.length; i++) {
            if (numeros[i] % 2 != 0) {
                contadorImpares++; // Incrementa o contador se o número for ímpar
            }
        }

        // Imprime os números do array
        System.out.println("Números no array:");
        for (int i = 0; i < numeros.length; i++) {
            System.out.print(numeros[i] + " ");
        }

        // Imprime a contagem de números ímpares
        System.out.println("\\nQuantidade de números ímpares: " + contadorImpares);
    }
}