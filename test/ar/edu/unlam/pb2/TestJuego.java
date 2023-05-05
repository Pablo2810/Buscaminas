package ar.edu.unlam.pb2;

import static org.junit.Assert.*;

import org.junit.Test;

public class TestJuego {
	@Test
	public void test() {
		Juego juego = new Juego("BUSCAMINAS");
		System.out.println("Bienvenido al "+juego.getNombre()+"!!!");
		juego.empezarJuego();
		String valEsp = "*";
		String valObt = juego.elegirCasillero(1, 1);
		assertEquals(valEsp, valObt);
	}

}
