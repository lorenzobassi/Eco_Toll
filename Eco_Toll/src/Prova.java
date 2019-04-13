import casello.Casello;
import casello.DistanzaErrata;
import veicolo.*;
import pedaggio.*;

public class Prova {

	public static void main(String[] args) throws AltezzaErrata, DistanzaErrata, NumeroAssi {
				
		
		ClasseA	auto= new ClasseA("Fiesta","Ford","AA001AA",2016,2,0.2,900,1.2);
		ClasseB bus= new ClasseB("Fiorino","Fiat","BB001BB",2010,2,0.4,1.5,1.7);
		ClasseC autocarro= new ClasseC("Eurocargo","Iveco","CC001CC",2009,3,0.6,1.9,2);
		ClasseD autotreno= new ClasseD("Magnum","Renault","DD001DD",2011,4,0.8,3.5,3);
		ClasseE autoarticolato= new ClasseE("Cv","Scania","EE0001EE",2000,5,1,4,3);
		
		
		
		
		Casello x= new Casello("Roma",150);
		Casello y =new Casello("Carsoli",108);
		Casello z= new Casello("L'Aquila ovest",57);
		Casello k= new Casello ("L'Aquila est", 51);
		Casello w= new Casello("Teramo",11);
		
		
		Pedaggio a=new Pedaggio();
		
		
		/*Calcolo pedaggio per veicolo di classe A*/
		System.out.println("La "+ auto.getMarca()+ " " + auto.getModello()+ " targata "+ auto.getTarga() + 
							" ha percorso una distanza di " + x.kmPercorsi(y)+ " km da "+ x.getNome() + " a " +
							 y.getNome() + ".");
		a.CalcoloPedaggio(auto, x, y);
		System.out.println("");
		System.out.println("");
		
		
		/*Calcolo pedaggio per veicolo di classe B*/
		System.out.println("Il "+ bus.getModello()+ " della " + bus.getMarca()+ " targato "+ bus.getTarga() + 
							" ha percorso una distanza di " + x.kmPercorsi(z)+ " km da "+ x.getNome() + " a " +
							z.getNome() + ".");
		a.CalcoloPedaggio(bus, x, z);
		System.out.println("");
		System.out.println("");
		
		
		/*Calcolo pedaggio per veicolo di classe C*/
		System.out.println("L' "+ autocarro.getModello()+ " della " + autocarro.getMarca()+ " targato "+ autocarro.getTarga() + 
							" ha percorso una distanza di " + y.kmPercorsi(z)+ " km da "+ y.getNome() + " a " +
							z.getNome() + ".");
		a.CalcoloPedaggio(autocarro, y, z);
		System.out.println("");
		System.out.println("");
		
		
		/*Calcolo pedaggio per veicolo di classe D*/
		System.out.println("Il "+ autotreno.getModello()+ " della " + autotreno.getMarca()+ " targato "+ autotreno.getTarga() + 
							" ha percorso una distanza di " + k.kmPercorsi(w)+ " km da "+ k.getNome() + " a " +
							w.getNome() + ".");
		a.CalcoloPedaggio(autotreno,k,w);
		System.out.println("");
		System.out.println("");
		
		
		/*Calcolo pedaggio per veicolo di classe E*/
		System.out.println("Il "+ autoarticolato.getModello()+ " della " + autoarticolato.getMarca()+ " targato "+ 
							autoarticolato.getTarga() + " ha percorso una distanza di " + 
							z.kmPercorsi(w)+ " km da "+ z.getNome() + " a " +	w.getNome() + ".");
		a.CalcoloPedaggio(autoarticolato,z,w);
		System.out.println("");
	
	}
}//end-of-main