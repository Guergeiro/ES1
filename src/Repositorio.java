import java.util.ArrayList;

public class Repositorio {
	// Atributes
	private ArrayList<Coima> lista_coima;
	private ArrayList<Copia> lista_copia;
	private ArrayList<Devolucao> lista_devolucao;
	private ArrayList<Emprestimo> lista_emprestimo;
	private ArrayList<Livro> lista_livro;
	private ArrayList<Notificacao> lista_notificacao;
	private ArrayList<Requisicao> lista_requisicao;
	private ArrayList<TipoUtilizador> lista_tipoUtilizador;
	private ArrayList<Utilizador> lista_utilizador;

	// Constructor
	public Repositorio() {
		this.lista_coima = new ArrayList<>();
		this.lista_copia = new ArrayList<>();
		this.lista_devolucao = new ArrayList<>();
		this.lista_emprestimo = new ArrayList<>();
		this.lista_livro = new ArrayList<>();
		this.lista_notificacao = new ArrayList<>();
		this.lista_requisicao = new ArrayList<>();
		this.lista_tipoUtilizador = new ArrayList<>();
		this.lista_utilizador = new ArrayList<>();
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
		lista_emprestimo.add(emprestimo);
	}

	public void adicionaLivro(Livro livro) {
		lista_livro.add(livro);
	}

	public void adicionaNotificacao(Notificacao notificacao) {
		lista_notificacao.add(notificacao);
	}

	public void adicionaRequisicao(Requisicao requisicao) {
		lista_requisicao.add(requisicao);
	}
	
	public void adicionaTipoUtilizador(TipoUtilizador tipo) {
		lista_tipoUtilizador.add(tipo);
	}
	
	public void adicionaUtilizador(Utilizador utilizador) {
		lista_utilizador.add(utilizador);
	}
	
	public Emprestimo devolveEmprestimoDaRequisicao(Requisicao r) {
		for (Emprestimo emprestimo : lista_emprestimo) {
			if (emprestimo.getRequisicao().equals(r)) {
				return emprestimo;
			}
		}
		return null;
	}
}
