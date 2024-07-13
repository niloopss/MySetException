/**
 * Uma classe de exceção personalizada que indica que um conjunto está cheio.
 * Esta classe estende a classe base Exception.
 * @author Nivea Lins
 */
public class ConjuntoCheioException extends Exception {

    /**
     * Constrói uma nova ConjuntoCheioException com a mensagem detalhada especificada.
     *
     * @param message a mensagem detalhada explicando o motivo da exceção
     */
    public ConjuntoCheioException(String message) {
        super(message);
    }
}
