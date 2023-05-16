abstract class Usuario {
    protected String razaoSocial;
    protected String telefoneContato;
    protected Endereco endereco;
    protected String email;
    protected String senha;
    protected boolean equipamentos;
    private Artista artista;
    private Estabelecimento estabelecimento;


    public Usuario(String razaoSocial, String telefoneContato, Endereco endereco, String email, String senha, boolean equipamentos) {
        this.razaoSocial = razaoSocial;
        this.telefoneContato = telefoneContato;
        this.endereco = endereco;
        this.email = email;
        this.senha = senha;
        this.equipamentos = equipamentos;
    }
    
    public void setEquipamentos(boolean equipamentos) {
        this.equipamentos = equipamentos;
    }

    public void setArtista(Artista artista) {
        this.artista = artista;
    }

    public void setEstabelecimento(Estabelecimento estabelecimento) {
        this.estabelecimento = estabelecimento;
    }

    public void setRazaoSocial(String razaoSocial) {
        this.razaoSocial = razaoSocial;
    }

    public void setTelefoneContato(String telefoneContato) {
        this.telefoneContato = telefoneContato;
    }

    public void setEndereco(Endereco endereco) {
        this.endereco = endereco;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public void setSenha(String senha) {
        this.senha = senha;
    }

    public String getRazaoSocial() {
        return razaoSocial;
    }

    public String getTelefoneContato() {
        return telefoneContato;
    }

    public Endereco getEndereco() {
        return endereco;
    }

    public Artista getArtista() {
        return artista;
    }

    public Estabelecimento getEstabelecimento() {
        return estabelecimento;
    }

    public String getEmail() {
        return email;
    }

    public String getSenha() {
        return senha;
    }

    public boolean isEquipamentos() {
        return equipamentos;
    }

  

    
}