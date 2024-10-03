import java.time.LocalDate;

public class Motorista extends Pessoa {
    private String codigo;
    private String contaCorrente;

    public Motorista(long id, String nome, String email, String telefone, String dataNasc, String usuario, String senha,
                     String codigo, String contaCorrente) {
        super(id, nome, email, telefone, dataNasc, usuario, senha);
        this.codigo = codigo;
        this.contaCorrente = contaCorrente;
    }

    public String getCodigo() {return codigo;}
    public String getContaCorrente() {return contaCorrente;}

    public void setCodigo(String codigo) {this.codigo = codigo;}
    public void setContaCorrente(String contaCorrente) {this.contaCorrente = contaCorrente;}

    public void dirigir() {
        System.out.println(getNome() + " esta dirigindo...");
    }
}