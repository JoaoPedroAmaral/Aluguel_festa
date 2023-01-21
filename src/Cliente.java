public class Cliente {
    private String nome;
	private String telefone;
    private String dataCriacao;

    
	public Cliente() {
		
	}
	
	public Cliente(String nome, String telefone, String dataCriacao) {
		this.nome = nome;
		this.telefone = telefone;
		this.dataCriacao = dataCriacao;
	}

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getTelefone() {
        return telefone;
    }

    public void setTelefone(String telefone) {
        this.telefone = telefone;
    }

    public String getDataCriacao() {
        return dataCriacao;
    }

    public void setDataCriacao(String dataCriacao) {
        this.dataCriacao = dataCriacao;
    }

    

}
