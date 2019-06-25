package reparacoes;

import java.time.LocalDate;
import equipamentos.Equipamento;
import utilizadores.Utilizador;

public class PedidoReparacao {
  // Attributes
  private LocalDate data;
  private Utilizador utilizador;
  private Equipamento equipamento;
  private String descricao;

  // Constructor
  public PedidoReparacao(LocalDate data, Utilizador utilizador, Equipamento equipamento,
      String descricao) {
    this.data = data;
    this.utilizador = utilizador;
    this.equipamento = equipamento;
    this.descricao = descricao;
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

  public Equipamento getEquipamento() {
    return equipamento;
  }

  public void setEquipamento(Equipamento equipamento) {
    this.equipamento = equipamento;
  }

  public String getDescricao() {
    return descricao;
  }

  public void setDescricao(String descricao) {
    this.descricao = descricao;
  }
}
