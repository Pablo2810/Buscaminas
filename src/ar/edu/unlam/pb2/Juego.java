package ar.edu.unlam.pb2;

public class Juego {
	private String nombre;
	private String matrizOculta[][];
	private String matrizVisible[][];
	private String resultado;
	
	public Juego(String nombre) {
		this.nombre = nombre;
		this.matrizOculta = new String[3][3];
		this.matrizVisible = new String[3][3];
	}
	
	//Elegir un casillero
	public String elegirCasillero(int fila, int columna) {
		this.matrizOculta[fila][columna] = this.matrizVisible[fila][columna];
		if (this.matrizOculta[fila][columna] == "*") {
			System.out.println("*****************************");
			this.imprimirMatriz();
			System.out.println("PERDISTE");
			return this.setResultado(this.matrizOculta[fila][columna]);
		} else {
			System.out.println("*****************************");
			this.imprimirMatriz();
			System.out.println("SIGUES JUGANDO");
			return this.setResultado(this.matrizOculta[fila][columna]);
		}
	}

	//Agregamos valores a la matriz
	public void empezarJuego() {
		this.matrizOculta[0][0] = "🔲";
		this.matrizOculta[0][1] = "🔲";
	    this.matrizOculta[0][2] = "🔲";
	    this.matrizOculta[1][0] = "🔲";
	    this.matrizOculta[1][1] = "🔲";
	    this.matrizOculta[1][2] = "🔲";
	    this.matrizOculta[2][0] = "🔲";
	    this.matrizOculta[2][1] = "🔲";
	    this.matrizOculta[2][2] = "🔲";
	    this.imprimirMatriz();
	    this.matrizVisible[0][0] = "1";
	    this.matrizVisible[0][0] = "1";
		this.matrizVisible[0][1] = "1";
	    this.matrizVisible[0][2] = "1";
	    this.matrizVisible[1][0] = "1";
	    this.matrizVisible[1][1] = "*";
	    this.matrizVisible[1][2] = "3";
	    this.matrizVisible[2][0] = "2";
	    this.matrizVisible[2][1] = "*";
	    this.matrizVisible[2][2] = "*";
	}
	
	//Metodo para imprimir la matriz
	public void imprimirMatriz() {
		for (int i = 0; i < matrizOculta.length; i++) {
			for (int j = 0; j < matrizOculta[i].length; j++) {
				System.out.print(matrizOculta[i][j]+" ");
			}
			System.out.println();
		}
	}

	public String getNombre() {
		return this.nombre;
	}

	public String getResultado() {
		return resultado;
	}

	public String setResultado(String resultado) {
		return this.resultado = resultado;
	}
}
