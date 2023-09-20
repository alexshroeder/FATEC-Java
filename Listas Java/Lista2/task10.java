import java.util.Random;

    public class SimulacaoLancamentoDados {
    public static void main(String[] args) {
    Random rand = new Random(); // Cria um objeto Random para gerar números aleatórios
    int totalLancamentos = 100; // Total de lançamentos
    int contagemSete = 0; // Inicializa a contagem de soma igual a 7

        for (int i = 0; i < totalLancamentos; i++) {
            // Simula o lançamento de dois dados (cada dado de 1 a 6)
            int dado1 = rand.nextInt(6) + 1;
            int dado2 = rand.nextInt(6) + 1;

            int somaDados = dado1 + dado2;

            // Verifica se a soma dos dados é igual a 7
            if (somaDados == 7) {
                contagemSete++;
            }
        }

        // Imprime o resultado
        System.out.println("Resultados dos lançamentos:");
        System.out.println("Total de lançamentos: " + totalLancamentos);
        System.out.println("Quantidade de vezes que a soma foi igual a 7: " + contagemSete);
    }
}