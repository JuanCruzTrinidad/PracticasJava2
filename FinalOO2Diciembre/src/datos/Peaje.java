package datos;

import java.time.DayOfWeek;
import java.time.LocalDate;
import java.time.LocalTime;

public  class Peaje {

	private int idPeaje;
	private LocalDate fecha;
	private LocalTime hora;
	private double precio;
	
	public Peaje() {}
	
	public Peaje(LocalDate fecha, LocalTime hora, double precio) {
		this.fecha = fecha;
		this.hora = hora;
		this.precio = precio;
	}

	public int getIdPeaje() {
		return idPeaje;
	}

	protected void setIdPeaje(int idPeaje) {
		this.idPeaje = idPeaje;
	}

	public LocalDate getFecha() {
		return fecha;
	}

	public void setFecha(LocalDate fecha) {
		this.fecha = fecha;
	}

	public LocalTime getHora() {
		return hora;
	}

	public void setHora(LocalTime hora) {
		this.hora = hora;
	}

	public double getPrecio() {
		return precio;
	}

	public void setPrecio(double precio) {
		this.precio = precio;
	}
	
	public double calcularDescuento(double porcentajeDescuento) {
		double totalDescontado = 0;
		DayOfWeek day = this.fecha.getDayOfWeek();
		LocalTime hora = this.hora.plusHours(3);
		if((day == DayOfWeek.SATURDAY && day == DayOfWeek.SUNDAY) ||(hora.isBefore(LocalTime.of(7, 0)) || hora.isAfter(LocalTime.of(19, 0)))) {
			totalDescontado = this.precio * (porcentajeDescuento/100);
		}
		return totalDescontado;
	}

	@Override
	public String toString() {
		return "Peaje [idPeaje=" + idPeaje + ", fecha=" + fecha + ", hora=" + hora + ", precio=" + precio + "]";
	}
	
	
}
