package compraLivros;
import java.time.LocalDate;
import livros.Copia;

public class EntradaNovoLivro {
  // Attributes
  private LocalDate data;
  private Encomenda encomenda;
  private Copia copia;

  // Constructor
  public EntradaNovoLivro(LocalDate data, Encomenda encomenda, Copia copia) {
    this.data = data;
    this.encomenda = encomenda;
    this.copia = copia;
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

  public Copia getCopia() {
    return copia;
  }

  public void setCopia(Copia copia) {
    this.copia = copia;
  }
}
