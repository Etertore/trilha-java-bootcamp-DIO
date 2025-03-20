import java.util.InputMismatchException;
import java.util.Locale;
import java.util.Scanner;

public class AboutMe {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in).useLocale(Locale.US);

        try {

            System.out.println("Digite o seu nome: ");
            String nome = scanner.next();

            System.out.println("Digite o seu sobrenome: ");
            String sobrenome = scanner.next();

            System.out.println("Digite a sua idade: ");
            int idade = scanner.nextInt();

            System.out.println("Digite a sua altura: ");
            Double altura = scanner.nextDouble();

            System.out.println("Ola, me chamo " + nome.toUpperCase() + " " + sobrenome.toUpperCase());
            System.out.println("Tenho " + idade + " anos");
            System.out.println("Minha altura é " + altura + "cm ");

        } catch (InputMismatchException e) {
            System.err.println("Os campos idade e altura devem ser numéricos");

        }
        scanner.close();
    }

}
