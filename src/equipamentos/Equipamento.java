package equipamentos;

public class Equipamento {
  // Attributes
  private String nome;
  private Integer ID;
  private TipoEquipamento tipoEquipamento;

  // Constructor
  public Equipamento(String nome, Integer ID, TipoEquipamento tipoEquipamento) {
    this.nome = nome;
    this.ID = ID;
    this.tipoEquipamento = tipoEquipamento;
  }

  // Getters & Setters
  public String getNome() {
    return nome;
  }

  public void setNome(String nome) {
    this.nome = nome;
  }

  public Integer getID() {
    return ID;
  }

  public void setID(Integer iD) {
    ID = iD;
  }

  public TipoEquipamento getTipoEquipamento() {
    return tipoEquipamento;
  }

  public void setTipoEquipamento(TipoEquipamento tipoEquipamento) {
    this.tipoEquipamento = tipoEquipamento;
  }
}
