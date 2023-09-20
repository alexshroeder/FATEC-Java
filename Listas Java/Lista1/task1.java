import java.util.Scanner;

public static void main(String[] args) {
    Scanner ler = new Scanner(System.in); // Cria um objeto Scanner para leitura de entrada

    System.out.println("Digite a Idade: "); // Solicita ao usuário que digite sua idade

    int idade = ler.nextInt(); // Lê a idade inserida pelo usuário e armazena em uma variável

        if (idade >= 60) { // Verifica se a idade é maior ou igual a 60
        System.out.println("Idosa"); // Se a condição for verdadeira, imprime "Idosa"
        } else if (idade >= 18) { // Verifica se a idade é maior ou igual a 18 (se não for idosa)
        System.out.println("Adulto"); // Se a condição for verdadeira, imprime "Adulto"
        } else {
        System.out.println("Criança"); // Se nenhuma das condições anteriores for verdadeira, imprime "Criança"
    }
}