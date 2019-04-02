import java.time.LocalDate;

public class EntradaNovoLivro {
	// Attributes
	private LocalDate data;
	private Encomenda encomenda;
	
	// Constructor
	public EntradaNovoLivro(LocalDate data, Encomenda encomenda) {
		this.data = data;
		this.encomenda = encomenda;
	}

	// Getters & Setters
	public LocalDate getData() {
		return data;
	}

	public void setData(LocalDate data) {
		this.data = data;
	}

	public Encomenda getEncomenda() {
		return encomenda;
	}

	public void setEncomenda(Encomenda encomenda) {
		this.encomenda = encomenda;
	}
}
