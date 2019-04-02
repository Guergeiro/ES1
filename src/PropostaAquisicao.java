import java.time.LocalDate;

public class PropostaAquisicao {
	// Attributes
	private LocalDate data;
	private Utilizador utilizador;
	
	// Constructor
	public PropostaAquisicao(LocalDate data, Utilizador utilizador) {
		this.data = data;
		this.utilizador = utilizador;
	}

	// Getters & Setters
	public LocalDate getData() {
		return data;
	}

	public void setData(LocalDate data) {
		this.data = data;
	}

	public Utilizador getUtilizador() {
		return utilizador;
	}

	public void setUtilizador(Utilizador utilizador) {
		this.utilizador = utilizador;
	}
}
