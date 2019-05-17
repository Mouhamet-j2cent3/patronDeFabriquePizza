package fabrique;

import classeAbstracte.Oriental;
import classeAbstracte.Reines;
import classeAbstracte.TroisFormage;

public abstract class Abstractfactory {
	
	
	public static Abstractfactory getFactory(String pizza){
		Abstractfactory factory;
		if(pizza.equals("fr")){
			factory = new FactoryFR();
		}else if(pizza.equals("SN")){
			factory = new FactorySN();
		}
		else{
			factory = new FactoryUS();
		}
		return factory;
	}
	
	public abstract Oriental createProduitOriental();
	public abstract Reines createProduitReines();
	public abstract TroisFormage createProduitTroisFormage();

	
}
