package datos;

public class Telepeaje extends Peaje{
	
	private int idTelepeaje;
	private String lector;
	private Rodado rodado;
	
	public Telepeaje() {}
	public Telepeaje(String lector) {
		this.lector = lector;
	}
	public int getIdTelepeaje() {
		return idTelepeaje;
	}
	protected void setIdTelepeaje(int idTelepeaje) {
		this.idTelepeaje = idTelepeaje;
	}
	public String getLector() {
		return lector;
	}
	public void setLector(String lector) {
		this.lector = lector;
	}

	public Rodado getRodado() {
		return rodado;
	}
	public void setRodado(Rodado rodado) {
		this.rodado = rodado;
	}
	@Override
	public String toString() {
		return "Telepeaje [idTelepeaje=" + idTelepeaje + ", lector=" + lector +  "]";
	}
	
	
}
