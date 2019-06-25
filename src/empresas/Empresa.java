package empresas;

public class Empresa {
  // Attributes
  private String nome;
  private Integer NIF;
  private TipoEmpresa tipoEmpresa;

  // Constructor
  public Empresa(String nome, Integer NIF, TipoEmpresa tipoEmpresa) {
    this.nome = nome;
    this.NIF = NIF;
    this.tipoEmpresa = tipoEmpresa;
  }

  // Getters & Setters
  public String getNome() {
    return nome;
  }

  public void setNome(String nome) {
    this.nome = nome;
  }

  public Integer getNIF() {
    return NIF;
  }

  public void setNIF(Integer nIF) {
    NIF = nIF;
  }

  public TipoEmpresa getTipoEmpresa() {
    return tipoEmpresa;
  }

  public void setTipoEmpresa(TipoEmpresa tipoEmpresa) {
    this.tipoEmpresa = tipoEmpresa;
  }
}
