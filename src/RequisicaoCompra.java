import java.time.LocalDate;

public abstract class RequisicaoCompra {
	// Attributes
	private String estado, oficio;
	private LocalDate data;
	
	// Constructor
	public RequisicaoCompra(String estado, LocalDate data, String oficio) {
		this.estado = estado;
		this.data = data;
		this.oficio = oficio;
	}
	
	// Getters & Setters
	public String getEstado() {
		return estado;
	}
	public void setEstado(String estado) {
		this.estado = estado;
	}
	public String getOficio() {
		return oficio;
	}
	public void setOficio(String oficio) {
		this.oficio = oficio;
	}
	public LocalDate getData() {
		return data;
	}
	public void setData(LocalDate data) {
		this.data = data;
	}
}
