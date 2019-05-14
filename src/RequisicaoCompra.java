import java.time.LocalDate;

public abstract class RequisicaoCompra {
  // Attributes
  private String estado, oficio;
  private LocalDate data;
  private Livro livro;
  private Utilizador utilizador;

  // Constructor
  public RequisicaoCompra(String estado, LocalDate data, String oficio, Livro livro,
      Utilizador utilizador) {
    this.estado = estado;
    this.data = data;
    this.oficio = oficio;
    this.livro = livro;
    this.utilizador = utilizador;
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

  public Livro getLivro() {
    return livro;
  }

  public void setLivro(Livro livro) {
    this.livro = livro;
  }

  public Utilizador getUtilizador() {
    return utilizador;
  }

  public void setUtilizador(Utilizador utilizador) {
    this.utilizador = utilizador;
  }
}
