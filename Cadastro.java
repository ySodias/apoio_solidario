package Apoio_solidario;

public class Cadastro {
	private String nomeCompleto;
	private int idade;
	private String email;
	private String telefone;
	private String cpf;
	
	public Cadastro (String nome, int idade, String email, String telefone, String cpf)
	{
		this.nomeCompleto=nome;
		this.idade=idade;
		this.email= email; 
		this.telefone= telefone;
		this.cpf=cpf;
	}

	public String getNomeCompleto() {
		return nomeCompleto;
	}

	public void setNomeCompleto(String nomeCompleto) {
		this.nomeCompleto = nomeCompleto;
	}

	public int getIdade() {
		return idade;
	}

	public void setIdade(int idade) {
		this.idade = idade;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getTelefone() {
		return telefone;
	}

	public void setTelefone(String telefone) {
		this.telefone = telefone;
	}

	public String getCPF() {
		return cpf;
	}

	public void setCPF(String cpf) {
		this.cpf = cpf;
	}

}
