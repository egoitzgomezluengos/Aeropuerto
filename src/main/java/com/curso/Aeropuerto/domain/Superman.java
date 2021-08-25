package com.curso.Aeropuerto.domain;

public class Superman extends Kriptoniano implements ObjetoVolador {

	@Override
	public void despegar() {
		// TODO Auto-generated method stub
		System.out.println("Despego de un salto");
	}

	@Override
	public void aterrizar() {
		// TODO Auto-generated method stub
		System.out.println("Aterrizo de pies");
	}

	@Override
	public void volar() {
		// TODO Auto-generated method stub
		System.out.println("Vuelo con capa");
	}
	
	public void saltarEdificio() {
		System.out.println("He saltado un edificio");
	}
	
	public void detenerBala() {
		System.out.println("He detenido una bala");
	}
	
	@Override
	public void comer() {
		// TODO Auto-generated method stub
		System.out.println("Como de todo");
	}

}
