package fabrique;

import classeAbstracte.Oriental;
import classeAbstracte.Reines;
import classeAbstracte.TroisFormage;
import pac1.Orientalfr;
import reine.ReineFR;
import troisFormage.TroisFormageFR;

public class FactoryFR extends Abstractfactory{

	@Override
	public Oriental createProduitOriental() {
		// TODO Auto-generated method stub
		return new Orientalfr();
	}

	@Override
	public Reines createProduitReines() {
		// TODO Auto-generated method stub
		return new ReineFR();
	}

	@Override
	public TroisFormage createProduitTroisFormage() {
		// TODO Auto-generated method stub
		return new TroisFormageFR();
	}

}
