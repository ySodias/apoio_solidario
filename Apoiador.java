package Apoio_solidario;

public class Apoiador extends Cadastro{
	private double avaliacao;

	private int idApoiador;
	private String mensagem_apoiador;
	
	public Apoiador (String nome, int idade, String email, String telefone, String cpf, double avaliacao, int idApoiador, String mensagem_apoiador)
	{
		super(nome, idade, email, telefone, cpf);
		this.avaliacao = avaliacao;
		this.idApoiador= idApoiador;
		this.mensagem_apoiador = mensagem_apoiador;
	}
	public int getIdApoiador() {
		return idApoiador;
	}
	public void setIdApoiador(int idApoiador) {
		this.idApoiador = idApoiador;
	}
	public String getMensagem_apoiador() {
		return mensagem_apoiador;
	}
	public void setMensagem_apoiador(String mensagem_apoiador) {
		this.mensagem_apoiador = mensagem_apoiador;
	}
	public double getAvaliacao(){
		return avaliacao;
	}

	public void setAvaliacao(double avaliacao){
		this.avaliacao = avaliacao;
	}

	public int getIdapoiador() {
		return idApoiador;
	}

	public void setIDapoiador(int idApoiador) {
		this.idApoiador = idApoiador;
	}


}
