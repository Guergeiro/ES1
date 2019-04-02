
public class Coima {
	// Atributes
	private String descricao;
	private float valor;
	private Devolucao devolucao;
	
	// Constructor
	public Coima(String descricao, float valor, Devolucao devolucao) {
		this.descricao = descricao;
		this.valor = valor;
		this.devolucao = devolucao;
	}

	// Getters & Setters
	public String getDescricao() {
		return descricao;
	}

	public void setDescricao(String descricao) {
		this.descricao = descricao;
	}

	public float getValor() {
		return valor;
	}

	public void setValor(float valor) {
		this.valor = valor;
	}

	public Devolucao getDevolucao() {
		return devolucao;
	}

	public void setDevolucao(Devolucao devolucao) {
		this.devolucao = devolucao;
	}
}
