package compraLivros;
import java.time.LocalDate;
import livros.Livro;
import utilizadores.Utilizador;

public class RequisicaoCompraCopia extends RequisicaoCompra {
  // Constructor
  public RequisicaoCompraCopia(String estado, LocalDate data, String oficio, Livro livro,
      Utilizador utilizador) {
    super(estado, data, oficio, livro, utilizador);
  }
}
