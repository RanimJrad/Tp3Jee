package metier;

import java.util.List;

public class TestMetier {
	public static void main(String[] args) {
		MetierImpl metier = new MetierImpl();
		List<Supermarche> supers = metier.getSupermarcheParMotCle("Az");
		for (Supermarche s : supers)
			System.out.println(s.getNomSupermarche());
	}
}