package com.curso.Aeropuerto.domain;

public class Ave extends Animal implements ObjetoVolador{

	@Override
	public void despegar() {
		// TODO Auto-generated method stub
		System.out.println("Ha hechado a volar");
	}

	@Override
	public void aterrizar() {
		// TODO Auto-generated method stub
		System.out.println("Aterriza con elegancia");
	}

	@Override
	public void volar() {
		// TODO Auto-generated method stub
		System.out.println("Bate las alas para volar");
	}
	
	public void hacerNido() {
		System.out.println("Esta haciendo un nido");
	}
	
	public void ponerHuevos() {
		System.out.println("Ha puesto huevos en el nido");
	}
	
	@Override
	public void comer() {
		// TODO Auto-generated method stub
		System.out.println("Come alpiste");
	}
	
	
	

}
