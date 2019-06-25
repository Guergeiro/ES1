package compraLivros;
import java.time.LocalDate;
import livros.Livro;
import utilizadores.Utilizador;

public class RequisicaoCompraLivro extends RequisicaoCompra {
  // Attributes
  private PropostaAquisicao propostaAquisicao;

  // Constructor
  public RequisicaoCompraLivro(String estado, LocalDate data, String oficio,
      PropostaAquisicao propostaAquisicao, Livro livro, Utilizador utilizador) {
    super(estado, data, oficio, livro, utilizador);
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
