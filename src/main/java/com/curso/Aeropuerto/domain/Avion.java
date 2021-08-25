package com.curso.Aeropuerto.domain;

public class Avion extends Vehiculo implements ObjetoVolador {

	public Avion(double cargaMaxima, String matricula) {
		super(cargaMaxima, matricula);
		// TODO Auto-generated constructor stub
	}

	public Avion() {
		super();
		// TODO Auto-generated constructor stub
	}

	@Override
	public void despegar() {
		// TODO Auto-generated method stub
		System.out.println("El avion a despegado");
	}

	@Override
	public void aterrizar() {
		// TODO Auto-generated method stub
		System.out.println("El avion a aterrizado");
	}

	@Override
	public void volar() {
		// TODO Auto-generated method stub
		System.out.println("Vuela gracias al motor");
	}

}
