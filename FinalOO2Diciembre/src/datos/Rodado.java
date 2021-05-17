package datos;

import java.util.Set;

public class Rodado {

	private int idRodado;
	private String dominio;
	private int categoria;
	private Abonado abonado;
	private Set<Telepeaje> telepeajes;
	
	public Rodado() {}
	public Rodado(String dominio, int categoria, Abonado abonado) {
		this.abonado = abonado;
		this.dominio = dominio;
		this.categoria = categoria;
	}
	public int getIdRodado() {
		return idRodado;
	}
	protected void setIdRodado(int idRodado) {
		this.idRodado = idRodado;
	}
	public String getDominio() {
		return dominio;
	}
	public void setDominio(String dominio) {
		this.dominio = dominio;
	}
	public int getCategoria() {
		return categoria;
	}
	public void setCategoria(int categoria) {
		this.categoria = categoria;
	}
	public Abonado getAbonado() {
		return abonado;
	}
	public void setAbonado(Abonado abonado) {
		this.abonado = abonado;
	}
	
	@Override
	public String toString() {
		return "Rodado [idRodado=" + idRodado + ", dominio=" + dominio + ", categoria=" + categoria +"]";
	}
	public Set<Telepeaje> getTelepeajes() {
		return telepeajes;
	}
	public void setTelepeajes(Set<Telepeaje> telepeajes) {
		this.telepeajes = telepeajes;
	}
	
	
}
