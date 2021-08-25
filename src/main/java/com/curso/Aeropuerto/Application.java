package com.curso.Aeropuerto;

import com.curso.Aeropuerto.domain.Ave;
import com.curso.Aeropuerto.domain.Avion;
import com.curso.Aeropuerto.domain.ObjetoVolador;
import com.curso.Aeropuerto.domain.Superman;

public class Application
{
	public static void main( String[] args )
	{
		Ave ave = new Ave();
		Avion avion = new Avion();
		Superman superman = new Superman();
	
		Application aeropuerto = new Application();
		
		aeropuerto.permisoVolar(ave);
		aeropuerto.permisoVolar(avion);
		aeropuerto.permisoVolar(superman);
	}
	
	private void permisoVolar(ObjetoVolador v) {
		v.aterrizar();
	}
}