public abstract class Pessoa {
    private long id;
    private String nome;
    private String email;
    private String telefone;
    private String dataNasc;
    private String usuario;
    private String senha;

    public Pessoa(long id, String nome, String email, String telefone, String dataNasc, String usuario, String senha) {
        this.id = id;
        this.nome = nome;
        this.email = email;
        this.telefone = telefone;
        this.dataNasc = dataNasc;
        this.usuario = usuario;
        this.senha = senha;
    }

    public long getId(){return id;}
    public String getNome(){return nome;}
    public String getEmail(){return email;}
    public String getTelefone(){return telefone;}
    public String getDataNasc() {return dataNasc;}
    public String getUsuario(){return usuario;}
    public String getSenha(){return senha;}

    public void setNome(String nome){this.nome = nome;}
    public void setEmail(String email){this.email = email;}
    public void setTelefone(String telefone){this.telefone = telefone;}
    public void setDataNasc(String dataNasc){this.dataNasc = dataNasc;}
    public void setUsuario(String usuario){this.usuario = usuario;}
    public void setSenha(String senha){this.senha = senha;}

}
