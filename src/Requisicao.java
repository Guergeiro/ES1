import java.time.LocalDate;

public class Requisicao {
	// Attributes
	private Copia copia;
	private Utilizador utilizador;
	private LocalDate data;
	
	// Constructor
	public Requisicao(LocalDate data, Utilizador utilizador, Copia copia) {
		this.data = data;
		this.utilizador = utilizador;
		this.copia = copia;
	}

	// Gets & Sets
	public Copia getCopia() {
		return copia;
	}

	public void setCopia(Copia copia) {
		this.copia = copia;
	}

	public Utilizador getUtilizador() {
		return utilizador;
	}

	public void setUtilizador(Utilizador utilizador) {
		this.utilizador = utilizador;
	}

	public LocalDate getData() {
		return data;
	}

	public void setData(LocalDate data) {
		this.data = data;
	}
}
