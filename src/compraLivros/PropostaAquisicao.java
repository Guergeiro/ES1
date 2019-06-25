package compraLivros;
import java.time.LocalDate;
import utilizadores.Utilizador;

public class PropostaAquisicao {
  // Attributes
  private LocalDate data;
  private Utilizador utilizador;
  private String infoLivro;

  // Constructor
  public PropostaAquisicao(LocalDate data, Utilizador utilizador, String infoLivro) {
    this.data = data;
    this.utilizador = utilizador;
    this.infoLivro = infoLivro;
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

  public String getInfoLivro() {
    return infoLivro;
  }

  public void setInfoLivro(String infoLivro) {
    this.infoLivro = infoLivro;
  }
}
