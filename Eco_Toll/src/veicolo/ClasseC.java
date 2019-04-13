package veicolo;

/*
 * 
 *  Veicoli pesanti con 3 assi.
 *  
 */

public class ClasseC extends Veicolo {
	
	public ClasseC (String m, String mrc, String t, int a, int as,double tar, double p, double h) {
		
			this.modello = m;
			this.marca = mrc;
			this.targa = t;
			this.anno = a;
			this.assi = 3;
			this.tariffa=0.6;
			this.peso = p;
			this.altezza = h;	
			
			if(as!=3) {
				System.out.println("Il numero di assi è stato settato a 3 perché il veicolo è di classe C");
			}
	}
	
}
