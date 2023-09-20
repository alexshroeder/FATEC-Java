import java.util.Scanner;

public class VerificarNome {
public static void main(String[] args) {
Scanner ler = new Scanner(System.in);
String[] nomes = new String[5]; // Declara um array de strings para armazenar nomes

    for (int c = 0; c < 5; c++) { // Use índices de 0 a 4 para preencher o array de nomes
        System.out.println("Digite um nome: ");
        nomes[c] = ler.nextLine();
    }

    System.out.println("Digite outro nome para verificar: ");
    String outronome = ler.nextLine();

    boolean nomeIgualEncontrado = false; // Variável para verificar se um nome igual foi encontrado

    for (int c = 0; c < 5; c++) { // Use índices de 0 a 4 para verificar o array de nomes
        if (outronome.equals(nomes[c])) {
            nomeIgualEncontrado = true; // Define a variável como verdadeira se encontrar um nome igual
            break; // Sai do loop após encontrar o nome igual
        }
    }

    if (nomeIgualEncontrado) {
        System.out.println("Nome igual encontrado");
    } else {
        System.out.println("Nome igual não encontrado");
    }
}
}