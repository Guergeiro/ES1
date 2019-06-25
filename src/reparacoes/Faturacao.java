package reparacoes;

import java.time.LocalDate;

public class Faturacao {
  // Attributes
  private LocalDate data;
  private Reparacao reparacao;

  // Constructor
  public Faturacao(LocalDate data, Reparacao reparacao) {
    this.data = data;
    this.reparacao = reparacao;
  }

  // Getters & Setters
  public LocalDate getData() {
    return data;
  }

  public void setData(LocalDate data) {
    this.data = data;
  }

  public Reparacao getReparacao() {
    return reparacao;
  }

  public void setReparacao(Reparacao reparacao) {
    this.reparacao = reparacao;
  }
}
