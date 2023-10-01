package model;

public class Pessoa {

	public String Nome;
	public int Idade;
	public float Altura;
	
	public Pessoa(String Nome, int Idade, float Altura) {
		this.Nome = Nome;
		this.Idade = Idade;
		this.Altura = Altura;
	}
	
	public Pessoa() {
		super();
	}

	@Override
	public String toString() {
		return "Pessoa [Nome=" + Nome + ", Idade=" + Idade + ", Altura=" + Altura + "]";
	}
	
	

}
