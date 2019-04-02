import java.util.ArrayList;
import java.util.HashMap;

public class Repositorio {
	// Atributes
	private ArrayList<Coima> lista_coima;
	private ArrayList<Copia> lista_copia;
	private ArrayList<Devolucao> lista_devolucao;
//	private ArrayList<Emprestimo> lista_emprestimo;
	private HashMap<Requisicao, Emprestimo> map_emprestimo;
	private ArrayList<Livro> lista_livro;
	private ArrayList<Notificacao> lista_notificacao;
	private ArrayList<Requisicao> lista_requisicao;
	private ArrayList<TipoUtilizador> lista_tipoUtilizador;
	private ArrayList<Utilizador> lista_utilizador;
	
	private ArrayList<EntradaNovoLivro> lista_entradaNovoLivro;
	private ArrayList<Encomenda> lista_encomenda;
	private ArrayList<RequisicaoCompra> lista_requisicaoCompra;
	private ArrayList<PropostaAquisicao> lista_propostaAquisicao;

	// Constructor
	public Repositorio() {
		this.lista_coima = new ArrayList<>();
		this.lista_copia = new ArrayList<>();
		this.lista_devolucao = new ArrayList<>();
//		this.lista_emprestimo = new ArrayList<>();
		this.map_emprestimo = new HashMap<>();
		this.lista_livro = new ArrayList<>();
		this.lista_notificacao = new ArrayList<>();
		this.lista_requisicao = new ArrayList<>();
		this.lista_tipoUtilizador = new ArrayList<>();
		this.lista_utilizador = new ArrayList<>();
		
		this.lista_entradaNovoLivro = new ArrayList<>();
		this.lista_encomenda = new ArrayList<>();
		this.lista_requisicaoCompra = new ArrayList<>();
		this.lista_propostaAquisicao = new ArrayList<>();
	}

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
//		lista_emprestimo.add(emprestimo);
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
//		for (Emprestimo emprestimo : lista_emprestimo) {
//			if (emprestimo.getRequisicao().equals(r)) {
//				return emprestimo;
//			}
//		}
//		return null;
	}
}
