package util;

import java.util.ArrayList;
import java.util.HashMap;
import compraLivros.Encomenda;
import compraLivros.EntradaNovoLivro;
import compraLivros.PropostaAquisicao;
import compraLivros.RequisicaoCompra;
import empresas.Empresa;
import empresas.TipoEmpresa;
import emprestimos.Coima;
import emprestimos.Devolucao;
import emprestimos.Emprestimo;
import emprestimos.Notificacao;
import emprestimos.Requisicao;
import equipamentos.Equipamento;
import equipamentos.TipoEquipamento;
import livros.Copia;
import livros.Livro;
import reparacoes.Faturacao;
import reparacoes.Orcamento;
import reparacoes.PedidoReparacao;
import reparacoes.PropostaReparacao;
import reparacoes.Reparacao;
import utilizadores.TipoUtilizador;
import utilizadores.Utilizador;

public class RepositorioMem implements Repositorio {
  // Atributes
  private ArrayList<Coima> lista_coima = new ArrayList<>();
  private ArrayList<Copia> lista_copia = new ArrayList<>();
  private ArrayList<Devolucao> lista_devolucao = new ArrayList<>();
  private HashMap<Requisicao, Emprestimo> map_emprestimo = new HashMap<>();
  private ArrayList<Livro> lista_livro = new ArrayList<>();
  private ArrayList<Notificacao> lista_notificacao = new ArrayList<>();
  private ArrayList<Requisicao> lista_requisicao = new ArrayList<>();
  private ArrayList<TipoUtilizador> lista_tipoUtilizador = new ArrayList<>();
  private ArrayList<Utilizador> lista_utilizador = new ArrayList<>();
  private ArrayList<EntradaNovoLivro> lista_entradaNovoLivro = new ArrayList<>();
  private ArrayList<Encomenda> lista_encomenda = new ArrayList<>();
  private ArrayList<RequisicaoCompra> lista_requisicaoCompra = new ArrayList<>();
  private ArrayList<PropostaAquisicao> lista_propostaAquisicao = new ArrayList<>();

  // Implemented Attributes
  private ArrayList<TipoEquipamento> lista_tipoEquipamento = new ArrayList<>();
  private ArrayList<Equipamento> lista_equipamento = new ArrayList<>();
  private ArrayList<TipoEmpresa> lista_tipoEmpresa = new ArrayList<>();
  private ArrayList<Empresa> lista_empresa = new ArrayList<>();
  private ArrayList<PedidoReparacao> lista_pedidoReparacao = new ArrayList<>();
  private ArrayList<PropostaReparacao> lista_propostaReparacao = new ArrayList<>();
  private ArrayList<Orcamento> lista_orcamento = new ArrayList<>();
  private ArrayList<Reparacao> lista_reparacao = new ArrayList<>();
  private ArrayList<Faturacao> lista_faturacao = new ArrayList<>();

  // Methods
  public void adicionaCoima(Coima coima) {
    lista_coima.add(coima);
  }

  public void adicionaCopia(Copia copia) {
    lista_copia.add(copia);
  }

  public void adicionaDevolucao(Devolucao devolucao) {
    lista_devolucao.add(devolucao);
  }

  public void adicionaEmprestimo(Emprestimo emprestimo) {
    map_emprestimo.put(emprestimo.getRequisicao(), emprestimo);
  }

  public void adicionaEncomenda(Encomenda encomenda) {
    lista_encomenda.add(encomenda);
  }

  public void adicionaEntradaNovoLivro(EntradaNovoLivro entradaNovoLivro) {
    lista_entradaNovoLivro.add(entradaNovoLivro);
  }

  public void adicionaLivro(Livro livro) {
    lista_livro.add(livro);
  }

  public void adicionaNotificacao(Notificacao notificacao) {
    lista_notificacao.add(notificacao);
  }

  public void adicionaPropostaRequisicao(PropostaAquisicao proposta) {
    lista_propostaAquisicao.add(proposta);
  }

  public void adicionaRequisicao(Requisicao requisicao) {
    lista_requisicao.add(requisicao);
  }

  public void adicionaRequisicaoCompra(RequisicaoCompra requisicaoCompra) {
    lista_requisicaoCompra.add(requisicaoCompra);
  }

  public void adicionaTipoUtilizador(TipoUtilizador tipo) {
    lista_tipoUtilizador.add(tipo);
  }

  public void adicionaUtilizador(Utilizador utilizador) {
    lista_utilizador.add(utilizador);
  }

  public Emprestimo devolveEmprestimoDaRequisicao(Requisicao r) {
    return map_emprestimo.get(r);
  }

  // Implemented methods
  public void adicionaTipoEquipamento(TipoEquipamento tipoEquipamento) {
    lista_tipoEquipamento.add(tipoEquipamento);
  }

  public void adicionaEquipamento(Equipamento equipamento) {
    lista_equipamento.add(equipamento);
  }

  public void adicionaTipoEmpresa(TipoEmpresa tipoEmpresa) {
    lista_tipoEmpresa.add(tipoEmpresa);
  }

  public void adicionaEmpresa(Empresa empresa) {
    lista_empresa.add(empresa);
  }

  public void adicionaPedidoReparacao(PedidoReparacao pedidoReparacao) {
    lista_pedidoReparacao.add(pedidoReparacao);
  }

  public void adicionaPropostaReparacao(PropostaReparacao propostaReparacao) {
    lista_propostaReparacao.add(propostaReparacao);
  }

  public void adicionaOrcamento(Orcamento orcamento) {
    lista_orcamento.add(orcamento);
  }

  public void adicionaReparacao(Reparacao reparacao) {
    lista_reparacao.add(reparacao);
  }

  public void adicionarFaturacao(Faturacao faturacao) {
    lista_faturacao.add(faturacao);
  }

}
