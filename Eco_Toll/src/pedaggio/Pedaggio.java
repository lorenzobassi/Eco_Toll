package pedaggio;
import interfaces.*;
import veicolo.*;
import casello.*;

public class Pedaggio implements PedaggioInterface {
	

	public double CalcoloPedaggio (Veicolo a, Casello x,Casello y) {
	
		double costo;
		double tar = a.getTariffa();
		int km=x.kmPercorsi(y);
		
		double c= (km * tar);
		costo= (c +(0.22*c)); //calcolo dell'iva al 22%
	
		
		System.out.print("Il costo del pedaggio è: " + Math.round(costo*10.0)/10.0);
		/* La moltiplicazione e la divisione per 10.0 serve per arrotondare al centesimo.*/
		System.out.print( (" euro."));    
		return costo;
	
	}
	
}
