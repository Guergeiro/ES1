package util;
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

public interface Repositorio {
  // Methods
  public void adicionaCoima(Coima coima);

  public void adicionaCopia(Copia copia);

  public void adicionaDevolucao(Devolucao devolucao);

  public void adicionaEmprestimo(Emprestimo emprestimo);

  public void adicionaEncomenda(Encomenda encomenda);

  public void adicionaEntradaNovoLivro(EntradaNovoLivro entradaNovoLivro);

  public void adicionaLivro(Livro livro);

  public void adicionaNotificacao(Notificacao notificacao);

  public void adicionaPropostaRequisicao(PropostaAquisicao proposta);

  public void adicionaRequisicao(Requisicao requisicao);

  public void adicionaRequisicaoCompra(RequisicaoCompra requisicaoCompra);

  public void adicionaTipoUtilizador(TipoUtilizador tipo);

  public void adicionaUtilizador(Utilizador utilizador);

  public Emprestimo devolveEmprestimoDaRequisicao(Requisicao r);
  
  // Implemented methods
  public void adicionaTipoEquipamento(TipoEquipamento tipoEquipamento);
  
  public void adicionaEquipamento(Equipamento equipamento);
  
  public void adicionaTipoEmpresa(TipoEmpresa tipoEmpresa);
  
  public void adicionaEmpresa(Empresa empresa);
  
  public void adicionaPedidoReparacao(PedidoReparacao pedidoReparacao);
  
  public void adicionaPropostaReparacao(PropostaReparacao propostaReparacao);
  
  public void adicionaOrcamento(Orcamento orcamento);
  
  public void adicionaReparacao(Reparacao reparacao);
  
  public void adicionaFaturacao(Faturacao faturacao);
}
