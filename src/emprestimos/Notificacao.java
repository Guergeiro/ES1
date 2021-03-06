package emprestimos;
import java.time.LocalDate;

public class Notificacao {
  // Atributes
  private LocalDate data;
  private Emprestimo emprestimo;

  // Constructor
  public Notificacao(LocalDate data, Emprestimo emprestimo) {
    this.data = data;
    this.emprestimo = emprestimo;
  }

  // Getters & Setters
  public LocalDate getData() {
    return data;
  }

  public void setData(LocalDate data) {
    this.data = data;
  }

  public Emprestimo getEmprestimo() {
    return emprestimo;
  }

  public void setEmprestimo(Emprestimo emprestimo) {
    this.emprestimo = emprestimo;
  }
}
