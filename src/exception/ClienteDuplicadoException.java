package exception;

public class ClienteDuplicadoException extends Exception{
    public ClienteDuplicadoException(String mensagem){
        super(mensagem);
    }
}
