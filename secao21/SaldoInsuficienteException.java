package secao21;

// Toda classe que herda de Exception, tem que enviar pelo menos a msg
// getMessage -> mensagem
public class SaldoInsuficienteException extends Exception {
    
    public SaldoInsuficienteException(String mensagem) {
        super(mensagem);
    }

}
