import java.util.Random;

public class MaiorMenorArrayAleatorio {
public static void main(String[] args) {
    Random rand = new Random(); // Cria um objeto Random para gerar números aleatórios
    int[] numeros = new int[15]; // Declara um array de inteiros com tamanho 15

        // Preenche o array com 15 números aleatórios entre 1 e 100
        for (int i = 0; i < numeros.length; i++) {
            numeros[i] = rand.nextInt(100) + 1;
        }

        int maior = numeros[0]; // Inicializa a variável 'maior' com o primeiro valor do array
        int menor = numeros[0]; // Inicializa a variável 'menor' com o primeiro valor do array

        // Encontra o maior e o menor valor no array
        for (int i = 1; i < numeros.length; i++) {
            if (numeros[i] > maior) {
                maior = numeros[i]; // Atualiza 'maior' se o valor atual for maior
            } else if (numeros[i] < menor) {
                menor = numeros[i]; // Atualiza 'menor' se o valor atual for menor
            }
        }

        // Imprime os números do array
        System.out.println("Números no array:");
        for (int i = 0; i < numeros.length; i++) {
            System.out.print(numeros[i] + " ");
        }

        // Imprime o maior e o menor valor
        System.out.println("\\nMaior valor: " + maior);
        System.out.println("Menor valor: " + menor);
    }
}