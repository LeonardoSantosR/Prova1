package exercicio2;


public class Motorista {
	private String nome;
	private String placa;
	
	public Motorista(String nome, String placa) {
		this.nome = nome;
		this.placa = placa;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getPlaca() {
		return placa;
	}

	public void setPlaca(String placa) {
		this.placa = placa;
	}	
}
