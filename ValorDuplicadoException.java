/**
 * Uma classe de exceção personalizada que indica que um valor duplicado foi encontrado.
 * Esta classe estende a classe base Exception.
 * @author Nivea Lins
 */
public class ValorDuplicadoException extends Exception {

    /**
     * Constrói uma nova ValorDuplicadoException com a mensagem detalhada especificada.
     *
     * @param message a mensagem detalhada explicando o motivo da exceção
     */
    public ValorDuplicadoException(String message) {
        super(message);
    }
}
