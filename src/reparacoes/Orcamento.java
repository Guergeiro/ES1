package reparacoes;

import java.time.LocalDate;
import empresas.Empresa;

public class Orcamento {
  // Attributes
  private LocalDate data;
  private PropostaReparacao propostaReparacao;
  private Empresa empresa;
  private Integer valor;
  
  // Constructor
  public Orcamento(LocalDate data, PropostaReparacao propostaReparacao, Empresa empresa, Integer valor) {
    this.data = data;
    this.propostaReparacao = propostaReparacao;
    this.empresa = empresa;
    this.valor = valor;
  }

  // Getters & Setters
  public LocalDate getData() {
    return data;
  }

  public void setData(LocalDate data) {
    this.data = data;
  }

  public PropostaReparacao getPropostaReparacao() {
    return propostaReparacao;
  }

  public void setPropostaReparacao(PropostaReparacao propostaReparacao) {
    this.propostaReparacao = propostaReparacao;
  }

  public Empresa getEmpresa() {
    return empresa;
  }

  public void setEmpresa(Empresa empresa) {
    this.empresa = empresa;
  }

  public Integer getValor() {
    return valor;
  }

  public void setValor(Integer valor) {
    this.valor = valor;
  }
}
