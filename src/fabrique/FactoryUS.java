package fabrique;

import classeAbstracte.Oriental;
import classeAbstracte.Reines;
import classeAbstracte.TroisFormage;
import pac1.OrientalUsa;
import pac1.Orientalfr;
import reine.ReineUS;
import troisFormage.TroisFormageUS;

public class FactoryUS extends Abstractfactory {

	@Override
	public Oriental createProduitOriental() {
		// TODO Auto-generated method stub
		return new OrientalUsa();
	}

	@Override
	public Reines createProduitReines() {
		// TODO Auto-generated method stub
		return new ReineUS();
	}

	@Override
	public TroisFormage createProduitTroisFormage() {
		// TODO Auto-generated method stub
		return new TroisFormageUS();
	}

}
