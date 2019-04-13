package veicolo;


public class Veicolo {

	protected String modello;
	protected String marca;
	protected String targa;
	protected int anno;
	protected int assi;
	protected double tariffa;
	protected double peso;
	protected double altezza;
	

/*
 * Al costruttore non sono stati passati dei parametri in modo che sia impossibile
 * generare un oggetto di tipo Veicolo generico.
*/
	
	
	public Veicolo() {}

	

	public String getModello() {
		return modello;
	}


	public String getMarca() {
		return marca;
	}


	public String getTarga() {
		return targa;
	}


	public int getAnno() {
		return anno;
	}


	public int getAssi() {
		return assi;
	}

	public double getTariffa() {
		return tariffa;
	}

	public double getPeso() {
		return peso;
	}


	public double getAltezza() {
		return altezza;
	}
	
	
} //end-of-class Veicolo



