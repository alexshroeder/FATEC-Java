import java.util.Scanner;
import java.util.Random;

    public static void main(String[] args) {
    Scanner ler = new Scanner(System.in); // Cria um objeto Scanner para entrada do usuário
    Random rand = new Random(); // Cria um objeto Random para gerar números aleatórios

    int[] aleatorios = new int[10]; // Declara um array de inteiros com tamanho 10 para armazenar os números aleatórios

    // Gera 10 números aleatórios entre 0 e 99 e armazena no array 'aleatorios'
    for (int c = 0; c <= 9; c++) {
        aleatorios[c] = rand.nextInt(100);
    }

    // Itera pelo array 'aleatorios' e verifica se cada número é par
    for (int c = 0; c <= 9; c++) {
        if (aleatorios[c] % 2 == 0) { // Se o número for par
            System.out.println(aleatorios[c]); // Imprime o número par
        }
    }
}