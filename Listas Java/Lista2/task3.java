import java.util.Random;

public class MediaArrayAleatorio {
public static void main(String[] args) {
Random rand = new Random(); // Cria um objeto Random para gerar números aleatórios
int[] numeros = new int[20]; // Declara um array de inteiros com tamanho 20

    // Preenche o array com 20 números aleatórios entre 1 e 100
    for (int i = 0; i < numeros.length; i++) {
        numeros[i] = rand.nextInt(100) + 1;
    }

    int soma = 0; // Variável para armazenar a soma dos números no array

    // Calcula a soma dos números no array
    for (int i = 0; i < numeros.length; i++) {
        soma += numeros[i];
    }

    double media = (double) soma / numeros.length; // Calcula a média

    // Imprime os números do array
    System.out.println("Números no array:");
    for (int i = 0; i < numeros.length; i++) {
        System.out.print(numeros[i] + " ");
    }

    // Imprime a média
    System.out.println("\\nMédia dos números: " + media);
}
}