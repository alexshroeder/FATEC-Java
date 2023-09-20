import java.util.Random;
import java.util.Scanner;

    public class BuscaNumeroNoArray {
    public static void main(String[] args) {
    Random rand = new Random(); // Cria um objeto Random para gerar números aleatórios
    int[] numeros = new int[25]; // Declara um array de inteiros com tamanho 25

    // Preenche o array com 25 números aleatórios entre 1 e 100
        for (int i = 0; i < numeros.length; i++) {
            numeros[i] = rand.nextInt(100) + 1;
        }

        Scanner scanner = new Scanner(System.in);

        // Solicita ao usuário que insira um número
        System.out.print("Digite um número para buscar no array: ");
        int numeroBusca = scanner.nextInt();

        boolean encontrado = false;

        // Verifica se o número de busca está no array
        for (int i = 0; i < numeros.length; i++) {
            if (numeros[i] == numeroBusca) {
                encontrado = true;
                break; // Se encontrado, sai do loop
            }
        }

        // Informa ao usuário o resultado da busca
        if (encontrado) {
            System.out.println("O número " + numeroBusca + " foi encontrado no array.");
        } else {
            System.out.println("O número " + numeroBusca + " não foi encontrado no array.");
        }

        scanner.close(); // Fecha o objeto Scanner
    }
}