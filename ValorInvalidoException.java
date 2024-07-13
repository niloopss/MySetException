/**
 * Uma classe de exceção personalizada que indica que um valor inválido foi encontrado.
 * Esta classe estende a classe base Exception.
 * @author Nivea Lins
 */
public class ValorInvalidoException extends Exception {

    /**
     * Constrói uma nova ValorInvalidoException com a mensagem detalhada especificada.
     *
     * @param message a mensagem detalhada explicando o motivo da exceção
     */
    public ValorInvalidoException(String message) {
        super(message);
    }
}
