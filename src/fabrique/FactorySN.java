package fabrique;

import classeAbstracte.Oriental;
import classeAbstracte.Reines;
import classeAbstracte.TroisFormage;
import pac1.Orientalsn;
import reine.ReineFR;
import reine.ReineSN;
import troisFormage.TroisFormageSN;

public class FactorySN extends Abstractfactory{

	@Override
	public Oriental createProduitOriental() {
		// TODO Auto-generated method stub
		return new Orientalsn();
	}

	@Override
	public Reines createProduitReines() {
		// TODO Auto-generated method stub
		return new ReineSN();
	}

	@Override
	public TroisFormage createProduitTroisFormage() {
		// TODO Auto-generated method stub
		return new TroisFormageSN();
	}

}
