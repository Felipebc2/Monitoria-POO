public class Passageiro extends Pessoa {
    private String numCartao;
    private String documento;
    private Endereco endereco;

    public Passageiro(long id, String nome, String email, String telefone, String dataNasc, String usuario, String senha,
                      String numCartao, String documento, Endereco endereco) {
        super(id, nome, email, telefone, dataNasc, usuario, senha);
        this.numCartao = numCartao;
        this.documento = documento;
        this.endereco = endereco;
    }

    public String getNumCartao(){return numCartao;}
    public String getDocumento(){return documento;}
    public Endereco getEndereco(){return endereco;}

    public void setNumCartao(String numCartao){this.numCartao = numCartao;}
    public void setDocumento(String documento){this.documento = documento;}
    public void setEndereco(Endereco endereco){this.endereco = endereco;}

    public void solicitarViagem(){
        System.out.println(getNome() + " solicitou uma viagem");
    }
}
