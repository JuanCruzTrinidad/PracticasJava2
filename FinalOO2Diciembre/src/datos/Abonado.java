package datos;

import java.util.Set;

public class Abonado {

	private int idAbonado;
	private String apellido;
	private String nombres;
	private long dni;
	private Set<Rodado> rodados;
	
	public Abonado() {}
	public Abonado( String apellido, String nombres, long dni)
	{
		this.apellido = apellido;
		this.nombres = nombres;
		this.dni = dni;
	}
	
	public int getIdAbonado() {
		return idAbonado;
	}
	protected void setIdAbonado(int idAbonado) {
		this.idAbonado = idAbonado;
	}
	public String getApellido() {
		return apellido;
	}
	public void setApellido(String apellido) {
		this.apellido = apellido;
	}
	public String getNombres() {
		return nombres;
	}
	public void setNombres(String nombres) {
		this.nombres = nombres;
	}
	public long getDni() {
		return dni;
	}
	public void setDni(long dni) {
		this.dni = dni;
	}
	
	public Set<Rodado> getRodados() {
		return rodados;
	}
	public void setRodados(Set<Rodado> rodados) {
		this.rodados = rodados;
	}
	@Override
	public String toString() {
		return "Abonado [idAbonado=" + idAbonado + ", apellido=" + apellido + ", nombres=" + nombres + ", dni=" + dni
				+ "]";
	}
	
}
