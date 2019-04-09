import java.time.LocalDate;

public class Main {

	public static void main(String[] args) {
		Repositorio repo = new Repositorio();
		Utilizador u = new Utilizador("Manuel","Ativo");
        PropostaAquisicao propostaAquisicao = new PropostaAquisicao(LocalDate.now(),u,"Alice no Pais das Maravilhas");
        Livro l = new Livro("Programar em Java", "FCA");
        Copia c = new Copia(1, l);
        RequisicaoCompraCopia requisicaoCompraCopia = new RequisicaoCompraCopia("pendente", LocalDate.now(), "Oficio",l,u);
        Encomenda encomenda = new Encomenda(LocalDate.now(),requisicaoCompraCopia);
        EntradaNovoLivro entradaNovoLivro = new EntradaNovoLivro(LocalDate.now(),encomenda,c);
        repo.adicionaEntradaNovoLivro(entradaNovoLivro);
		Utilizador u1 = new Utilizador("Manuel","Ativo");
        PropostaAquisicao propostaAquisicao1 = new PropostaAquisicao(LocalDate.now(),u1, "Alice no Pais das Maravilhas");
        Livro l1 = new Livro("Programar em Java", "FCA");
        RequisicaoCompraCopia requisicaoCompraCopia1 = new RequisicaoCompraCopia("pendente", LocalDate.now(), "Oficio",l1,u1);
        Encomenda encomenda1 = new Encomenda(LocalDate.now(),requisicaoCompraCopia1);
        repo.adicionaEncomenda(encomenda1);
	}

}
