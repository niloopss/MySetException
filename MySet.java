/**
 * A classe MySet representa um conjunto de inteiros com tamanho máximo definido.
 * Ele permite adicionar elementos ao conjunto, com verificações para valores duplicados,
 * valores inválidos e capacidade do conjunto.
 * @author Nivea Lins
 */
public class MySet {
    private static final int TAMANHO_MAX = 100;
    private int[] elemento;
    private int tamanho;

    /**
     * Constrói um novo conjunto vazio com tamanho máximo predefinido.
     */
    public MySet() {
        elemento = new int[TAMANHO_MAX];
        tamanho = 0;
    }

    /**
     * Adiciona um valor ao conjunto, verificando se o valor é válido,
     * não duplicado e se há espaço disponível no conjunto.
     *
     * @param valor o valor a ser adicionado ao conjunto
     * @throws ValorDuplicadoException se o valor já existe no conjunto
     * @throws ValorInvalidoException se o valor é inválido (menor ou igual a zero ou maior que o valor máximo de um short)
     * @throws ConjuntoCheioException se o conjunto está cheio e não pode adicionar mais elementos
     */
    public void add(int valor) throws ValorDuplicadoException, ValorInvalidoException, ConjuntoCheioException {
        if (valor <= 0 || valor > Short.MAX_VALUE) {
            throw new ValorInvalidoException("Valor inválido: " + valor);
        }

        if (tamanho >= TAMANHO_MAX) {
            throw new ConjuntoCheioException("O conjunto está cheio");
        }

        for (int i = 0; i < tamanho; i++) {
            if (elemento[i] == valor) {
                throw new ValorDuplicadoException("Valor já existente: " + valor);
            }
        }

        elemento[tamanho++] = valor;
    }

    /**
     * Imprime todos os elementos do conjunto no console.
     */
    public void printSet() {
        for (int i = 0; i < tamanho; i++) {
            System.out.print(elemento[i] + " ");
        }
        System.out.println();
    }
}
