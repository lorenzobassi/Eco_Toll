package veicolo;

/*
 * 
 *  Veicoli pesanti con 4 assi.
 *  
 */

public class ClasseD extends Veicolo {

	public ClasseD (String m, String mrc, String t, int a, int as,double tar, double p, double h) {
		
		this.modello = m;
		this.marca = mrc;
		this.targa = t;
		this.anno = a;
		this.assi = 4;
		this.tariffa=0.8;
		this.peso = p;
		this.altezza = h;	
		
		if(as!=4) {
			System.out.println("Il numero di assi è stato settato a 4 perché il veicolo è di classe D");
		}
	}

}
