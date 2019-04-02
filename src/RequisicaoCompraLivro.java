import java.time.LocalDate;

public class RequisicaoCompraLivro extends RequisicaoCompra {
	// Attributes
	private PropostaAquisicao propostaAquisicao;
	
	// Constructor
	public RequisicaoCompraLivro(String estado, LocalDate data, String oficio, PropostaAquisicao propostaAquisicao) {
		super(estado, data, oficio);
		this.propostaAquisicao = propostaAquisicao;
	}

	// Getters & Setters
	public PropostaAquisicao getPropostaAquisicao() {
		return propostaAquisicao;
	}

	public void setPropostaAquisicao(PropostaAquisicao propostaAquisicao) {
		this.propostaAquisicao = propostaAquisicao;
	}
}
