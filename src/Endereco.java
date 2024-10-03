public class Endereco {
    private long id;
    private String rua;
    private int numero;
    private String complemento;
    private String bairro;
    private String cidade;
    private String estado;
    private String pais;

    public Endereco(long id, String rua, int numero, String complemento, String bairro, String cidade, String estado, String pais) {
        this.id = id;
        this.rua = rua;
        this.numero = numero;
        this.complemento = complemento;
        this.bairro = bairro;
        this.cidade = cidade;
        this.estado = estado;
        this.pais = pais;
    }

    public long getId(){return id;}
    public String getRua(){return rua;}
    public int getNumero(){return numero;}
    public String getComplemento(){return complemento;}
    public String getBairro() {return bairro;}
    public String getCidade(){return cidade;}
    public String getEstado(){return estado;}
    public String getPais(){return pais;}


    public void setRua(String rua){this.rua = rua;}
    public void setNumero(int numero){this.numero = numero;}
    public void setComplemento(String complemento){this.complemento = complemento;}
    public void setBairro(String bairro){this.bairro = bairro;}
    public void setCidade(String cidade){this.cidade = cidade;}
    public void setEstado(String estado){this.estado = estado;}
    public void setPais(String pais){this.pais = pais;}

    public void mostrarEndereco(){
        System.out.println(rua + ", " + numero + ", " + complemento + ", " + bairro + ", " + cidade + ", " + estado + ", " + pais);
    }
}
