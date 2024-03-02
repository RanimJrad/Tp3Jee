package Web;

import java.util.ArrayList;
import java.util.List;
import metier.Supermarche;

public class SupermarcheModele {
	private String motCle;
	List<Supermarche> Supermarches = new ArrayList<>();

	public String getMotCle() {
		return motCle;
	}

	public void setMotCle(String motCle) {
		this.motCle = motCle;
	}

	public List<Supermarche> getSupermarches() {
		return Supermarches;
	}

	public void setSupermarches(List<Supermarche> Supermarches) {
		this.Supermarches = Supermarches;
	}

}
