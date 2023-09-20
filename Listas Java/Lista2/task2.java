import java.util.Random;
import java.util.Scanner;

public class JogoAdivinhacao {
public static void main(String[] args) {
Random rand = new Random(); // Cria um objeto Random para gerar números aleatórios
int numeroAleatorio = rand.nextInt(100) + 1; // Gera um número aleatório entre 1 e 100
int tentativas = 0; // Inicializa o contador de tentativas

    Scanner scanner = new Scanner(System.in); // Cria um objeto Scanner para entrada do usuário

    System.out.println("Bem-vindo ao jogo de adivinhação!");
    System.out.println("Tente adivinhar o número entre 1 e 100.");

    while (true) { // Inicia um loop que continuará até o usuário acertar o número
        System.out.print("Digite seu palpite: ");
        int palpite = scanner.nextInt(); // Lê o palpite do usuário
        tentativas++; // Incrementa o contador de tentativas

        if (palpite < numeroAleatorio) {
            System.out.println("Tente um número mais alto."); // Dá uma dica se o palpite for baixo
        } else if (palpite > numeroAleatorio) {
            System.out.println("Tente um número mais baixo."); // Dá uma dica se o palpite for alto
        } else {
            System.out.println("Parabéns! Você acertou o número em " + tentativas + " tentativas.");
            break; // Se o palpite estiver correto, exibe uma mensagem e sai do loop
        }
    }

    scanner.close(); // Fecha o objeto Scanner quando o jogo termina
}
}