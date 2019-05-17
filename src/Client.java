import java.util.Scanner;

import classeAbstracte.Oriental;
import classeAbstracte.Reines;
import classeAbstracte.TroisFormage;
import fabrique.Abstractfactory;
import fabrique.FactoryFR;

public class Client {
		public static void main(String[] args){
			
			//String pays ="fr";
			Scanner p = new Scanner(System.in);
			System.out.println("donner le pays:US, FR, SN");
			String pays = p.nextLine();
			
			Abstractfactory factory;
			factory = Abstractfactory.getFactory(pays);
			
			Reines reine = factory.createProduitReines();
			Oriental oriental = factory.createProduitOriental();
			TroisFormage formage = factory.createProduitTroisFormage();
			oriental.service();
			reine.service();
			formage.service();
			
			
		}
}

