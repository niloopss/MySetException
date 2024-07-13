import java.util.Scanner;

/**
 * A classe Main contém o método principal que permite ao usuário interagir com um conjunto de inteiros.
 * O usuário pode inserir números, que são adicionados ao conjunto, com verificações para valores duplicados,
 * valores inválidos e capacidade do conjunto. O programa continua solicitando entradas até que o usuário insira
 * um número negativo.
 * @author Nivea Lins
 */
public class Main {
    /**
     * O método principal que executa a aplicação. Solicita ao usuário para inserir números,
     * adiciona-os ao conjunto e lida com possíveis exceções.
     *
     */
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        MySet mySet = new MySet();

        while (true) {
            System.out.print("Insira um número (use um número negativo para sair): ");
            int numero = scanner.nextInt();

            if (numero < 0) {
                break;
            }

            try {
                mySet.add(numero);
                System.out.println("Número adicionado: " + numero);
            } catch (ValorDuplicadoException | ValorInvalidoException | ConjuntoCheioException e) {
                System.out.println(e.getMessage());
            }
        }

        System.out.println("Conteúdo final do conjunto:");
        mySet.printSet();
    }
}
