import java.util.Scanner;

public static void main(String[] args) {
    Scanner ler = new Scanner(System.in); // Cria um objeto Scanner para leitura de entrada

        int soma = 0; // Inicializa a variável 'soma' para armazenar a soma dos números ímpares
        int atual = 1; // Inicializa a variável 'atual' com 1 para representar o primeiro número ímpar

        System.out.println("Digite um número: "); // Solicita ao usuário que digite um número

        int n = ler.nextInt(); // Lê o número inserido pelo usuário

        for (int c = 1; c < n; c++) { // Inicia um loop de 1 até o número inserido pelo usuário
        if (c % 2 == 1) { // Verifica se 'c' é ímpar (resto da divisão por 2 igual a 1)
        soma += atual; // Se 'c' for ímpar, adiciona o valor de 'atual' à 'soma'
        atual += 2; // Atualiza 'atual' para o próximo número ímpar (acrescenta 2)
        }
    }

    System.out.println("A soma dos ímpares é: " + soma); // Imprime a soma dos números ímpares
}
