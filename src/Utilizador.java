
public class Utilizador {
	// Atributes
	private String nome, estado;
	private TipoUtilizador tipoUtilizador;
	
	// Constructor
	public Utilizador(String nome, String estado) {
		this.nome = nome;
		this.estado = estado;
	}

	// Gets & Sets
	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getEstado() {
		return estado;
	}

	public void setEstado(String estado) {
		this.estado = estado;
	}

	public TipoUtilizador getTipoUtilizador() {
		return tipoUtilizador;
	}

	public void setTipoUtilizador(TipoUtilizador tipoUtilizador) {
		this.tipoUtilizador = tipoUtilizador;
	}
}
