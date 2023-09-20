import java.util.Scanner;

public class SenhaSecreta {
public static void main(String[] args) {
Scanner scanner = new Scanner(System.in);
String senhaCorreta = "python123"; // Defina a senha secreta 

   boolean senhaCorretaInserida = false;

    while (!senhaCorretaInserida) {
        System.out.print("Digite a senha: ");
        String senhaInserida = scanner.nextLine();

        if (senhaInserida.equals(senhaCorreta)) {
            senhaCorretaInserida = true;
            System.out.println("Senha correta! Acesso permitido.");
        } else {
            System.out.println("Senha incorreta. Tente novamente.");
        }
    }

    scanner.close();
}
}