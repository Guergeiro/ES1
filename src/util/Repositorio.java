package util;
import compraLivros.Encomenda;
import compraLivros.EntradaNovoLivro;
import compraLivros.PropostaAquisicao;
import compraLivros.RequisicaoCompra;
import emprestimos.Coima;
import emprestimos.Devolucao;
import emprestimos.Emprestimo;
import emprestimos.Notificacao;
import emprestimos.Requisicao;
import livros.Copia;
import livros.Livro;
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
}
