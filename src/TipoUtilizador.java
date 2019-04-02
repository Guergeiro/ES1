
public class TipoUtilizador {
	// Attributes
	private String descricao;
	private int prazoEmprestimo;
	
	// Constructor
	public TipoUtilizador(String descricao, int prazoEmprestimo) {
		this.descricao = descricao;
		this.prazoEmprestimo = prazoEmprestimo;
	}

	// Get & Set
	public String getDescricao() {
		return descricao;
	}

	public void setDescricao(String descricao) {
		this.descricao = descricao;
	}

	public int getPrazoEmprestimo() {
		return prazoEmprestimo;
	}

	public void setPrazoEmprestimo(int prazoEmprestimo) {
		this.prazoEmprestimo = prazoEmprestimo;
	}
}
