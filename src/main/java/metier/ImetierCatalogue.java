package metier;

import java.util.List;

public interface ImetierCatalogue {
	
	public 	List<Supermarche> getSupermarcheParMotCle(String mc);
	public void addSupermarche(Supermarche s);

}
