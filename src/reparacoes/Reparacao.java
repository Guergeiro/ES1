package reparacoes;

import java.time.LocalDate;

public class Reparacao {
  // Attributes
  private LocalDate data;
  private Orcamento orcamento;
  
  // Constructor
  public Reparacao(LocalDate data, Orcamento orcamento) {
    this.data = data;
    this.orcamento = orcamento;
  }

  // Getters & Setters
  public LocalDate getData() {
    return data;
  }

  public void setData(LocalDate data) {
    this.data = data;
  }

  public Orcamento getOrcamento() {
    return orcamento;
  }

  public void setOrcamento(Orcamento orcamento) {
    this.orcamento = orcamento;
  }
}
