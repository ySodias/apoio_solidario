package Apoio_solidario;

public class Apoiado extends Cadastro{

	private int idApoiado;
	private String nomedeUsuario;
	private  String mensagem_apoiado;
		
	public Apoiado (String nome, int idade, String email, String telefone, String cpf, int idApoiado, String nomedeUsuario, String mensagem_apoiado)
	{
		super(nome, idade, email, telefone, cpf);
		this.nomedeUsuario= nomedeUsuario;
		this.idApoiado=idApoiado;
		this.mensagem_apoiado = mensagem_apoiado;
	}

	public int getIdApoiado() {
		return idApoiado;
	}

	public void setIdApoiado(int idApoiado) {
		this.idApoiado = idApoiado;
	}

	public String getNomedeUsuario() {
		return nomedeUsuario;
	}

	public void setNomedeUsuario(String nomedeUsuario) {
		this.nomedeUsuario = nomedeUsuario;
	}

	public String getMensagem_apoiador() {
		return mensagem_apoiado;
	}

	public void setMensagem_apoiador(String mensagem_apoiado) {
		this.mensagem_apoiado = mensagem_apoiado;
	}


}

