import java.util.Scanner;

public class ValorMaisFrequente {
public static void main(String[] args) {
Scanner scanner = new Scanner(System.in);
int[] numeros = new int[10]; // Declara um array de inteiros com tamanho 10

    // Solicita ao usuário que insira 10 números
        System.out.println("Digite 10 números:");

        // Preenche o array com os números inseridos pelo usuário
        for (int i = 0; i < 10; i++) {
            System.out.print("Número " + (i + 1) + ": ");
            numeros[i] = scanner.nextInt();
        }

        scanner.close(); // Fecha o objeto Scanner

        int valorMaisFrequente = 0;
        int frequenciaMaisFrequente = 0;

        // Itera pelo array e encontra o valor mais frequente
        for (int i = 0; i < numeros.length; i++) {
            int valorAtual = numeros[i];
            int frequenciaAtual = 1;

            // Verifica a frequência do valor atual no restante do array
            for (int j = i + 1; j < numeros.length; j++) {
                if (numeros[j] == valorAtual) {
                    frequenciaAtual++;
                }
            }

            // Se a frequência atual for maior que a frequência mais frequente encontrada até agora
            if (frequenciaAtual > frequenciaMaisFrequente) {
                valorMaisFrequente = valorAtual;
                frequenciaMaisFrequente = frequenciaAtual;
            }
        }

        // Imprime o valor mais frequente e sua frequência
        System.out.println("O valor mais frequente é: " + valorMaisFrequente);
        System.out.println("Frequência: " + frequenciaMaisFrequente);
    }
}