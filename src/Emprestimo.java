import java.time.LocalDate;

public class Emprestimo {
	// Atributes
	private LocalDate data;
	private Requisicao requisicao;
	
	// Constructor
	public Emprestimo(LocalDate data, Requisicao requisicao) {
		this.data = data;
		this.requisicao = requisicao;
	}

	// Getters & Setters
	public LocalDate getData() {
		return data;
	}

	public void setData(LocalDate data) {
		this.data = data;
	}

	public Requisicao getRequisicao() {
		return requisicao;
	}

	public void setRequisicao(Requisicao requisicao) {
		this.requisicao = requisicao;
	}
}
