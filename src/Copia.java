public class Copia {
  // Attributes
  private int id;
  private Livro livro;

  // Constructor
  public Copia(int id, Livro livro) {
    this.id = id;
    this.livro = livro;
  }

  // Gets & Sets
  public int getId() {
    return id;
  }

  public void setId(int id) {
    this.id = id;
  }

  public Livro getLivro() {
    return livro;
  }

  public void setLivro(Livro livro) {
    this.livro = livro;
  }
}
