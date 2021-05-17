package datos;

public class Manual extends Peaje {
	
	private int idManual;
	private String codCabina;
	
	public Manual() {}
	public Manual (String codCabina) {
		this.codCabina = codCabina;
	}
	public int getIdManual() {
		return idManual;
	}
	protected void setIdManual(int idManual) {
		this.idManual = idManual;
	}
	public String getCodCabina() {
		return codCabina;
	}
	public void setCodCabina(String codCabina) {
		this.codCabina = codCabina;
	}
	@Override
	public String toString() {
		return "Manual [idManual=" + idManual + ", codCabina=" + codCabina + "]";
	}
	
	
	
}
