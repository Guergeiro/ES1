package reparacoes;

import java.time.LocalDate;
import java.util.ArrayList;
import empresas.Empresa;
import utilizadores.Utilizador;

public class PropostaReparacao {
  // Attributes
  private LocalDate data;
  private Utilizador funcionario;
  private PedidoReparacao pedidoReparacao;
  private ArrayList<Empresa> empresasDisponiveis;

  // Constructor
  public PropostaReparacao(LocalDate data, Utilizador funcionario, PedidoReparacao pedidoReparacao,
      ArrayList<Empresa> empresasDisponiveis) {
    this.data = data;
    this.funcionario = funcionario;
    this.pedidoReparacao = pedidoReparacao;
    this.empresasDisponiveis = empresasDisponiveis;
  }

  // Getters & Setters
  public LocalDate getData() {
    return data;
  }

  public void setData(LocalDate data) {
    this.data = data;
  }

  public Utilizador getFuncionario() {
    return funcionario;
  }

  public void setFuncionario(Utilizador funcionario) {
    this.funcionario = funcionario;
  }

  public PedidoReparacao getPedidoReparacao() {
    return pedidoReparacao;
  }

  public void setPedidoReparacao(PedidoReparacao pedidoReparacao) {
    this.pedidoReparacao = pedidoReparacao;
  }

  public ArrayList<Empresa> getEmpresasDisponiveis() {
    return empresasDisponiveis;
  }

  public void setEmpresasDisponiveis(ArrayList<Empresa> empresasDisponiveis) {
    this.empresasDisponiveis = empresasDisponiveis;
  }
}
