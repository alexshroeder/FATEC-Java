import java.util.Random;

public class ContagemNumeros {
public static void main(String[] args) {
Random rand = new Random(); // Cria um objeto Random para gerar números aleatórios
int[] numeros = new int[50]; // Declara um array de inteiros com tamanho 50  

            // Preenche o array com 50 números aleatórios entre 1 e 10
            for (int i = 0; i < numeros.length; i++) {
                numeros[i] = rand.nextInt(10) + 1;
            }

            // Inicializa um array para contar a ocorrência de cada número (de 1 a 10)
            int[] contagem = new int[10];

            // Conta quantas vezes cada número aparece no array
            for (int i = 0; i < numeros.length; i++) {
                int numeroAtual = numeros[i];
                contagem[numeroAtual - 1]++; // Incrementa a contagem do número atual
            }

            // Imprime a contagem de cada número
            for (int i = 0; i < contagem.length; i++) {
                int numero = i + 1;
                System.out.println("Número " + numero + " aparece " + contagem[i] + " vezes.");
        }
    }
}