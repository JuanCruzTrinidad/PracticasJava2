package test;

import java.time.LocalDate;
import java.util.List;

import datos.Abonado;
import datos.Manual;
import datos.Rodado;
import datos.Telepeaje;
import negocio.AbonadoABM;
import negocio.PeajeABM;
import negocio.RodadoABM;

public class TestFinal {
	public static void main(String[] args) {

	PeajeABM peajeABM = new PeajeABM();
	RodadoABM rodadoABM = new RodadoABM();
	AbonadoABM abonadoABM = new AbonadoABM();
	
	// Traer e imprimir todos los peajes manuales
	List<Manual> manuales = peajeABM.traerManual();
	System.out.println("Ejercicio 1");
	for ( Manual manual : manuales) {
		System.out.println(manual);
	}
	
	//  Traer e imprimir todos los Telepeajes
	List<Telepeaje> telepajes = peajeABM.traerTelepeaje();
	System.out.println("Ejercicio 2");
	for ( Telepeaje telepeaje : telepajes) {
		System.out.println(telepeaje);
	}
	
	// Traer e imprimir los peajes Manual de fecha=2020-11-01
	LocalDate fecha = LocalDate.of(2020,  11, 1);
	List<Manual> manualesxFecha = peajeABM.traerManual(fecha);
	System.out.println("Ejercicio 3");
	for ( Manual manual : manualesxFecha) {
		System.out.println(manual);
	}
	
	// Calcular e imprimir el total de caja por los peajes manuales del día=2020-11-01
	double total = peajeABM.cerrarCaja(fecha);
	System.out.println("Ejercicio 4");
	System.out.println(total);
	
	// Traer e imprimir rodado dominio=AAA111
	Rodado rodado = rodadoABM.traerRodeado("AAA111");
	System.out.println("Ejercicio 5");
	System.out.println(rodado);
	
	//Traer e imprimir telepeajes rodado= dominio=AAA111
	List<Telepeaje> telepeajesxRodado = peajeABM.traerTelepeaje(rodado);
	System.out.println("Ejercicio 6");
	for(Telepeaje t: telepeajesxRodado) {
		System.out.println(t);
		System.out.println("Descuento otorgado:"+ t.calcularDescuento(10) );
	}
	
	// Traer e imprimir abonado con dni=11111111
	Abonado abonado = abonadoABM.traerAbonado(11111111);
	System.out.println("Ejercicio 7");
	System.out.println(abonado);
	
	//Traer e imprimir telepeajes abonado 
	System.out.println("Ejercicio 8");
	List<Telepeaje> telepeajesxAbonado = peajeABM.traerTelepeaje(abonado);
	for(Telepeaje t: telepeajesxAbonado) {
		System.out.println(t);
		System.out.println("Descuento otorgado:"+ t.calcularDescuento(10) );
	}
}
}
