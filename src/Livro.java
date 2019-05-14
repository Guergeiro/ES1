public class Livro {
  // Attributes
  private String titulo, editora;

  // Constructor
  public Livro(String titulo, String editora) {
    this.titulo = titulo;
    this.editora = editora;
  }

  // Get & Set
  public String getTitulo() {
    return titulo;
  }

  public void setTitulo(String titulo) {
    this.titulo = titulo;
  }

  public String getEditora() {
    return editora;
  }

  public void setEditora(String editora) {
    this.editora = editora;
  }
}
